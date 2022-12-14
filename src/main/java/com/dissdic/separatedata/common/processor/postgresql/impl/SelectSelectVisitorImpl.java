package com.dissdic.separatedata.common.processor.postgresql.impl;

import com.dissdic.separatedata.common.processor.postgresql.Select.SelectBaseVisitor;
import com.dissdic.separatedata.common.processor.postgresql.Select.SelectParser;

public class SelectSelectVisitorImpl extends SelectBaseVisitor<String> {


    @Override
    public String visitTables(SelectParser.TablesContext ctx) {
        return super.visitTables(ctx);
    }

    @Override
    public String visitFields(SelectParser.FieldsContext ctx) {
        return super.visitFields(ctx);
    }

    @Override
    public String visitWhere(SelectParser.WhereContext ctx) {
        return super.visitWhere(ctx);
    }
}
