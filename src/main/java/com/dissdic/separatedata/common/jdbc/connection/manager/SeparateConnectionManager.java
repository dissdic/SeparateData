package com.dissdic.separatedata.common.jdbc.connection.manager;

import com.dissdic.separatedata.common.context.ContextHolder;
import com.dissdic.separatedata.common.exception.SeparateDataSQLWarning;
import com.dissdic.separatedata.common.jdbc.transaction.SeparateDataSavepoint;
import com.dissdic.separatedata.common.jdbc.transaction.SeparateDataSavepointManager;
import com.dissdic.separatedata.common.operation.ConnectionFunction;
import com.dissdic.separatedata.common.operation.ConnectionOperation;
import com.sun.xml.internal.bind.v2.model.annotation.RuntimeAnnotationReader;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Savepoint;
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
    public SQLWarning getWarnings() throws SQLException {
        return new SeparateDataSQLWarning(this.getConnections());
    }

    @Override
    public void clearWarnings() throws SQLException {
        for (Connection connection : this.getConnections()) {
            connection.clearWarnings();
        }
    }

    @Override
    public void setHoldability(int holdability) throws SQLException {
        operateConnection((conn,a)->conn.setHoldability((int)a), Connection::getHoldability,holdability);
        methodForInvoke.offer((conn,a)->conn.setHoldability(holdability));
    }

    @Override
    public Savepoint setSavepoint() throws SQLException {
        SeparateDataSavepoint savepoint = new SeparateDataSavepoint();
        for (Connection connection : getConnections()) {
            SeparateDataSavepointManager.setSavepoint(connection,savepoint.getSavepointName());
        }
        methodForInvoke.offer((conn,a)->SeparateDataSavepointManager.setSavepoint(conn,savepoint.getSavepointName()));
        return savepoint;
    }

    @Override
    public Savepoint setSavepoint(String name) throws SQLException {
        SeparateDataSavepoint savepoint = new SeparateDataSavepoint(name);
        for (Connection connection : getConnections()) {
            SeparateDataSavepointManager.setSavepoint(connection,savepoint.getSavepointName());
        }
        methodForInvoke.offer((conn,a)->SeparateDataSavepointManager.setSavepoint(conn,name));
        return savepoint;
    }

    @Override
    public void rollback(Savepoint savepoint) throws SQLException {
        String name = savepoint.getSavepointName();
        for (Connection connection : getConnections()) {
            SeparateDataSavepointManager.rollback(connection,name);
        }
        methodForInvoke.offer((conn,a)->SeparateDataSavepointManager.rollback(conn,name));
    }

    @Override
    public void releaseSavepoint(Savepoint savepoint) throws SQLException {
        String name = savepoint.getSavepointName();
        for(Connection connection:getConnections()){
            SeparateDataSavepointManager.releaseSavepoint(connection,name);
        }
        methodForInvoke.offer((conn,a)->SeparateDataSavepointManager.releaseSavepoint(conn,name));
    }

    @Override
    public boolean isValid(int timeout) throws SQLException {
        for (Connection connection : this.getConnections()) {
            if(!connection.isValid(timeout)){
                return false;
            }
        }
        return true;
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
