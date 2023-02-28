package com.dissdic.separatedata.common.processor.postgresql.impl;

import com.dissdic.separatedata.common.processor.postgresql.Select.SelectBaseVisitor;
import com.dissdic.separatedata.common.processor.postgresql.Select.SelectParser;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.tree.TerminalNode;

public class SeparateDataSelectConvertVisitorImpl extends SelectBaseVisitor<String> {

    @Override
    public String visitTerminal(TerminalNode node) {
        CommonToken commonToken = (CommonToken)node.getSymbol();
        commonToken.setText("*");
        return super.visitTerminal(node);
    }
}
