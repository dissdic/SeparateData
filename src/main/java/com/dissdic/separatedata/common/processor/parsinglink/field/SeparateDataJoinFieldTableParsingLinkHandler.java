package com.dissdic.separatedata.common.processor.parsinglink.field;

import com.dissdic.separatedata.common.meta.SeparateDataField;
import com.dissdic.separatedata.common.processor.parsinglink.SeparateDataAbstractParsingLinkHandler;
import com.dissdic.separatedata.common.processor.postgresql.Select.SelectParser;

public class SeparateDataJoinFieldTableParsingLinkHandler extends SeparateDataAbstractParsingLinkHandler<SeparateDataField, SelectParser.TabledotfieldContext> {
    @Override
    protected void handle(SelectParser.TabledotfieldContext tabledotfieldContext, SeparateDataField field) {
        if(tabledotfieldContext!=null){
            tabledotfieldContext.nameoralias();
            tabledotfieldContext.name();
        }
    }
}
