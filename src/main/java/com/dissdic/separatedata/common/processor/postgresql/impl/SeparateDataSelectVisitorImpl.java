package com.dissdic.separatedata.common.processor.postgresql.impl;

import com.dissdic.separatedata.common.meta.SeparateDataField;
import com.dissdic.separatedata.common.meta.SeparateDataTable;
import com.dissdic.separatedata.common.processor.parsinglink.SeparateDataParsingLinkEntrance;
import com.dissdic.separatedata.common.processor.parsinglink.field.*;
import com.dissdic.separatedata.common.processor.parsinglink.table.SeparateDataTableWithAliasParsingLinkHandler;
import com.dissdic.separatedata.common.processor.parsinglink.table.SeparateDataTableWithoutAliasParsingLinkHandler;
import com.dissdic.separatedata.common.processor.postgresql.Select.SelectBaseVisitor;
import com.dissdic.separatedata.common.processor.postgresql.Select.SelectParser;
import com.dissdic.separatedata.common.processor.postgresql.SeparateDataVisitorContextHolder;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class SeparateDataSelectVisitorImpl extends SelectBaseVisitor<Object> {

    @Override
    public Object visitQueryfield(SelectParser.QueryfieldContext ctx) {

        SeparateDataVisitorContextHolder.SELECT.resetTmpAlias();
        SelectParser.AliasContext aliasContext = ctx.alias();
        if(aliasContext!=null){
            SeparateDataVisitorContextHolder.SELECT.setTmpAlias(aliasContext.getText());
        }
        return super.visitQueryfield(ctx);
    }



    @Override
    public Object visitField(SelectParser.FieldContext ctx) {
        parseField(ctx);
        return null;
    }

    @Override
    public Object visitGroupbyfields(SelectParser.GroupbyfieldsContext ctx) {
        return null;
    }


    @Override
    public Object visitTable(SelectParser.TableContext ctx) {
        parseTable(ctx);
        return null;
    }

    @Override
    public Object visitOrderbyfields(SelectParser.OrderbyfieldsContext ctx) {
        return "5";
    }

    private void parseTable(SelectParser.TableContext tableContext){
        SeparateDataTable table = new SeparateDataTable();
        SeparateDataVisitorContextHolder.SELECT.addParsingTable(table);
        //责任链过滤链
        SeparateDataParsingLinkEntrance<SeparateDataTable> entrance = new SeparateDataParsingLinkEntrance<>();
        entrance.addParsingLink(new SeparateDataTableWithAliasParsingLinkHandler(),tableContext.tablewithalias())
                .addParsingLink(new SeparateDataTableWithoutAliasParsingLinkHandler(),tableContext.tablewithoutalias())
                .invoke(table);

    }

    private void parseField(SelectParser.FieldContext fieldContext){
        TerminalNode sr = fieldContext.SR();
        if(sr!=null){
            SeparateDataVisitorContextHolder.SELECT.setQueryAll(true);
            return;
        }
        SeparateDataParsingLinkEntrance<SeparateDataField> entrance = new SeparateDataParsingLinkEntrance<>();
        SeparateDataField field = new SeparateDataField();
        SeparateDataVisitorContextHolder.SELECT.addParsingField(field);
        entrance.addParsingLink(new SeparateDataFieldNameParsingLinkHandler(),fieldContext.name())
                .addParsingLink(new SeparateDataFieldTableParsingLinkHandler(),fieldContext.tabledotfield())
        .invoke(field);
    }
}
