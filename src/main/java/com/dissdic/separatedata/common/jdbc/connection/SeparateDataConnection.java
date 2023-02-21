package com.dissdic.separatedata.common.jdbc.connection;

import com.dissdic.separatedata.common.context.ContextHolder;
import com.dissdic.separatedata.common.jdbc.connection.manager.ConnectionManager;
import com.dissdic.separatedata.common.jdbc.connection.manager.SeparateConnectionManager;
import com.dissdic.separatedata.common.jdbc.statement.SeparateDataPreparedStatement;

import java.lang.reflect.InvocationHandler;
import java.sql.*;
import java.util.Optional;

import static java.lang.reflect.Proxy.newProxyInstance;

public class SeparateDataConnection extends AbstractUnsupportedOperationConnection {

    private ConnectionManager connectionManager;

    private boolean autoCommit = true;

    private boolean closed = false;

    private boolean readOnly = false;

    private String catalog;

    private String schema;

    private int isolationLevel;

    private int holdability = ResultSet.CLOSE_CURSORS_AT_COMMIT;

    public SeparateDataConnection(){
        InvocationHandler handler = Optional.ofNullable(ContextHolder.getConnectionManagerHandler()).orElse((proxy, method, args) -> method.invoke(new SeparateConnectionManager(),args));
        connectionManager = (ConnectionManager)newProxyInstance(this.getClass().getClassLoader(),new Class[]{ConnectionManager.class},handler);
    }

    @Override
    public Statement createStatement() throws SQLException {
        return new SeparateDataPreparedStatement(this);
    }

    @Override
    public PreparedStatement prepareStatement(String sql) throws SQLException {
        return new SeparateDataPreparedStatement(this,sql);
    }

    @Override
    public void setAutoCommit(boolean autoCommit) throws SQLException {
        this.autoCommit = autoCommit;
        connectionManager.setAutoCommit(autoCommit);
    }

    @Override
    public boolean getAutoCommit() throws SQLException {
        return this.autoCommit;
    }

    @Override
    public void commit() throws SQLException {
        connectionManager.commit();
    }

    @Override
    public void rollback() throws SQLException {
        connectionManager.rollback();
    }

    @Override
    public void close() throws SQLException {
        this.closed = true;
        connectionManager.close();
    }

    @Override
    public boolean isClosed() throws SQLException {
        return this.closed;
    }

    @Override
    public DatabaseMetaData getMetaData() throws SQLException {
        return connectionManager.getFirstConnection().getMetaData();
    }

    @Override
    public void setReadOnly(boolean readOnly) throws SQLException {
        this.readOnly = readOnly;
        connectionManager.setReadOnly(readOnly);
    }

    @Override
    public boolean isReadOnly() throws SQLException {
        return this.readOnly;
    }

    @Override
    public void setCatalog(String catalog) throws SQLException {
        this.catalog = catalog;
    }

    @Override
    public String getCatalog() throws SQLException {
        return this.catalog;
    }

    @Override
    public void setTransactionIsolation(int level) throws SQLException {
        this.isolationLevel = level;
        connectionManager.setTransactionIsolation(level);
    }

    @Override
    public int getTransactionIsolation() throws SQLException {
        return this.isolationLevel;
    }

    @Override
    public SQLWarning getWarnings() throws SQLException {
        return connectionManager.getWarnings();
    }

    @Override
    public void clearWarnings() throws SQLException {
        connectionManager.clearWarnings();
    }

    @Override
    public Statement createStatement(int resultSetType, int resultSetConcurrency) throws SQLException {
        return null;
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
        return null;
    }

    @Override
    public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
        return null;
    }

    @Override
    public void setHoldability(int holdability) throws SQLException {
        this.holdability = holdability;
        connectionManager.setHoldability(holdability);
    }

    @Override
    public int getHoldability() throws SQLException {
        return this.holdability;
    }

    @Override
    public Savepoint setSavepoint() throws SQLException {
        return connectionManager.setSavepoint();
    }

    @Override
    public Savepoint setSavepoint(String name) throws SQLException {
        return connectionManager.setSavepoint(name);
    }

    @Override
    public void rollback(Savepoint savepoint) throws SQLException {
        connectionManager.rollback(savepoint);
    }

    @Override
    public void releaseSavepoint(Savepoint savepoint) throws SQLException {
        connectionManager.releaseSavepoint(savepoint);
    }

    @Override
    public Statement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        return null;
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        return null;
    }

    @Override
    public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        return null;
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) throws SQLException {
        return null;
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int[] columnIndexes) throws SQLException {
        return null;
    }

    @Override
    public PreparedStatement prepareStatement(String sql, String[] columnNames) throws SQLException {
        return null;
    }

    @Override
    public boolean isValid(int timeout) throws SQLException {
        return connectionManager.isValid(timeout);
    }

    @Override
    public void setSchema(String schema) throws SQLException {
        this.schema = schema;
    }

    @Override
    public String getSchema() throws SQLException {
        return this.schema;
    }
}
