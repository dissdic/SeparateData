package com.dissdic.separatedata.common.rule;

import java.util.List;

public class SeparateDatabaseRule {

    private String dbName;

    private String tableName;

    private List<String> columns;

    private String luaExpression;

    List<SeparateTableRule> tableRules;

    public List<SeparateTableRule> getTableRules() {
        return tableRules;
    }

    public void setTableRules(List<SeparateTableRule> tableRules) {
        this.tableRules = tableRules;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<String> getColumns() {
        return columns;
    }

    public void setColumns(List<String> columns) {
        this.columns = columns;
    }

    public String getLuaExpression() {
        return luaExpression;
    }

    public void setLuaExpression(String luaExpression) {
        this.luaExpression = luaExpression;
    }
}
