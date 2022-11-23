package com.dissdic.separatedata.common.jdbc.adapter;

import com.dissdic.separatedata.common.exception.UnSupportedOperationException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Wrapper;

public abstract class SeparateWrapperAdapter implements Connection {

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        if(isWrapperFor(iface)){
            return (T) this;
        }
        throw new UnSupportedOperationException(String.format("unwrap:%s",iface.getName()));
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return iface.isInstance(this);
    }
}
