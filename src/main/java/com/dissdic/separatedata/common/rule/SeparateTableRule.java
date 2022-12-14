package com.dissdic.separatedata.common.rule;

import java.util.List;
import java.util.Map;

public class SeparateTableRule {

    private String tableName;

    // 是否忽略表别名，但涉及多个表联合查询时，会涉及到字段的属于哪张表的问题
    // 如果忽略，则遇到字段没有表别名的情况，会直接忽视掉，不进行解析。
    // 如果不忽略，则遇到字段没有表别名的情况，会解析每个表的字段结构，判断是否解析
    private boolean ignoreAlias = false;

    // model=1:垂直分表  mode=2:水平分表
    private String mode;

    //垂直分表时 主表名
    private String mainTable;
    //垂直分表时 指定子表名和列名的对应关系，
    Map<String,List<String>> subTablesAndCols;
    //垂直分表时 子表与主表ID的关联字段名
    Map<String,String> relateKeyMap;
    //垂直分表时 默认的子表与主表ID的关联字段名
    private String relateKey;

    //水平分表时 所有的表名
    private List<String> subTables;
    //水平分表时 分表算法，用lua表达式表示, ${column}表示字段，返回结果应该是对应的表名
    private String luaExpression;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getMainTable() {
        return mainTable;
    }

    public void setMainTable(String mainTable) {
        this.mainTable = mainTable;
    }

    public Map<String, List<String>> getSubTablesAndCols() {
        return subTablesAndCols;
    }

    public void setSubTablesAndCols(Map<String, List<String>> subTablesAndCols) {
        this.subTablesAndCols = subTablesAndCols;
    }

    public Map<String, String> getRelateKeyMap() {
        return relateKeyMap;
    }

    public void setRelateKeyMap(Map<String, String> relateKeyMap) {
        this.relateKeyMap = relateKeyMap;
    }

    public String getRelateKey() {
        return relateKey;
    }

    public void setRelateKey(String relateKey) {
        this.relateKey = relateKey;
    }

    public List<String> getSubTables() {
        return subTables;
    }

    public void setSubTables(List<String> subTables) {
        this.subTables = subTables;
    }

    public String getLuaExpression() {
        return luaExpression;
    }

    public void setLuaExpression(String luaExpression) {
        this.luaExpression = luaExpression;
    }

    public boolean isIgnoreAlias() {
        return ignoreAlias;
    }

    public void setIgnoreAlias(boolean ignoreAlias) {
        this.ignoreAlias = ignoreAlias;
    }
}
