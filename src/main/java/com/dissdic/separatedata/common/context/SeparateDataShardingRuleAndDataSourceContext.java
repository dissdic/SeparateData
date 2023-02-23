package com.dissdic.separatedata.common.context;

import com.dissdic.separatedata.common.rule.SeparateDataDatabaseShardingRule;
import com.dissdic.separatedata.common.rule.SeparateDataShardingRule;
import com.dissdic.separatedata.common.rule.SeparateDataTableShardingRule;

import javax.sql.DataSource;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class SeparateDataShardingRuleAndDataSourceContext {

    private static Map<String,DataSource> dataSource;
    private static List<SeparateDataDatabaseShardingRule> databaseRules;
    private static List<SeparateDataTableShardingRule> tableRules;

    public static SeparateDataShardingRule getRuleByTable(String name){
        SeparateDataShardingRule rule = databaseRules.stream().filter(c->{
            if(name.equalsIgnoreCase(c.getTable())) {
                return true;
            }
            List<String> tables = c.getSubDataBasesAndTables().values().stream().flatMap(Collection::stream).collect(Collectors.toList());
            if(tables.contains(name)){
                return true;
            }
            return false;
        }).findFirst().orElse(null);
        if(rule==null){
            rule = tableRules.stream().filter(c->name.equalsIgnoreCase(c.getTableName())).findFirst().orElse(null);
        }
        return rule;
    }

    public static Map<String, DataSource> getDataSource() {
        return dataSource;
    }

    public static void setDataSource(Map<String, DataSource> dataSource) {
        SeparateDataShardingRuleAndDataSourceContext.dataSource = dataSource;
    }

    public static List<SeparateDataDatabaseShardingRule> getDatabaseRules() {
        return databaseRules;
    }

    public static void setDatabaseRules(List<SeparateDataDatabaseShardingRule> databaseRules) {
        SeparateDataShardingRuleAndDataSourceContext.databaseRules = databaseRules;
    }

    public static List<SeparateDataTableShardingRule> getTableRules() {
        return tableRules;
    }

    public static void setTableRules(List<SeparateDataTableShardingRule> tableRules) {
        SeparateDataShardingRuleAndDataSourceContext.tableRules = tableRules;
    }
}
