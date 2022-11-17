package com.dissdic.separatedata.common.jdbc.connection.manager;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class SeparateConnectionManager implements ConnectionManager{

    private ConcurrentHashMap<String,Connection> connectionMap;

    @Override
    public List<Connection> getConnections() {
        return new ArrayList<>(connectionMap.values());
    }

    @Override
    public void setAutoCommit(boolean autoCommit) throws SQLException{
        Map<Connection,Boolean> autocommit = new HashMap<>();
        for (Connection connection : connectionMap.values()) {
            try{
                boolean ac = connection.getAutoCommit();
                connection.setAutoCommit(autoCommit);
                autocommit.put(connection,ac);
            }catch (SQLException e){
                for (Connection conn : autocommit.keySet()) {
                    conn.setAutoCommit(autocommit.get(conn));
                }
                throw e;
            }

        }
    }

    @Override
    public void commit() throws SQLException {
        for (Connection connection : connectionMap.values()) {
            connection.commit();
        }
    }

    @Override
    public void rollback() throws SQLException{
        for (Connection connection : connectionMap.values()) {
            connection.rollback();
        }
    }

    @Override
    public void close() throws SQLException {
        for (Connection connection : connectionMap.values()){
            connection.close();
        }
    }

    @Override
    public Connection getConnection(String dataBase) {

        return null;
    }
}
