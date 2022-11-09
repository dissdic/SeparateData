package com.dissdic.separatedata.common.context;

import com.dissdic.separatedata.common.jdbc.datesource.SeparateDataDataSource;
import com.dissdic.separatedata.common.rule.SeparateDatabaseRule;

import javax.sql.DataSource;
import java.util.Map;

public class RuleAndDataSourceContext {


    private DataSource dataSource;
    private SeparateDatabaseRule rule;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public SeparateDatabaseRule getRule() {
        return rule;
    }

    public void setRule(SeparateDatabaseRule rule) {
        this.rule = rule;
    }
}
