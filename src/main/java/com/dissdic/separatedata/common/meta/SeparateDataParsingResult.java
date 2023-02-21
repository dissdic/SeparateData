package com.dissdic.separatedata.common.meta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SeparateDataParsingResult {

    private boolean querying;
    private String tmpAlias;
    private Map<String,List<SeparateDataField>> alias2Fields = new HashMap<>();
    private List<SeparateDataTable> separateDataTables = new ArrayList<>();
    private List<SeparateDataField> separateDataFields = new ArrayList<>();
    private boolean queryAllFieldsOfAllTables = false;
    private String sql;


    public String getTmpAlias() {
        return tmpAlias;
    }

    public void setTmpAlias(String tmpAlias) {
        this.tmpAlias = tmpAlias;
    }

    public Map<String, List<SeparateDataField>> getAlias2Fields() {
        return alias2Fields;
    }

    public void setAlias2Fields(Map<String, List<SeparateDataField>> alias2Fields) {
        this.alias2Fields = alias2Fields;
    }

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

    public boolean isQuerying() {
        return querying;
    }

    public void setQuerying(boolean querying) {
        this.querying = querying;
    }
}
