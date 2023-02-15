package com.dissdic.separatedata.common.processor.parsinglink.field;

import com.dissdic.separatedata.common.meta.SeparateDataField;
import com.dissdic.separatedata.common.processor.parsinglink.SeparateDataAbstractParsingLinkHandler;
import com.dissdic.separatedata.common.processor.postgresql.Select.SelectParser;

public class SeparateDataJoinFieldNameParsingLinkHandler extends SeparateDataAbstractParsingLinkHandler<SeparateDataField, SelectParser.NameContext> {
    @Override
    protected void handle(SelectParser.NameContext nameContext, SeparateDataField field) {
        if(nameContext!=null){
            field.setName(nameContext.getText());
        }
    }
}
