package com.dissdic.separatedata.common.parsinglink;

import com.dissdic.separatedata.common.parsinglink.field.SeparateDataFieldAliasParsingLinkHandler;
import com.dissdic.separatedata.common.parsinglink.field.SeparateDataFieldNameParsingLinkHandler;
import com.dissdic.separatedata.common.parsinglink.field.SeparateDataFieldTableParsingLinkHandler;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.LinkedList;

public class SeparateDataParsingLinkEntrance<T> {

    private SeparateDataAbstractParsingLinkHandler<T,?> head;

    private SeparateDataAbstractParsingLinkHandler<T,?> tail;

    //字段解析责任链 减少判断代码块
    public <E> SeparateDataParsingLinkEntrance<T> addParsingLink(SeparateDataAbstractParsingLinkHandler<T,E> handler,E e){
        handler.setArg(e);
        if(head==null){
            this.head = handler;
            this.tail = handler;
        }else{
            this.tail.setNextNode(handler);
            this.tail = handler;
        }

        return this;
    }

    public T invoke(T t){
        return this.head.execute(t);
    }

}
