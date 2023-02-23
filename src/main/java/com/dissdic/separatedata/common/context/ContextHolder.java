package com.dissdic.separatedata.common.context;

import java.lang.reflect.InvocationHandler;

public class ContextHolder {

    static SeparateDataShardingRuleAndDataSourceContext context;

    static InvocationHandler connectionManagerHandler;

    public static void setContext(SeparateDataShardingRuleAndDataSourceContext context){
        ContextHolder.context = context;
    }

    public static SeparateDataShardingRuleAndDataSourceContext getContext(){
        return ContextHolder.context;
    }

    public static void setConnectionManagerHandler(InvocationHandler invocationHandler){
        ContextHolder.connectionManagerHandler = invocationHandler;
    }

    public static InvocationHandler getConnectionManagerHandler(){
        return ContextHolder.connectionManagerHandler;
    }
}
