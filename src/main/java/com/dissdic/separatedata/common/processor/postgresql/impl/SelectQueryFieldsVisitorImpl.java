package com.dissdic.separatedata.common.processor.postgresql.impl;

import com.dissdic.separatedata.common.meta.SeparateDataField;
import com.dissdic.separatedata.common.meta.SeparateDataTable;
import com.dissdic.separatedata.common.processor.postgresql.Select.SelectBaseVisitor;
import com.dissdic.separatedata.common.processor.postgresql.Select.SelectParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class SelectQueryFieldsVisitorImpl extends SelectBaseVisitor<String> {

    private List<SeparateDataTable> separateDataTables;
    private List<SeparateDataField> separateDataFields;

    private List<SeparateDataTable> queryAllFieldsTables;
    private boolean queryAllFieldsOfAllTables = false;

    @Override
    public String visitQueryfields(SelectParser.QueryfieldsContext ctx) {
        List<SelectParser.QueryfieldsContext> list = ctx.queryfields();
        if(list!=null && !list.isEmpty()){

            for (int i = 0; i < list.size(); i++) {
                SelectParser.QueryfieldsContext fieldsContext = list.get(i);
                TerminalNode sr = fieldsContext.compute().field().SR();
                if(sr!=null){
                    queryAllFieldsOfAllTables = true;
                    break;
                }
                SelectParser.NameContext nameContext = fieldsContext.compute().field().name();
                SeparateDataField field = new SeparateDataField();
                separateDataFields.add(field);
                if(nameContext!=null){
                    field.setName(nameContext.getText());
                }
                SelectParser.AliasContext aliasContext = fieldsContext.alias();
                if(aliasContext!=null){
                    field.setAlias(aliasContext.static_().getText());
                }
                SelectParser.TabledotfieldContext tabledotfieldContext = fieldsContext.compute().field().tabledotfield();
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

                    }
                }
            }
        }

        return super.visitQueryfields(ctx);
    }

    @Override
    public String visitGroupbyfields(SelectParser.GroupbyfieldsContext ctx) {
        return super.visitGroupbyfields(ctx);
    }

    @Override
    public String visitWhere(SelectParser.WhereContext ctx) {
        return super.visitWhere(ctx);
    }

    @Override
    public String visitTables(SelectParser.TablesContext ctx) {
        return super.visitTables(ctx);
    }

    @Override
    public String visitOrderbyfields(SelectParser.OrderbyfieldsContext ctx) {
        return super.visitOrderbyfields(ctx);
    }
}
