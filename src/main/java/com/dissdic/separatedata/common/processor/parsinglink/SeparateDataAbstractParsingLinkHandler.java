package com.dissdic.separatedata.common.processor.parsinglink;

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

    public <R> void appendNode(SeparateDataAbstractParsingLinkHandler<T,R> appendNode,R r){
        if(this.nextNode!=null){
            appendNode.nextNode = this.nextNode;
        }
        appendNode.setArg(r);
        this.nextNode = appendNode;
    }

}
