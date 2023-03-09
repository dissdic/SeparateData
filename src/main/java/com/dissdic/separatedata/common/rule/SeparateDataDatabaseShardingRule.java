package com.dissdic.separatedata.common.rule;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SeparateDataDatabaseShardingRule extends SeparateDataShardingRule{

    //垂直分库或水平分库时 主库
    private String mainDataBase;

    //垂直分库时 分库和所包含的表的映射
    private Map<String,List<String>> subDataBasesAndTables;

    //水平分库时 切分数据的表 逻辑表
    private String table;
    //水平分库时 表数据分割算法 返回的值应该是表名称
    private String luaExpression;
    //水平分库时 数据库与表名的对应关系
    private Map<String,String> dataBaseTable;

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

    public Map<String, String> getDataBaseTable() {
        return dataBaseTable;
    }

    public void setDataBaseTable(Map<String, String> dataBaseTable) {
        this.dataBaseTable = dataBaseTable;
    }

    public String getLuaExpression() {
        return luaExpression;
    }

    public void setLuaExpression(String luaExpression) {
        this.luaExpression = luaExpression;
    }

    @Override
    public List<String> physicalTables() {
        if (mode==HORIZONTAL_DATABASE){
            return new ArrayList<>(dataBaseTable.values());
        }
        return null;
    }
}
