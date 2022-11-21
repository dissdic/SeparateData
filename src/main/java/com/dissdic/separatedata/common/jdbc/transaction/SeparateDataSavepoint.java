package com.dissdic.separatedata.common.jdbc.transaction;

import com.dissdic.separatedata.common.exception.UnSupportedOperationException;

import java.sql.SQLException;
import java.sql.Savepoint;
import java.util.UUID;

public class SeparateDataSavepoint implements Savepoint {

    private String name;

    public SeparateDataSavepoint(String name) throws SQLException{
        if (name==null || name.trim().length()==0){
            throw new SQLException("savepoint name can not be blank");
        }
        this.name = name;
    }

    public SeparateDataSavepoint(){
        this.name = UUID.randomUUID().toString();
    }

    @Override
    public int getSavepointId() throws SQLException {
        throw new UnSupportedOperationException("getSavepointId");
    }

    @Override
    public String getSavepointName() throws SQLException {
        return this.name;
    }
}
