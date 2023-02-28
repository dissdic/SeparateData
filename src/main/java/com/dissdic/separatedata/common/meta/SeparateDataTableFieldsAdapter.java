package com.dissdic.separatedata.common.meta;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class SeparateDataTableFieldsAdapter extends SeparateDataMetaDataAdapter {

    public static final ConcurrentHashMap<String,List<String>> map = new ConcurrentHashMap<>();


    public List<String> fields(String tableName){

        List<String> fields = map.get(tableName);
        if(fields==null){
            synchronized (SeparateDataTableFieldsAdapter.class){
                fields = map.get(tableName);
                if(fields==null){
                    fields = this.retrieveFields(tableName);
                    map.put(tableName,fields);
                }
                return fields;
            }
        }
        return fields;
    }
}
