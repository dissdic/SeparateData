package com.dissdic.separatedata.common.context;

import com.dissdic.separatedata.common.rule.SeparateDataDatabaseRule;
import com.dissdic.separatedata.common.rule.SeparateDataTableRule;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

public final class SeparateDataRuleAndDataSourceContext {

    private static Map<String,DataSource> dataSource;
    private static List<SeparateDataDatabaseRule> databaseRules;
    private static List<SeparateDataTableRule> tableRules;

    public static Map<String, DataSource> getDataSource() {
        return dataSource;
    }

    public static void setDataSource(Map<String, DataSource> dataSource) {
        SeparateDataRuleAndDataSourceContext.dataSource = dataSource;
    }

    public static List<SeparateDataDatabaseRule> getDatabaseRules() {
        return databaseRules;
    }

    public static void setDatabaseRules(List<SeparateDataDatabaseRule> databaseRules) {
        SeparateDataRuleAndDataSourceContext.databaseRules = databaseRules;
    }

    public static List<SeparateDataTableRule> getTableRules() {
        return tableRules;
    }

    public static void setTableRules(List<SeparateDataTableRule> tableRules) {
        SeparateDataRuleAndDataSourceContext.tableRules = tableRules;
    }
}
