package com.dissdic.separatedata.common.rule;

import java.util.List;

public class SeparateDatabaseRule {

    private List<String> columns;

    private String luaExpression;

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
