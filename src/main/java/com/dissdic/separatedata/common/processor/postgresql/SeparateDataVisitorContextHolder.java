package com.dissdic.separatedata.common.processor.postgresql;

import com.dissdic.separatedata.common.meta.SeparateDataField;
import com.dissdic.separatedata.common.meta.SeparateDataParsingResult;
import com.dissdic.separatedata.common.meta.SeparateDataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SeparateDataVisitorContextHolder {


    public static class SELECT{

        private static final ThreadLocal<SeparateDataParsingResult> parsingResultContext = new ThreadLocal<>();

        public static void querying(boolean querying){
            getParsingResultContext().setQuerying(querying);
        }

        public static void setTmpAlias(String tmpAlias){
            getParsingResultContext().setTmpAlias(tmpAlias);
        }

        public static void resetTmpAlias(){
            getParsingResultContext().setTmpAlias(null);
        }

        public static Map<String,List<SeparateDataField>> map;

        public static void setQueryAll(boolean all){
            getParsingResultContext().setQueryAllFieldsOfAllTables(all);
        }

        public static boolean getQueryAll(){
            return getParsingResultContext().isQueryAllFieldsOfAllTables();
        }

        public static void addParsingField(SeparateDataField separateDataField){

            separateDataField.setQuery(getParsingResultContext().isQuerying());
            getParsingFieldList().add(separateDataField);
            if(getParsingResultContext().getTmpAlias()!=null){
                List<SeparateDataField> fields = getAlias2Fields().get(getParsingResultContext().getTmpAlias());
                if(fields==null){
                    fields = new ArrayList<>();
                    fields.add(separateDataField);
                    getAlias2Fields().put(getParsingResultContext().getTmpAlias(),fields);
                }else{
                    fields.add(separateDataField);
                }
            }
        }

        public static Map<String,List<SeparateDataField>> getAlias2Fields(){
            return getParsingResultContext().getAlias2Fields();
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
