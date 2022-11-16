package com.dissdic.separatedata.common.jdbc.datesource;

import com.dissdic.separatedata.common.meta.SeparateContext;
import com.dissdic.separatedata.common.jdbc.connection.SeparateDataConnection;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

public class SeparateDataDataSource extends AbstractDataSource implements AutoCloseable {

    private SeparateContext separateContext;

    public SeparateDataDataSource(SeparateContext separateContext){
        this.separateContext = separateContext;
    }

    @Override
    public Connection getConnection() throws SQLException {
        return new SeparateDataConnection(separateDataConfig.getDataSource().getConnection());
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return new SeparateDataConnection(separateDataConfig.getDataSource().getConnection());
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {

        T t = separateDataConfig.getDataSource().unwrap(iface);
        if(t instanceof Connection){
            return (T)new SeparateDataConnection(t);
        }else{
            return t;
        }
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return separateDataConfig.getDataSource().isWrapperFor(iface);
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return separateDataConfig.getDataSource().getLogWriter();
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {
        separateDataConfig.getDataSource().setLogWriter(out);
    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {
        separateDataConfig.getDataSource().setLoginTimeout(seconds);
    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return separateDataConfig.getDataSource().getLoginTimeout();
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return separateDataConfig.getDataSource().getParentLogger();
    }

    @Override
    public void close() throws Exception {

    }
}
