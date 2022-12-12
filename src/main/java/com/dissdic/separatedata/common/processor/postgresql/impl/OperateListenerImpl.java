package com.dissdic.separatedata.common.processor.postgresql.impl;

import com.dissdic.separatedata.common.exception.ANTLR4ParserNotMatchException;
import com.dissdic.separatedata.common.processor.postgresql.OperateBaseListener;
import com.dissdic.separatedata.common.processor.postgresql.OperateListener;
import com.dissdic.separatedata.common.processor.postgresql.OperateParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class OperateListenerImpl extends OperateBaseListener {


    private boolean hasError(ParserRuleContext context){
        for (ParseTree child : context.children) {
            if (child instanceof ErrorNode){
                return true;
            }
        }
        return false;
    }

    @Override
    public void enterSelect(OperateParser.SelectContext ctx) {
        if(hasError(ctx)){
            throw new ANTLR4ParserNotMatchException();
        }
    }

    @Override
    public void enterTable(OperateParser.TableContext ctx) {
        System.out.println(ctx);

    }
}
