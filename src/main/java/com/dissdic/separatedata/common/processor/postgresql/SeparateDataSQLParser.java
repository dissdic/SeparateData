package com.dissdic.separatedata.common.processor.postgresql;

import com.dissdic.separatedata.common.meta.SeparateDataTable;
import com.dissdic.separatedata.common.processor.postgresql.Select.SelectLexer;
import com.dissdic.separatedata.common.processor.postgresql.Select.SelectParser;
import com.dissdic.separatedata.common.processor.postgresql.impl.SeparateDataSelectVisitorImpl;
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

        SeparateDataSelectVisitorImpl visitor = new SeparateDataSelectVisitorImpl();
        CodePointCharStream stream = CharStreams.fromString(sql);
        SelectLexer selectLexer = new SelectLexer(stream);

        CommonTokenStream token = new CommonTokenStream(selectLexer);
        SelectParser selectParser = new SelectParser(token);
        SelectParser.TablesContext tablesContext = selectParser.select().tables();
        List<SelectParser.JoinContext> joinContext = selectParser.select().join();
        List<SeparateDataTable> tables = (List<SeparateDataTable>)visitor.visitTables(tablesContext);
        for (SelectParser.JoinContext context : joinContext) {
//            SeparateDataTable table = visitor.visitJoin(context);

        }

        System.out.println(tables);

    }

    public void insert(String sql){}

    public void update(String sql){}

    public void delete(String sql){}
}
