package com.dissdic.separatedata.common.context;

import com.dissdic.separatedata.common.jdbc.datesource.SeparateDataDataSource;
import com.dissdic.separatedata.common.rule.SeparateDatabaseRule;
import com.dissdic.separatedata.common.rule.SeparateTableRule;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

public final class SeparateDataRuleAndDataSourceContext {

    private static Map<String,DataSource> dataSource;
    private static List<SeparateDatabaseRule> databaseRules;
    private static List<SeparateTableRule> tableRules;

    public static Map<String, DataSource> getDataSource() {
        return dataSource;
    }

    public static void setDataSource(Map<String, DataSource> dataSource) {
        SeparateDataRuleAndDataSourceContext.dataSource = dataSource;
    }

    public static List<SeparateDatabaseRule> getDatabaseRules() {
        return databaseRules;
    }

    public static void setDatabaseRules(List<SeparateDatabaseRule> databaseRules) {
        SeparateDataRuleAndDataSourceContext.databaseRules = databaseRules;
    }

    public List<SeparateTableRule> getTableRules() {
        return tableRules;
    }

    public void setTableRules(List<SeparateTableRule> tableRules) {
        SeparateDataRuleAndDataSourceContext.tableRules = tableRules;
    }
}
