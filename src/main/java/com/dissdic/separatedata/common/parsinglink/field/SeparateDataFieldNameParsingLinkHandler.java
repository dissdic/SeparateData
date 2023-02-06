package com.dissdic.separatedata.common.parsinglink.field;

import com.dissdic.separatedata.common.meta.SeparateDataField;
import com.dissdic.separatedata.common.parsinglink.SeparateDataAbstractParsingLinkHandler;
import com.dissdic.separatedata.common.processor.postgresql.Select.SelectParser;

public class SeparateDataFieldNameParsingLinkHandler extends SeparateDataAbstractParsingLinkHandler<SeparateDataField, SelectParser.QueryfieldsContext> {
    @Override
    public SeparateDataField handle(SelectParser.QueryfieldsContext queryfieldsContext) {
        return null;
    }
}
