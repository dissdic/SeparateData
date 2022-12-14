package com.dissdic.separatedata;

import com.dissdic.separatedata.common.processor.postgresql.SeparateDataProcessorTrigger;
import com.dissdic.separatedata.common.processor.postgresql.impl.SelectListenerImpl;
import org.junit.jupiter.api.Test;

public class ANTLRTest {

    @Test
    public void testEnter() throws Throwable{
        String input = "select name,age from user where id=1 and age>1";
        SelectListenerImpl listener = new SelectListenerImpl();
        SeparateDataProcessorTrigger trigger = new SeparateDataProcessorTrigger();
        trigger.walk(input,"Select","select",listener);
    }
}
