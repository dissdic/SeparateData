package com.dissdic.separatedata.common.operation;

import java.sql.Connection;
import java.sql.SQLException;

@FunctionalInterface
public interface ConnectionOperation<T> {
    public void operate(Connection connection,T t) throws SQLException;
}
