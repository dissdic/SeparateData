package com.dissdic.separatedata.common.processor.postgresql.impl;

import com.dissdic.separatedata.common.processor.postgresql.Select.SelectBaseVisitor;
import com.dissdic.separatedata.common.processor.postgresql.Select.SelectParser;

public class SeparateDataSelectConvertVisitorImpl extends SelectBaseVisitor<String> {

    @Override
    public String visitQueryfields(SelectParser.QueryfieldsContext ctx) {
        return super.visitQueryfields(ctx);
    }
}
