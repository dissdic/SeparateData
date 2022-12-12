package com.dissdic.separatedata.common.meta;

public class SeparateDataField {

    private String name;

    private String alias;

    private SeparateDataTable table;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public SeparateDataTable getTable() {
        return table;
    }

    public void setTable(SeparateDataTable table) {
        this.table = table;
    }
}
