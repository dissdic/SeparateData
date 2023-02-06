package com.dissdic.separatedata.common.parsinglink;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.concurrent.Callable;

public abstract class SeparateDataAbstractParsingLinkHandler<T,E extends ParserRuleContext> {

    private SeparateDataAbstractParsingLinkHandler<T,?> nextNode;

    private ? arg;

    public T execute(E e){
        T t = this.handle(e);
        if(this.nextNode!=null){
            //获取下个节点执行所需要的参数
            return this.nextNode.execute(arg);
        }else {
            return t;
        }
    }
    public abstract T handle(E e);

    public <R extends ParserRuleContext> void setNextNode(SeparateDataAbstractParsingLinkHandler<T,R> nextNode){
        this.nextNode = nextNode;
    }

    public <R extends ParserRuleContext> SeparateDataAbstractParsingLinkHandler<T,R> getNextNode(){
        return (SeparateDataAbstractParsingLinkHandler<T, R>) this.nextNode;
    }
}
