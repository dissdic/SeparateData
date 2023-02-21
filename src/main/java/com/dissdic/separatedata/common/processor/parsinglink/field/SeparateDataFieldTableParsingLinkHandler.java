package com.dissdic.separatedata.common.processor.parsinglink.field;

import com.dissdic.separatedata.common.meta.SeparateDataField;
import com.dissdic.separatedata.common.meta.SeparateDataTable;
import com.dissdic.separatedata.common.processor.parsinglink.SeparateDataAbstractParsingLinkHandler;
import com.dissdic.separatedata.common.processor.postgresql.Select.SelectParser;
import com.dissdic.separatedata.common.processor.postgresql.SeparateDataVisitorContextHolder;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class SeparateDataFieldTableParsingLinkHandler extends SeparateDataAbstractParsingLinkHandler<SeparateDataField, SelectParser.TabledotfieldContext> {
    @Override
    protected void handle(SelectParser.TabledotfieldContext tabledotfieldContext, SeparateDataField field) {
        if(tabledotfieldContext!=null){
            SelectParser.NameoraliasContext nameoralias = tabledotfieldContext.nameoralias();
            String tableAlias = nameoralias.getText();
            field.setTableAlias(tableAlias);
            List<SeparateDataTable> tables = SeparateDataVisitorContextHolder.SELECT.getParsingTableList();
            tables.stream().filter(c -> tableAlias.equalsIgnoreCase(c.getAlias())).findFirst().ifPresent(field::setTable);
            SelectParser.NameContext nameContext = tabledotfieldContext.name();
            if(nameContext!=null){
                this.appendNode(new SeparateDataFieldNameParsingLinkHandler(),nameContext);
            }else{
                TerminalNode sr = tabledotfieldContext.SR();
                if(sr!=null){
                    field.setAll(true);
                }
            }
        }
    }
}
