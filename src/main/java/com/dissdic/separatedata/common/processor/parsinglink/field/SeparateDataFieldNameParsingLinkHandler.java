package com.dissdic.separatedata.common.processor.parsinglink.field;

import com.dissdic.separatedata.common.meta.SeparateDataField;
import com.dissdic.separatedata.common.processor.parsinglink.SeparateDataAbstractParsingLinkHandler;
import com.dissdic.separatedata.common.processor.postgresql.Select.SelectParser;

public class SeparateDataFieldNameParsingLinkHandler extends SeparateDataAbstractParsingLinkHandler<SeparateDataField, SelectParser.QueryfieldsContext> {

    @Override
    protected void handle(SelectParser.QueryfieldsContext queryfieldsContext, SeparateDataField field) {
        SelectParser.NameContext nameContext = queryfieldsContext.compute().field().name();
        if(nameContext!=null){
            field.setName(nameContext.getText());
        }
    }
}
