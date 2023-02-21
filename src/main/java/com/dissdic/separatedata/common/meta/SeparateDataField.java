package com.dissdic.separatedata.common.meta;

public class SeparateDataField {

    private String tableAlias;

    private boolean all;

    private String name;

    private boolean query;

    private SeparateDataTable table;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SeparateDataTable getTable() {
        return table;
    }

    public void setTable(SeparateDataTable table) {
        this.table = table;
    }

    public boolean isAll() {
        return all;
    }

    public void setAll(boolean all) {
        this.all = all;
    }

    public String getTableAlias() {
        return tableAlias;
    }

    public void setTableAlias(String tableAlias) {
        this.tableAlias = tableAlias;
    }

    public boolean isQuery() {
        return query;
    }

    public void setQuery(boolean query) {
        this.query = query;
    }
}
