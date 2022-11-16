package com.dissdic.separatedata.common.context;

import com.dissdic.separatedata.common.jdbc.connection.manager.ConnectionManager;

import java.lang.reflect.InvocationHandler;

public class ContextHolder {

    static RuleAndDataSourceContext context;

    static InvocationHandler connectionManagerHandler;

    public static void setContext(RuleAndDataSourceContext context){
        ContextHolder.context = context;
    }

    public static RuleAndDataSourceContext getContext(){
        return ContextHolder.context;
    }

    public static void setConnectionManagerHandler(InvocationHandler invocationHandler){
        ContextHolder.connectionManagerHandler = invocationHandler;
    }

    public static InvocationHandler getConnectionManagerHandler(){
        return ContextHolder.connectionManagerHandler;
    }
}
