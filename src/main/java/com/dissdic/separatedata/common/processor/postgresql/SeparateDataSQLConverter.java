package com.dissdic.separatedata.common.processor.postgresql;

import com.dissdic.separatedata.common.processor.postgresql.Select.SelectParser;
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

}
