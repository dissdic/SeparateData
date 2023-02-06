package com.dissdic.separatedata;

import com.dissdic.separatedata.common.processor.postgresql.SeparateDataProcessorTrigger;
import com.dissdic.separatedata.common.processor.postgresql.impl.SelectQueryFieldsVisitorImpl;
import org.junit.jupiter.api.Test;

public class ANTLRTest {


    @Test
    public void testVisit() throws Throwable{
        String input = "select user.name as au,age ua from user user where id=1 and age>1";
        SelectQueryFieldsVisitorImpl visitor = new SelectQueryFieldsVisitorImpl();
        SeparateDataProcessorTrigger trigger = new SeparateDataProcessorTrigger();
        String sql = trigger.visit(input,"Select","select",visitor);
        System.out.println(sql);
    }
}
