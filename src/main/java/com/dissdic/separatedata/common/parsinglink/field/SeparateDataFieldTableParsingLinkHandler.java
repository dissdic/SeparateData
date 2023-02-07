package com.dissdic.separatedata.common.parsinglink.field;

import com.dissdic.separatedata.common.meta.SeparateDataField;
import com.dissdic.separatedata.common.meta.SeparateDataTable;
import com.dissdic.separatedata.common.parsinglink.SeparateDataAbstractParsingLinkHandler;
import com.dissdic.separatedata.common.processor.postgresql.Select.SelectParser;
import org.antlr.v4.runtime.tree.TerminalNode;

public class SeparateDataFieldTableParsingLinkHandler extends SeparateDataAbstractParsingLinkHandler<SeparateDataField, SelectParser.TabledotfieldContext> {

    @Override
    protected void handle(SelectParser.TabledotfieldContext tabledotfieldContext, SeparateDataField field) {
        if(tabledotfieldContext!=null){
            String tn = tabledotfieldContext.nameoralias().getText();
            SeparateDataTable table = new SeparateDataTable();
            table.setAlias(tn);
            field.setTable(table);
            SelectParser.NameContext nameContext1 = tabledotfieldContext.name();
            if(nameContext1!=null){
                field.setName(nameContext1.getText());
            }
            TerminalNode srNode = tabledotfieldContext.SR();
            if(srNode!=null){
                field.setAll(true);
            }
        }
    }
}
