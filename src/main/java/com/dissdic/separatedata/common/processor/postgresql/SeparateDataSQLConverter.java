package com.dissdic.separatedata.common.processor.postgresql;

import com.dissdic.separatedata.common.processor.postgresql.Select.SelectParser;
import com.dissdic.separatedata.common.processor.postgresql.impl.SeparateDataSelectConvertVisitorImpl;
import com.dissdic.separatedata.common.rule.SeparateDataShardingRule;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class SeparateDataSQLConverter extends SeparateDataAbstractParser{

    public List<String> convert(String sql_, SeparateDataShardingRule rule){
        String sql = sql_;
        System.out.println("start parsing");
        int mode = rule.getMode();

        SelectParser selectParser = selectParser(sql);
        return null;
    }

    public String count(SelectParser selectParser, String sql){

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
