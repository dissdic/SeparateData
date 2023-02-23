package com.dissdic.separatedata.common.rule;

import java.util.List;
import java.util.Map;

public class SeparateDataDatabaseShardingRule extends SeparateDataShardingRule{

    //垂直分库时 主库
    private String mainDataBase;
    //垂直分库时 分库和所包含的表的映射
    private Map<String,List<String>> subDataBasesAndTables;

    //水平分库时 切分数据的表
    private String table;
    //水平分库时 所有的数据库名
    private List<String> dataBases;
    //水平分库时 表数据分割算法 返回的值应该是数据库名称
    private String luaExpression;

    public String getMainDataBase() {
        return mainDataBase;
    }

    public void setMainDataBase(String mainDataBase) {
        this.mainDataBase = mainDataBase;
    }

    public Map<String, List<String>> getSubDataBasesAndTables() {
        return subDataBasesAndTables;
    }

    public void setSubDataBasesAndTables(Map<String, List<String>> subDataBasesAndTables) {
        this.subDataBasesAndTables = subDataBasesAndTables;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public List<String> getDataBases() {
        return dataBases;
    }

    public void setDataBases(List<String> dataBases) {
        this.dataBases = dataBases;
    }

    public String getLuaExpression() {
        return luaExpression;
    }

    public void setLuaExpression(String luaExpression) {
        this.luaExpression = luaExpression;
    }

}
