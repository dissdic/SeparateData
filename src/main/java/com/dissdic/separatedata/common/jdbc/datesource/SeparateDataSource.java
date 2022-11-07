package com.dissdic.separatedata.common.jdbc.datesource;

import com.dissdic.separatedata.common.config.SeparateDataConfig;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

public class SeparateDataSource implements DataSource {

    private SeparateDataConfig separateDataConfig;

    @Override
    public Connection getConnection() throws SQLException {
        return separateDataConfig.getDataSource().getConnection();
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return separateDataConfig.getDataSource().getConnection();
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return separateDataConfig.getDataSource().unwrap(iface);
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
        return 0;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }
}
