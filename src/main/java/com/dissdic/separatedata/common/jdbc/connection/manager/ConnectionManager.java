package com.dissdic.separatedata.common.jdbc.connection.manager;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.util.List;
import java.util.Map;

public interface ConnectionManager {

    public Connection getConnection(String dataBase);

    public List<Connection> getConnections();

    public void setAutoCommit(boolean autoCommit) throws SQLException;

    public void commit() throws SQLException;

    public void rollback() throws SQLException;

    public void close() throws SQLException;

    public Connection getFirstConnection() throws SQLException;

    public void setReadOnly(boolean readOnly) throws SQLException;

    public void setTransactionIsolation(int level) throws SQLException;

    public SQLWarning getWarnings() throws SQLException;

    public void clearWarnings() throws SQLException;

    public void setHoldability(int holdability) throws SQLException;

}
