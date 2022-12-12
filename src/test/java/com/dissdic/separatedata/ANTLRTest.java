package com.dissdic.separatedata;

import com.dissdic.separatedata.common.processor.postgresql.OperateLexer;
import com.dissdic.separatedata.common.processor.postgresql.OperateParser;
import com.dissdic.separatedata.common.processor.postgresql.impl.OperateListenerImpl;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.io.Reader;
import java.io.StringBufferInputStream;
import java.io.StringReader;

public class ANTLRTest {

    @Test
    public void testEnter(){
        String input = "select name,age from user where id=1 and age>1";
        CodePointCharStream stream = CharStreams.fromString(input);
        OperateLexer operateLexer = new OperateLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(operateLexer);
        OperateParser parser = new OperateParser(tokens);
        ParseTree tree = parser.select();
        OperateListenerImpl listener = new OperateListenerImpl();
        ParseTreeWalker.DEFAULT.walk(listener,tree);
    }
}
