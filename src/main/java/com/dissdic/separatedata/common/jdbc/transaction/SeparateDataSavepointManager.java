package com.dissdic.separatedata.common.jdbc.transaction;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.util.*;

public class SeparateDataSavepointManager {

    private static Map<Connection, Map<String,Savepoint>> savepointMap = new HashMap<>();
    public static void setSavepoint(Connection conn, String name) throws SQLException {
        Savepoint sp = conn.setSavepoint(name);
        savepointMap.computeIfAbsent(conn,(cn)-> new HashMap<>()).put(name,sp);
    }

    public static void rollback(Connection conn,String name) throws SQLException{
        Map<String,Savepoint> map = savepointMap.get(conn);
        if(map!=null){
            Savepoint savepoint =map.get(name);
            if(savepoint!=null){
                conn.rollback(savepoint);
            }
        }
    }

    public static void releaseSavepoint(Connection connection,String name) throws SQLException{
        Map<String,Savepoint> map = savepointMap.get(connection);
        if(map!=null){
            Savepoint savepoint =map.get(name);
            if(savepoint!=null){
                connection.releaseSavepoint(savepoint);
            }
        }
    }
}
