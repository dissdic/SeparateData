package com.dissdic.separatedata.common.processor.postgresql;

import com.dissdic.separatedata.common.meta.SeparateDataField;
import com.dissdic.separatedata.common.meta.SeparateDataTable;
import com.dissdic.separatedata.common.meta.SeparateDataTableFieldsAdapter;
import com.dissdic.separatedata.common.processor.postgresql.Select.SelectLexer;
import com.dissdic.separatedata.common.processor.postgresql.Select.SelectParser;
import com.dissdic.separatedata.common.processor.postgresql.Select.SelectVisitor;
import com.dissdic.separatedata.common.processor.postgresql.impl.SeparateDataSelectConvertVisitorImpl;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.List;

public class SeparateDataAbstractParser {

    private SeparateDataTableFieldsAdapter separateDataTableFieldsAdapter;

    public SelectParser selectParser(String sql){
        CodePointCharStream stream = CharStreams.fromString(sql);
        SelectLexer selectLexer = new SelectLexer(stream);
        SeparateDataSelectConvertVisitorImpl visitor = new SeparateDataSelectConvertVisitorImpl();

        CommonTokenStream token = new CommonTokenStream(selectLexer);
        return new SelectParser(token);
    }

    public boolean isPresentInCondition(SeparateDataTable table){
        String alias = table.getAlias();
        if(alias!=null){
            List<SeparateDataField> fields = SeparateDataVisitorContextHolder.SELECT.getAlias2Fields().get(alias);
            return false;
        }else{
            List<String> fields = separateDataTableFieldsAdapter.fields(table.getName());
            return false;
        }
    }

}
