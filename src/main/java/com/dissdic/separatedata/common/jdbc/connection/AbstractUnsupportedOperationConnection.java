package com.dissdic.separatedata.common.jdbc.connection;

import com.dissdic.separatedata.common.context.ContextHolder;
import com.dissdic.separatedata.common.exception.UnSupportedOperationException;
import com.dissdic.separatedata.common.jdbc.adapter.SeparateWrapperAdapter;

import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

//列出不支持的接口
public abstract class AbstractUnsupportedOperationConnection extends SeparateWrapperAdapter {

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

    @Override
    public Map<String, Class<?>> getTypeMap() throws SQLException {
        throw new UnSupportedOperationException("getTypeMap");
    }

    @Override
    public void setTypeMap(Map<String, Class<?>> map) throws SQLException {
        throw new UnSupportedOperationException("setTypeMap");
    }

    @Override
    public Clob createClob() throws SQLException {
        throw new UnSupportedOperationException("createClob");
    }

    @Override
    public Blob createBlob() throws SQLException {
        throw new UnSupportedOperationException("createBlob");
    }

    @Override
    public NClob createNClob() throws SQLException {
        throw new UnSupportedOperationException("createNClob");
    }

    @Override
    public SQLXML createSQLXML() throws SQLException {
        throw new UnSupportedOperationException("createSQLXML");
    }

    @Override
    public void setClientInfo(String name, String value) throws SQLClientInfoException {
        throw new UnSupportedOperationException("setClientInfo");
    }

    @Override
    public void setClientInfo(Properties properties) throws SQLClientInfoException {
        throw new UnSupportedOperationException("setClientInfo");
    }

    @Override
    public String getClientInfo(String name) throws SQLException {
        throw new UnSupportedOperationException("getClientInfo");
    }

    @Override
    public Properties getClientInfo() throws SQLException {
        throw new UnSupportedOperationException("getClientInfo");
    }

    @Override
    public Array createArrayOf(String typeName, Object[] elements) throws SQLException {
        throw new UnSupportedOperationException("createArrayOf");
    }

    @Override
    public Struct createStruct(String typeName, Object[] attributes) throws SQLException {
        throw new UnSupportedOperationException("createStruct");
    }

    @Override
    public void abort(Executor executor) throws SQLException {
        throw new UnSupportedOperationException("abort");
    }

    @Override
    public void setNetworkTimeout(Executor executor, int milliseconds) throws SQLException {
        throw new UnSupportedOperationException("setNetworkTimeout");
    }

    @Override
    public int getNetworkTimeout() throws SQLException {
        throw new UnSupportedOperationException("getNetworkTimeout");
    }

}
