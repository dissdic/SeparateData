package com.dissdic.separatedata.common.processor.postgresql;

import com.dissdic.separatedata.common.meta.SeparateDataField;
import com.dissdic.separatedata.common.meta.SeparateDataMetaDataAdapter;
import com.dissdic.separatedata.common.meta.SeparateDataTable;
import com.dissdic.separatedata.common.processor.postgresql.Select.SelectLexer;
import com.dissdic.separatedata.common.processor.postgresql.Select.SelectParser;
import com.dissdic.separatedata.common.processor.postgresql.Select.SelectVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public abstract class SeparateDataAbstractParser extends SeparateDataMetaDataAdapter {

    public SelectParser selectParser(String sql){
        CodePointCharStream stream = CharStreams.fromString(sql);
        SelectLexer selectLexer = new SelectLexer(stream);
        CommonTokenStream token = new CommonTokenStream(selectLexer);
        return new SelectParser(token);
    }

    public boolean isPresentInCondition(SeparateDataTable table){
        String alias = table.getAlias();
        if(alias!=null){
            long count  = SeparateDataVisitorContextHolder
                    .SELECT.getAlias2Fields()
                    .get(alias).stream().filter(c->!c.isQuery()).count();
            if(count > 0){
                return true;
            }
        }else{
            List<String> fields = fields(table.getName());
            long count = SeparateDataVisitorContextHolder.SELECT.getParsingFieldList()
                    .stream().filter(c->!c.isQuery() && fields.contains(c.getName())).count();
            if(count > 0){
                return true;
            }
        }
        return false;
    }

    public String convertToCount(SelectParser selectParser,String tableName, String sql_){


        String sql = sql_;
        SelectParser.SelectContext select = selectParser.select();
        SelectParser.QueryfieldsContext queryfieldsContext = select.queryfields();
        TerminalNode group = select.GROUP();
        if(group!=null) {
            sql = sql.substring(0,group.getSymbol().getStartIndex());
        }
        int start =  queryfieldsContext.getStart().getStartIndex();
        int stop = queryfieldsContext.getStop().getStopIndex();
        String queryToken = queryfieldsContext.getStart().getInputStream().getText(new Interval(start,stop));

        sql = sql.replace(queryToken,"count(*)");
        return sql;
    }

}
