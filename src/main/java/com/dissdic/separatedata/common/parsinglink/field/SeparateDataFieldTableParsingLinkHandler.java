package com.dissdic.separatedata.common.parsinglink.field;

import com.dissdic.separatedata.common.meta.SeparateDataField;
import com.dissdic.separatedata.common.parsinglink.SeparateDataAbstractParsingLinkHandler;
import com.dissdic.separatedata.common.processor.postgresql.Select.SelectParser;

public class SeparateDataFieldTableParsingLinkHandler extends SeparateDataAbstractParsingLinkHandler<SeparateDataField, SelectParser.TabledotfieldContext> {
    @Override
    public SeparateDataField handle(SelectParser.TabledotfieldContext tabledotfieldContext) {
        return null;
    }
}
