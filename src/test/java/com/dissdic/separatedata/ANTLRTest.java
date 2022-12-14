package com.dissdic.separatedata;

import com.dissdic.separatedata.common.processor.postgresql.SeparateDataProcessorTrigger;
import com.dissdic.separatedata.common.processor.postgresql.impl.SelectSelectFieldsListenerImpl;
import com.dissdic.separatedata.common.processor.postgresql.impl.SelectQueryFieldsVisitorImpl;
import org.junit.jupiter.api.Test;

public class ANTLRTest {

    @Test
    public void testEnter() throws Throwable{
        String input = "select name,age from user where id=1 and age>1";
        SelectSelectFieldsListenerImpl listener = new SelectSelectFieldsListenerImpl();
        SeparateDataProcessorTrigger trigger = new SeparateDataProcessorTrigger();
        trigger.walk(input,"Select","select3",listener);
    }

    @Test
    public void testVisit() throws Throwable{
        String input = "select name,age from user where id=1 and age>1";
        SelectQueryFieldsVisitorImpl visitor = new SelectQueryFieldsVisitorImpl();
        SeparateDataProcessorTrigger trigger = new SeparateDataProcessorTrigger();
        trigger.visit(input,"Select","select",visitor);
    }
}
