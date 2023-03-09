package com.dissdic.separatedata.common.meta;

import com.dissdic.separatedata.common.jdbc.executor.SeparateDataJdbcExecutor;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public abstract class SeparateDataMetaDataAdapter {

    protected SeparateDataJdbcExecutor separateDataJdbcExecutor;

    //todo
    public List<String> retrieveFields(String tableName){

        return null;
    }
    //todo
    public boolean queryCount(String sql){

        return false;
    }

    public static final ConcurrentHashMap<String,List<String>> map = new ConcurrentHashMap<>();

    public List<String> fields(String tableName){

        List<String> fields = map.get(tableName);
        if(fields==null){
            synchronized (SeparateDataMetaDataAdapter.class){
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
