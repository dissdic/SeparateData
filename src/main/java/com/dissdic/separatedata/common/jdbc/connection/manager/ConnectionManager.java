package com.dissdic.separatedata.common.jdbc.connection.manager;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface ConnectionManager {

    public Connection getConnection(String dataBase);

    public List<Connection> getConnections();

    public void setAutoCommit(boolean autoCommit) throws SQLException;

    public void commit() throws SQLException;

    public void rollback() throws SQLException;

    public void close() throws SQLException;
}
