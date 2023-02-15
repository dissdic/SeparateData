package com.dissdic.separatedata.common.processor.postgresql.impl;

import com.dissdic.separatedata.common.meta.SeparateDataField;
import com.dissdic.separatedata.common.meta.SeparateDataTable;
import com.dissdic.separatedata.common.processor.parsinglink.SeparateDataParsingLinkEntrance;
import com.dissdic.separatedata.common.processor.parsinglink.field.SeparateDataFieldAliasParsingLinkHandler;
import com.dissdic.separatedata.common.processor.parsinglink.field.SeparateDataFieldNameParsingLinkHandler;
import com.dissdic.separatedata.common.processor.parsinglink.field.SeparateDataFieldTableParsingLinkHandler;
import com.dissdic.separatedata.common.processor.parsinglink.table.SeparateDataTableWithAliasParsingLinkHandler;
import com.dissdic.separatedata.common.processor.parsinglink.table.SeparateDataTableWithoutAliasParsingLinkHandler;
import com.dissdic.separatedata.common.processor.postgresql.Select.SelectBaseVisitor;
import com.dissdic.separatedata.common.processor.postgresql.Select.SelectParser;
import com.dissdic.separatedata.common.processor.postgresql.SeparateDataVisitorContextHolder;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class SeparateDataSelectVisitorImpl extends SelectBaseVisitor<Object> {


    @Override
    public Object visitQueryfields(SelectParser.QueryfieldsContext ctx) {
        List<SelectParser.QueryfieldsContext> list = ctx.queryfields();
        if(list!=null && !list.isEmpty()){

            for (int i = 0; i < list.size(); i++) {

                SelectParser.QueryfieldsContext fieldsContext = list.get(i);
                TerminalNode sr = fieldsContext.compute().field().SR();
                if(sr!=null){
                    SeparateDataVisitorContextHolder.SELECT.setQueryAll(true);
                    break;
                }
                SeparateDataParsingLinkEntrance<SeparateDataField> entrance = new SeparateDataParsingLinkEntrance<>();
                entrance.addParsingLink(new SeparateDataFieldNameParsingLinkHandler(),fieldsContext)
                        .addParsingLink(new SeparateDataFieldAliasParsingLinkHandler(),fieldsContext.alias())
                        .addParsingLink(new SeparateDataFieldTableParsingLinkHandler(),fieldsContext.compute().field().tabledotfield());
                SeparateDataField field = new SeparateDataField();
                SeparateDataVisitorContextHolder.SELECT.addParsingFiled(field);
                entrance.invoke(field);
            }
        }

        return null;
    }

    @Override
    public Object visitGroupbyfields(SelectParser.GroupbyfieldsContext ctx) {
        return null;
    }

    @Override
    public Object visitWhere(SelectParser.WhereContext ctx) {

        return null;
    }

    @Override
    public Object visitTables(SelectParser.TablesContext ctx) {
        List<SelectParser.TablesContext> tablesContexts = ctx.tables();
        for (int i = 0; i < tablesContexts.size(); i++) {
            SelectParser.TablesContext tablesContext = tablesContexts.get(i);
            parseTable(tablesContext.table());
        }
        return null;
    }

    @Override
    public Object visitJoin(SelectParser.JoinContext ctx) {
        SelectParser.TableContext tableContext = ctx.table();
        parseTable(tableContext);

        SelectParser.FieldsContext fieldsContext = ctx.fields();
        if(fieldsContext!=null){
            List<SelectParser.FieldsContext> FieldsContextList = fieldsContext.fields();
            for (SelectParser.FieldsContext fieldsContext_ : FieldsContextList) {
                SelectParser.FieldContext fieldContext = fieldsContext_.field();
                SeparateDataField field = new SeparateDataField();
                separateDataFields.add(field);

                fieldContext.tabledotfield();
                SeparateDataParsingLinkEntrance<SeparateDataField> entrance = new SeparateDataParsingLinkEntrance<>();
                entrance.addParsingLink(new SeparateDataFieldNameParsingLinkHandler(),fieldsContext)
                        .addParsingLink(new SeparateDataFieldAliasParsingLinkHandler(),fieldsContext.alias())
                        .addParsingLink(new SeparateDataFieldTableParsingLinkHandler(),fieldsContext.compute().field().tabledotfield());
                entrance.invoke(field);

            }
        }
    }

    @Override
    public Object visitOrderbyfields(SelectParser.OrderbyfieldsContext ctx) {
        return "5";
    }

    private void parseTable(SelectParser.TableContext tableContext){
        SeparateDataTable table = new SeparateDataTable();
        separateDataTables.add(table);
        //责任链过滤链
        SeparateDataParsingLinkEntrance<SeparateDataTable> entrance = new SeparateDataParsingLinkEntrance<>();
        entrance.addParsingLink(new SeparateDataTableWithAliasParsingLinkHandler(),tableContext.tablewithalias())
                .addParsingLink(new SeparateDataTableWithoutAliasParsingLinkHandler(),tableContext.tablewithoutalias())
                .invoke(table);

    }
}
