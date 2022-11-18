package com.dissdic.separatedata.common.jdbc.connection.manager;

import com.dissdic.separatedata.common.context.ContextHolder;
import com.dissdic.separatedata.common.operation.ConnectionFunction;
import com.dissdic.separatedata.common.operation.ConnectionOperation;
import com.sun.xml.internal.bind.v2.model.annotation.RuntimeAnnotationReader;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Function;

public class SeparateConnectionManager implements ConnectionManager{

    private LinkedList<ConnectionOperation<Object>> methodForInvoke = new LinkedList<>();
    private ConcurrentHashMap<String,Connection> connectionMap;


    private <T> void operateConnection(ConnectionOperation<Object> operation, ConnectionFunction<Connection,T> func, T t) throws SQLException{

        Map<Connection,T> oldValMap = new HashMap<>();
        for (Connection connection : connectionMap.values()) {
            try{
                T oldVal = func.apply(connection);
                operation.operate(connection,t);
                oldValMap.put(connection,oldVal);
            }catch (SQLException e){
                for (Connection conn : oldValMap.keySet()) {
                    operation.operate(conn,oldValMap.get(conn));
                }
                throw e;
            }
        }
    }
    @Override
    public List<Connection> getConnections() {
        return new ArrayList<>(connectionMap.values());
    }

    @Override
    public void setAutoCommit(boolean autoCommit) throws SQLException{
        operateConnection((conn,a)->conn.setAutoCommit((boolean)a), Connection::getAutoCommit,autoCommit);
        methodForInvoke.offer((conn,a)->conn.setAutoCommit(autoCommit));
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
    public Connection getFirstConnection() throws SQLException{
        return ContextHolder.getContext().getDataSource().values().iterator().next().getConnection();
    }

    @Override
    public void setReadOnly(boolean readOnly) throws SQLException {
        operateConnection((conn,a)->conn.setReadOnly((boolean)a), Connection::isReadOnly,readOnly);
        methodForInvoke.offer((conn,a)->conn.setReadOnly(readOnly));
    }

    @Override
    public void setTransactionIsolation(int level) throws SQLException {
        operateConnection((conn,a)->conn.setTransactionIsolation((int)a), Connection::getTransactionIsolation,level);
        methodForInvoke.offer((conn,a)->conn.setTransactionIsolation(level));
    }

    @Override
    public Connection getConnection(String dataBase) {
        return null;
    }

    @Override
    public void close() throws SQLException {
        for (Connection connection : connectionMap.values()){
            connection.close();
        }
    }
}
