package com.dissdic.separatedata;

import com.dissdic.separatedata.common.meta.SeparateDataParsingResult;
import com.dissdic.separatedata.common.processor.postgresql.Select.SelectLexer;
import com.dissdic.separatedata.common.processor.postgresql.Select.SelectParser;
import com.dissdic.separatedata.common.processor.postgresql.SeparateDataProcessorTrigger;
import com.dissdic.separatedata.common.processor.postgresql.SeparateDataParser;
import com.dissdic.separatedata.common.processor.postgresql.SeparateDataSQLConverter;
import com.dissdic.separatedata.common.processor.postgresql.SeparateDataVisitorContextHolder;
import com.dissdic.separatedata.common.processor.postgresql.impl.SeparateDataSelectVisitorImpl;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.Test;

public class ANTLRTest {

    @Test
    public void testVisit() throws Throwable{
        String input = "     select\n user.name as au,age ua from user user where id=1 and age>1";
        SeparateDataSelectVisitorImpl visitor = new SeparateDataSelectVisitorImpl();
        SeparateDataProcessorTrigger trigger = new SeparateDataProcessorTrigger();
        trigger.visit(input,"Select","select",visitor);

    }

    @Test
    public void testvisit1() throws Throwable {

        String sql = "select user.name as au,age ua from user user,work as ww where id=1 and age>1";
        SeparateDataParser parser = new SeparateDataParser();
        parser.parse(sql);
    }

    @Test
    public void testvisit2() {
        String sql="select c1+c2 as ddf,c2+1 ui,c4 as uu,as.c5 from user a4";
        SeparateDataParsingResult result = new SeparateDataParsingResult();
        SeparateDataVisitorContextHolder.SELECT.setParsingResultContext(result);

        SeparateDataSelectVisitorImpl visitor = new SeparateDataSelectVisitorImpl();
        CodePointCharStream stream = CharStreams.fromString(sql);
        SelectLexer selectLexer = new SelectLexer(stream);

        CommonTokenStream token = new CommonTokenStream(selectLexer);
        SelectParser selectParser = new SelectParser(token);
        SelectParser.QueryfieldsContext cc = selectParser.select().queryfields();

        selectParser.select().tables();

        visitor.visitQueryfields(cc);

        System.out.println();
    }

    @Test
    public void test1(){
        SeparateDataParser parser = new SeparateDataParser();
        String sql = "select u.a+ui.b as er,js as jio,uj from user as u left join hhds as ui on u.id = ui.jj";
        parser.parse(sql);
    }

    @Test
    public void test2(){
        SeparateDataSQLConverter converter = new SeparateDataSQLConverter();
        converter.convertToCount("select name,age from user group by hhh,sdsd",null);
    }
}
