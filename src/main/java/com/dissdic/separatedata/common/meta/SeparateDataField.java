package com.dissdic.separatedata.common.meta;

public class SeparateDataField {

    private boolean all;

    private String name;

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
}
