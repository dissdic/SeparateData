package com.dissdic.separatedata.common.exception;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.util.Collection;

public class SeparateDataSQLWarning extends SQLWarning {

    public SeparateDataSQLWarning(Collection<Connection> connections) throws SQLException {
        SQLWarning current = this.getNextWarning();
        for (Connection connection : connections) {
            if(connection.getWarnings()==null){
                continue;
            }
            if (current==null){
                current = connection.getWarnings();
                this.setNextWarning(current);
                continue;
            }
            for(;;){
                SQLWarning next = current.getNextWarning();
                if(next!=null){
                    current = next;
                }else{
                    break;
                }
            }
            current.setNextWarning(connection.getWarnings());
            current = connection.getWarnings();
        }
    }
}
