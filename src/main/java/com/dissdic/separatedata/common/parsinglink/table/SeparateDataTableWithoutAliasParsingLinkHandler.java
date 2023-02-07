package com.dissdic.separatedata.common.parsinglink.table;

import com.dissdic.separatedata.common.meta.SeparateDataTable;
import com.dissdic.separatedata.common.parsinglink.SeparateDataAbstractParsingLinkHandler;
import com.dissdic.separatedata.common.processor.postgresql.Select.SelectParser;

public class SeparateDataTableWithoutAliasParsingLinkHandler extends SeparateDataAbstractParsingLinkHandler<SeparateDataTable, SelectParser.TablewithoutaliasContext> {

    @Override
    protected void handle(SelectParser.TablewithoutaliasContext tablewithoutaliasContext, SeparateDataTable separateDataTable) {
        if(tablewithoutaliasContext!=null){
            String name = tablewithoutaliasContext.name().getText();
            separateDataTable.setName(name);
        }
    }
}
