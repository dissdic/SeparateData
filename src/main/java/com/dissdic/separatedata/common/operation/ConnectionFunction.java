package com.dissdic.separatedata.common.operation;

import java.sql.SQLException;

@FunctionalInterface
public interface ConnectionFunction<T,E> {

     public E apply(T t) throws SQLException;
}
