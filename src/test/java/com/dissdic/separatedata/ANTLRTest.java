package com.dissdic.separatedata;

import com.dissdic.separatedata.common.processor.postgresql.SeparateDataProcessorTrigger;
import com.dissdic.separatedata.common.processor.postgresql.SeparateDataSQLParser;
import com.dissdic.separatedata.common.processor.postgresql.impl.SeparateDataSelectVisitorImpl;
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
        SeparateDataSQLParser parser = new SeparateDataSQLParser();
        parser.parse(sql);

    }
}
