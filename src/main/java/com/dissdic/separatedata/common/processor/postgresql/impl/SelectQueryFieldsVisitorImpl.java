package com.dissdic.separatedata.common.processor.postgresql.impl;

import com.dissdic.separatedata.common.meta.SeparateDataField;
import com.dissdic.separatedata.common.meta.SeparateDataTable;
import com.dissdic.separatedata.common.processor.postgresql.Select.SelectBaseVisitor;
import com.dissdic.separatedata.common.processor.postgresql.Select.SelectParser;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SelectQueryFieldsVisitorImpl extends SelectBaseVisitor<String> {

    private SeparateDataTable[] separateDataTables;
    private SeparateDataField[] separateDataFields;

    @Override
    public String visitField(SelectParser.FieldContext ctx) {
        SeparateDataField separateDataField = new SeparateDataField();
        SelectParser.FieldwithaliasContext context = ctx.fieldwithalias();
        if(context != null){
            SelectParser.FieldwithoutaliasContext con = context.fieldwithoutalias();
            SelectParser.AliasContext aliasContext = context.alias();
            separateDataField.setName(con.getText());
            separateDataField.setAlias(aliasContext.getText());
        }else{
            SelectParser.FieldwithoutaliasContext con = ctx.fieldwithoutalias();
            separateDataField.setName(con.getText());

        }
        return super.visitField(ctx);
    }

    @Override
    public String visitTables(SelectParser.TablesContext ctx) {


        return super.visitTables(ctx);

    }

    @Override
    public String visitQueryfields(SelectParser.QueryfieldsContext ctx) {
        SelectParser.FieldsContext fieldsContext = ctx.fields();
        SelectParser.FieldContext fieldContext = fieldsContext.field();
        if(fieldContext!=null){

        }else{
            List<SelectParser.FieldsContext> fieldsContexts = fieldsContext.fields();
            if(fieldsContexts!=null && fieldsContexts.size()>0){

            }else{

            }
        }
        return super.visitQueryfields(ctx);
    }



    @Override
    public String visitWhere(SelectParser.WhereContext ctx) {
        return super.visitWhere(ctx);
    }
}
