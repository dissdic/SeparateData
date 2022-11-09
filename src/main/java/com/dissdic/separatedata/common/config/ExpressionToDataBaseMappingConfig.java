package com.dissdic.separatedata.common.config;

import com.dissdic.separatedata.common.context.RuleAndDataSourceContext;
import com.dissdic.separatedata.common.rule.SeparateDatabaseRule;
import com.dissdic.separatedata.common.rule.SeparateTableRule;

import javax.sql.DataSource;
import java.util.List;

public class ExpressionToDataBaseMappingConfig {

    private String luaExpression;

    private String tableName;

    private List<String> columns;

    public String getLuaExpression() {
        return luaExpression;
    }

    public void setLuaExpression(String luaExpression) {
        this.luaExpression = luaExpression;
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
}
