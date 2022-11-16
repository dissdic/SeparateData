package com.dissdic.separatedata.common.jdbc.connection;

import com.dissdic.separatedata.common.context.ContextHolder;
import com.dissdic.separatedata.common.exception.UnSupportedOperationException;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

//列出不支持的接口
public abstract class AbstractUnsupportedOperationConnection implements Connection {

    @Override
    public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
        throw new UnSupportedOperationException("prepareCall");
    }

    @Override
    public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        throw new UnSupportedOperationException("prepareCall");
    }

    @Override
    public CallableStatement prepareCall(String sql) throws SQLException {
        throw new UnSupportedOperationException("prepareCall");
    }

    @Override
    public String nativeSQL(String sql) throws SQLException {
        throw new UnSupportedOperationException("nativeSQL");
    }



}
