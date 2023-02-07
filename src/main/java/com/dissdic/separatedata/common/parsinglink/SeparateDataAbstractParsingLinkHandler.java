package com.dissdic.separatedata.common.parsinglink;

import com.sun.deploy.util.ReflectionUtil;

public abstract class SeparateDataAbstractParsingLinkHandler<T,E> {

    private SeparateDataAbstractParsingLinkHandler<T,?> nextNode;

    private E e;

    public void setArg(E e){
        this.e = e;
    }

    public T execute(T current){

        this.handle(e,current);
        if(this.nextNode!=null){
            //获取下个节点执行所需要的参数
            return this.nextNode.execute(current);
        }else {
            return current;
        }
    }
    protected abstract void handle(E e,T t);

    public <R> void setNextNode(SeparateDataAbstractParsingLinkHandler<T,R> nextNode){
        this.nextNode = nextNode;
    }

    public <R> SeparateDataAbstractParsingLinkHandler<T,R> getNextNode(){
        return (SeparateDataAbstractParsingLinkHandler<T, R>) this.nextNode;
    }

}
