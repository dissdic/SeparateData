package com.dissdic.separatedata.common.meta;

import com.dissdic.separatedata.common.rule.SeparateDatabaseRule;
import com.dissdic.separatedata.common.rule.SeparateTableRule;

import java.util.List;

public class SeparateContext {

    List<SeparateTableRule> tableRules;
    List<SeparateDatabaseRule> databaseRules;

    public List<SeparateTableRule> getTableRules() {
        return tableRules;
    }

    public void setTableRules(List<SeparateTableRule> tableRules) {
        this.tableRules = tableRules;
    }

    public List<SeparateDatabaseRule> getDatabaseRules() {
        return databaseRules;
    }

    public void setDatabaseRules(List<SeparateDatabaseRule> databaseRules) {
        this.databaseRules = databaseRules;
    }
}
