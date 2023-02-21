package com.dissdic.separatedata.common.jdbc.datesource;

import com.dissdic.separatedata.common.context.ContextHolder;
import com.dissdic.separatedata.common.context.SeparateDataRuleAndDataSourceContext;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

public class SeparateDataDataSource extends AbstractDataSource implements AutoCloseable {

    public SeparateDataDataSource(SeparateDataRuleAndDataSourceContext separateContext){
        ContextHolder.setContext(separateContext);
    }

    @Override
    public Connection getConnection() throws SQLException {
        return null;
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return null;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {

//        T t = separateDataConfig.getDataSource().unwrap(iface);
//        if(t instanceof Connection){
//            return (T)new SeparateDataConnection(t);
//        }else{
//            return t;
//        }
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {

    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {
    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return 1;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }

    @Override
    public void close() throws Exception {

    }
}
