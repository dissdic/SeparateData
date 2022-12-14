package com.dissdic.separatedata.common.processor.postgresql.impl;

import com.dissdic.separatedata.common.exception.ANTLR4ParserNotMatchException;

import com.dissdic.separatedata.common.meta.SeparateDataField;
import com.dissdic.separatedata.common.processor.postgresql.Select.SelectBaseListener;
import com.dissdic.separatedata.common.processor.postgresql.Select.SelectParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;

public class SelectSelectListenerImpl extends SelectBaseListener {

    private SeparateDataField[] queryFields;

    private boolean hasError(ParserRuleContext context){
        for (ParseTree child : context.children) {
            if (child instanceof ErrorNode){
                return true;
            }
        }
        return false;
    }
}
