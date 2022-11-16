package com.dissdic.separatedata.common.context;

import com.dissdic.separatedata.common.jdbc.datesource.SeparateDataDataSource;
import com.dissdic.separatedata.common.rule.SeparateDatabaseRule;
import com.dissdic.separatedata.common.rule.SeparateTableRule;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

public class RuleAndDataSourceContext {

    private Map<String,DataSource> dataSource;
    private List<SeparateDatabaseRule> databaseRules;
    private List<SeparateTableRule> tableRules;

    public Map<String, DataSource> getDataSource() {
        return dataSource;
    }

    public void setDataSource(Map<String, DataSource> dataSource) {
        this.dataSource = dataSource;
    }

    public List<SeparateDatabaseRule> getDatabaseRules() {
        return databaseRules;
    }

    public void setDatabaseRules(List<SeparateDatabaseRule> databaseRules) {
        this.databaseRules = databaseRules;
    }

    public List<SeparateTableRule> getTableRules() {
        return tableRules;
    }

    public void setTableRules(List<SeparateTableRule> tableRules) {
        this.tableRules = tableRules;
    }
}
