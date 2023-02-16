package com.dissdic.separatedata.common.processor.parsinglink.field;

import com.dissdic.separatedata.common.meta.SeparateDataField;
import com.dissdic.separatedata.common.meta.SeparateDataTable;
import com.dissdic.separatedata.common.processor.parsinglink.SeparateDataAbstractParsingLinkHandler;
import com.dissdic.separatedata.common.processor.postgresql.Select.SelectParser;
import com.dissdic.separatedata.common.processor.postgresql.SeparateDataVisitorContextHolder;

import java.util.List;

public class SeparateDataJoinFieldTableParsingLinkHandler extends SeparateDataAbstractParsingLinkHandler<SeparateDataField, SelectParser.TabledotfieldContext> {
    @Override
    protected void handle(SelectParser.TabledotfieldContext tabledotfieldContext, SeparateDataField field) {
        if(tabledotfieldContext!=null){

            SelectParser.NameoraliasContext nameoralias = tabledotfieldContext.nameoralias();
            String tableAlias = nameoralias.getText();
            List<SeparateDataTable> tables = SeparateDataVisitorContextHolder.SELECT.getParsingTableList();
            SeparateDataTable table = tables.stream().filter(c->tableAlias.equalsIgnoreCase(c.getAlias())).findFirst().orElse(null);
            if(table!=null){
                field.setTable(table);
            }
            SelectParser.NameContext nameContext = tabledotfieldContext.name();


        }
    }
}
