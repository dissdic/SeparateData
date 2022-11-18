package com.dissdic.separatedata.common.exception;

import java.sql.Connection;
import java.sql.SQLWarning;
import java.util.Collection;

public class SeparateDataSQLWarning extends SQLWarning {

    public SeparateDataSQLWarning(Collection<Connection> connections){
        for (Connection connection : connections) {
            connection.getWarnings();
        }
    }
}
