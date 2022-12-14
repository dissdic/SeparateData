package com.dissdic.separatedata.common.processor.postgresql.impl;

import com.dissdic.separatedata.common.exception.ANTLR4ParserNotMatchException;

import com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectBaseListener;
import com.dissdic.separatedata.common.processor.postgresql.Select.select.SelectParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;

public class SelectListenerImpl extends SelectBaseListener {


    private boolean hasError(ParserRuleContext context){
        for (ParseTree child : context.children) {
            if (child instanceof ErrorNode){
                return true;
            }
        }
        return false;
    }

    @Override
    public void enterSelect(SelectParser.SelectContext ctx) {
        if(hasError(ctx)){
            throw new ANTLR4ParserNotMatchException();
        }
    }

    @Override
    public void enterTable(SelectParser.TableContext ctx) {
        System.out.println(ctx);

    }
}
