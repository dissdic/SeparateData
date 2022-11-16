package com.dissdic.separatedata.common.jdbc.connection.manager;

import java.sql.Connection;
import java.util.List;

public class SeparateConnectionManager implements ConnectionManager,AutoCloseable{

    private List<Connection> connections;

    public List<Connection> getConnections() {
        return connections;
    }

    public void setConnections(List<Connection> connections) {
        this.connections = connections;
    }

    @Override
    public void close() throws Exception {

    }

    @Override
    public Connection getConnection(String dataBase) {
        return null;
    }
}
