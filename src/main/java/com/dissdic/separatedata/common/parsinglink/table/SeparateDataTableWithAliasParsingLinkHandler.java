package com.dissdic.separatedata.common.parsinglink.table;

import com.dissdic.separatedata.common.meta.SeparateDataTable;
import com.dissdic.separatedata.common.parsinglink.SeparateDataAbstractParsingLinkHandler;
import com.dissdic.separatedata.common.processor.postgresql.Select.SelectParser;

public class SeparateDataTableWithAliasParsingLinkHandler extends SeparateDataAbstractParsingLinkHandler<SeparateDataTable, SelectParser.TablewithaliasContext> {

    @Override
    protected void handle(SelectParser.TablewithaliasContext tablewithaliasContext, SeparateDataTable separateDataTable) {
        if(tablewithaliasContext!=null){
            String name = tablewithaliasContext.tablewithoutalias().name().getText();
            String alias = tablewithaliasContext.alias().getText();
            separateDataTable.setName(name);
            separateDataTable.setAlias(alias);
        }
    }
}
