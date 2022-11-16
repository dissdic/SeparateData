package com.dissdic.separatedata.common.jdbc.connection.manager;

import java.sql.Connection;

public interface ConnectionManager {

    public Connection getConnection(String dataBase);
}
