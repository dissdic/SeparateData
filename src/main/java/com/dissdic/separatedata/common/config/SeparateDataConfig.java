package com.dissdic.separatedata.common.config;

import com.dissdic.separatedata.common.rule.SeparateDatabaseRule;
import com.dissdic.separatedata.common.rule.SeparateTableRule;

import javax.sql.DataSource;
import java.util.List;

public class SeparateDataConfig {

    private DataSource dataSource;

    private List<SeparateDatabaseRule> separateDatabaseRules;

    private List<SeparateTableRule> separateTableRules;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<SeparateDatabaseRule> getSeparateDatabaseRules() {
        return separateDatabaseRules;
    }

    public void setSeparateDatabaseRules(List<SeparateDatabaseRule> separateDatabaseRules) {
        this.separateDatabaseRules = separateDatabaseRules;
    }

    public List<SeparateTableRule> getSeparateTableRules() {
        return separateTableRules;
    }

    public void setSeparateTableRules(List<SeparateTableRule> separateTableRules) {
        this.separateTableRules = separateTableRules;
    }
}
