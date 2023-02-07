package com.dissdic.separatedata.common.parsinglink.field;

import com.dissdic.separatedata.common.meta.SeparateDataField;
import com.dissdic.separatedata.common.parsinglink.SeparateDataAbstractParsingLinkHandler;
import com.dissdic.separatedata.common.processor.postgresql.Select.SelectParser;

public class SeparateDataFieldAliasParsingLinkHandler extends SeparateDataAbstractParsingLinkHandler<SeparateDataField, SelectParser.AliasContext> {
    @Override
    public void handle(SelectParser.AliasContext aliasContext,SeparateDataField field) {
        if(aliasContext!=null){
            field.setAlias(aliasContext.static_().getText());
        }
    }
}
