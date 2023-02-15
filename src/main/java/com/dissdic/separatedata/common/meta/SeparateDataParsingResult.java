package com.dissdic.separatedata.common.meta;

import java.util.ArrayList;
import java.util.List;

public class SeparateDataParsingResult {

    private List<SeparateDataTable> separateDataTables = new ArrayList<>();
    private List<SeparateDataField> separateDataFields = new ArrayList<>();
    private boolean queryAllFieldsOfAllTables = false;
    private String sql;

    public List<SeparateDataTable> getSeparateDataTables() {
        return separateDataTables;
    }

    public void setSeparateDataTables(List<SeparateDataTable> separateDataTables) {
        this.separateDataTables = separateDataTables;
    }

    public List<SeparateDataField> getSeparateDataFields() {
        return separateDataFields;
    }

    public void setSeparateDataFields(List<SeparateDataField> separateDataFields) {
        this.separateDataFields = separateDataFields;
    }

    public boolean isQueryAllFieldsOfAllTables() {
        return queryAllFieldsOfAllTables;
    }

    public void setQueryAllFieldsOfAllTables(boolean queryAllFieldsOfAllTables) {
        this.queryAllFieldsOfAllTables = queryAllFieldsOfAllTables;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }
}
