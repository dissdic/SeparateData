package com.dissdic.separatedata.common.processor.postgresql;

import com.dissdic.separatedata.common.context.SeparateDataRuleAndDataSourceContext;
import com.dissdic.separatedata.common.meta.SeparateDataParsingResult;
import com.dissdic.separatedata.common.meta.SeparateDataTable;
import com.dissdic.separatedata.common.processor.postgresql.Select.SelectLexer;
import com.dissdic.separatedata.common.processor.postgresql.Select.SelectParser;
import com.dissdic.separatedata.common.processor.postgresql.Select.SelectVisitor;
import com.dissdic.separatedata.common.processor.postgresql.impl.SeparateDataSelectVisitorImpl;
import com.dissdic.separatedata.common.rule.SeparateDataTableRule;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.List;

public class SeparateDataSQLParser {

    private static final String INSERT = "INSERT";
    private static final String UPDATE = "UPDATE";
    private static final String DELETE = "DELETE";
    private static final String SELECT = "SELECT";

    private static final String whitespace = "\n\t\r ";

    private void eatWhitespace(String str){

        for (int i = 0; i < str.length(); i++) {
            if(isWhitespace(str.charAt(i))){
                continue;
            }
            str = str.substring(i);
        }
    }
    private boolean isWhitespace(char ws){
        return whitespace.indexOf(ws)!=-1;
    }

    private String operateSymbol(String sql){
        eatWhitespace(sql);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sql.length(); i++) {
            char ch = sql.charAt(i);
            if(!isWhitespace(ch)){
                sb.append(ch);
            }else{
                return sb.toString();
            }
        }
        return null;
    }

    public void parse(String sql){

        String operate = operateSymbol(sql);
        if(operate==null){return;}
        switch (operate.toUpperCase()){
            case SELECT:
                select(sql);
                break;
            case INSERT:
                insert(sql);
                break;
            case UPDATE:
                update(sql);
                break;
            case DELETE:
                delete(sql);
                break;
        }
    }

    public void select(String sql){

        SeparateDataParsingResult result = new SeparateDataParsingResult();
        SeparateDataVisitorContextHolder.SELECT.setParsingResultContext(result);

        SeparateDataSelectVisitorImpl visitor = new SeparateDataSelectVisitorImpl();
        SelectParser selectParser = selectParser(sql);

        selectParse(selectParser,visitor);

        System.out.println("解析完成");

        List<SeparateDataTable> involvedTables = SeparateDataVisitorContextHolder.SELECT.getParsingTableList();
        
        List<SeparateDataTableRule> tableRules = SeparateDataRuleAndDataSourceContext.getTableRules();
        for (SeparateDataTableRule tableRule : tableRules) {
            String tableName = tableRule.getTableName();

        }
    }

    public SelectParser selectParser(String sql){
        CodePointCharStream stream = CharStreams.fromString(sql);
        SelectLexer selectLexer = new SelectLexer(stream);

        CommonTokenStream token = new CommonTokenStream(selectLexer);
        return new SelectParser(token);
    }

    public void selectParse(SelectParser selectParser, SelectVisitor<Object> visitor){
        //先解析涉及到的表
        SelectParser.SelectContext select = selectParser.select();
        SelectParser.TablesContext tablesContext = select.tables();
        List<SelectParser.JoinContext> joinContext = select.join();
        SelectParser.QueryfieldsContext queryfieldsContext = select.queryfields();
        List<SelectParser.WhereContext> whereContexts = select.where();
        SelectParser.GroupbyfieldsContext groupbyfields = select.groupbyfields();
        SelectParser.OrderbyfieldsContext orderbyfields = select.orderbyfields();

        visitor.visitTables(tablesContext);
        for (SelectParser.JoinContext context : joinContext) {
            visitor.visitJoin(context);
        }
        //解析查询字段
        SeparateDataVisitorContextHolder.SELECT.querying(true);
        visitor.visitQueryfields(queryfieldsContext);
        SeparateDataVisitorContextHolder.SELECT.querying(false);
        //解析条件
        for (SelectParser.WhereContext where:whereContexts){
            visitor.visitWhere(where);
        }
        visitor.visitGroupbyfields(groupbyfields);
        visitor.visitOrderbyfields(orderbyfields);
    }

    public void insert(String sql){}

    public void update(String sql){}

    public void delete(String sql){}
}
