package com.dissdic.separatedata.common.parsinglink;

import com.dissdic.separatedata.common.parsinglink.field.SeparateDataFieldAliasParsingLinkHandler;
import com.dissdic.separatedata.common.parsinglink.field.SeparateDataFieldNameParsingLinkHandler;
import com.dissdic.separatedata.common.parsinglink.field.SeparateDataFieldTableParsingLinkHandler;
import org.antlr.v4.runtime.ParserRuleContext;

public class SeparateDataParsingLinkEntrance {

    //字段解析责任链 减少判断代码块
    public <T,E extends ParserRuleContext>  SeparateDataFieldNameParsingLinkHandler initFieldParsingLink(){

        SeparateDataFieldNameParsingLinkHandler n = new SeparateDataFieldNameParsingLinkHandler();
        SeparateDataFieldAliasParsingLinkHandler a = new SeparateDataFieldAliasParsingLinkHandler();
        SeparateDataFieldTableParsingLinkHandler t = new SeparateDataFieldTableParsingLinkHandler();

        n.setNextNode(t);
        t.setNextNode(a);

        return n;
    }
}
