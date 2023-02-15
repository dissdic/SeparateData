package com.dissdic.separatedata.common.processor.postgresql;

import com.dissdic.separatedata.common.meta.SeparateDataField;
import com.dissdic.separatedata.common.meta.SeparateDataParsingResult;
import com.dissdic.separatedata.common.meta.SeparateDataTable;
import com.dissdic.separatedata.common.processor.postgresql.Select.SelectVisitor;
import com.dissdic.separatedata.common.processor.postgresql.impl.SeparateDataSelectVisitorImpl;

import java.util.List;

public class SeparateDataVisitorContextHolder {


    public static class SELECT{

        private static final ThreadLocal<SeparateDataParsingResult> parsingResultContext = new ThreadLocal<>();

        public static void setQueryAll(boolean all){
            getParsingResultContext().setQueryAllFieldsOfAllTables(all);
        }

        public static boolean getQueryAll(){
            return getParsingResultContext().isQueryAllFieldsOfAllTables();
        }

        public static void addParsingFiled(SeparateDataField separateDataField){
            getParsingFieldList().add(separateDataField);
        }

        public static List<SeparateDataField> getParsingFieldList(){
            return getParsingResultContext().getSeparateDataFields();
        }

        public static void addParsingTable(SeparateDataTable table){
            getParsingTableList().add(table);
        }

        public static List<SeparateDataTable> getParsingTableList(){
            return getParsingResultContext().getSeparateDataTables();
        }

        public static void setParsingResultContext(SeparateDataParsingResult separateDataParsingResult){
            parsingResultContext.set(separateDataParsingResult);
        }

        public static SeparateDataParsingResult getParsingResultContext(){
            return parsingResultContext.get();
        }

        public static void reset(){
            parsingResultContext.remove();
        }
    }

}
