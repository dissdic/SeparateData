package com.dissdic.separatedata.common.processor.postgresql;

import com.dissdic.separatedata.common.exception.ANTLR4ParserNotExistException;
import com.sun.deploy.util.ReflectionUtil;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.lang.reflect.Method;

public class SeparateDataProcessorTrigger {


    public ParseTree parseTree(String sql, String grammar, String parser)  throws Throwable  {

        CodePointCharStream stream = CharStreams.fromString(sql);
        String className = grammar + "Lexer";
        String packageName = this.getClass().getPackage().getName()+"."+grammar;
        className = packageName + "." + className;
        TokenSource tokenSource = (TokenSource)ReflectionUtil.createInstance(className,new Class[]{CharStream.class},new Object[]{stream},this.getClass().getClassLoader());
        CommonTokenStream tokens = new CommonTokenStream(tokenSource);

        className = packageName + "." + grammar + "Parser";
        Object obj = ReflectionUtil.createInstance(className,new Class[]{TokenStream.class},new Object[]{tokens},this.getClass().getClassLoader());
        Method method;
        try {
            method = ReflectionUtil.getMethod(obj, parser, null, true);
        }catch (NoSuchMethodException t){
            throw new ANTLR4ParserNotExistException();
        }
        return (ParseTree)method.invoke(obj);
    }

    public void walk(String sql, String grammar, String parser, ParseTreeListener listener) throws Throwable {
        ParseTreeWalker.DEFAULT.walk(listener,parseTree(sql,grammar,parser));
    }

    public <T> void visit(String sql, String grammar, String parser, ParseTreeVisitor<T> visitor) throws Throwable {
        visitor.visit(parseTree(sql, grammar, parser));
    }
}
