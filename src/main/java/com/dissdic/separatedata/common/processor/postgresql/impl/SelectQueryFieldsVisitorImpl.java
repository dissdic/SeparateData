package com.dissdic.separatedata.common.processor.postgresql.impl;

import com.dissdic.separatedata.common.meta.SeparateDataField;
import com.dissdic.separatedata.common.meta.SeparateDataTable;
import com.dissdic.separatedata.common.parsinglink.SeparateDataParsingLinkEntrance;
import com.dissdic.separatedata.common.parsinglink.field.SeparateDataFieldAliasParsingLinkHandler;
import com.dissdic.separatedata.common.parsinglink.field.SeparateDataFieldNameParsingLinkHandler;
import com.dissdic.separatedata.common.parsinglink.field.SeparateDataFieldTableParsingLinkHandler;
import com.dissdic.separatedata.common.parsinglink.table.SeparateDataTableWithAliasParsingLinkHandler;
import com.dissdic.separatedata.common.parsinglink.table.SeparateDataTableWithoutAliasParsingLinkHandler;
import com.dissdic.separatedata.common.processor.postgresql.Select.SelectBaseVisitor;
import com.dissdic.separatedata.common.processor.postgresql.Select.SelectParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class SelectQueryFieldsVisitorImpl extends SelectBaseVisitor<String> {

    private List<SeparateDataTable> separateDataTables = new ArrayList<>();
    private List<SeparateDataField> separateDataFields = new ArrayList<>();
    private boolean queryAllFieldsOfAllTables = false;
    
    private List<>


    @Override
    public String visitQueryfields(SelectParser.QueryfieldsContext ctx) {
        List<SelectParser.QueryfieldsContext> list = ctx.queryfields();
        if(list!=null && !list.isEmpty()){

            for (int i = 0; i < list.size(); i++) {

                SelectParser.QueryfieldsContext fieldsContext = list.get(i);
                TerminalNode sr = fieldsContext.compute().field().SR();
                if(sr!=null){
                    queryAllFieldsOfAllTables = true;
                    break;
                }
                SeparateDataParsingLinkEntrance<SeparateDataField> entrance = new SeparateDataParsingLinkEntrance<>();
                entrance.addParsingLink(new SeparateDataFieldNameParsingLinkHandler(),fieldsContext)
                        .addParsingLink(new SeparateDataFieldAliasParsingLinkHandler(),fieldsContext.alias())
                        .addParsingLink(new SeparateDataFieldTableParsingLinkHandler(),fieldsContext.compute().field().tabledotfield());
                SeparateDataField field = new SeparateDataField();
                separateDataFields.add(field);
                entrance.invoke(field);
            }
        }

        return "1";
    }

    @Override
    public String visitGroupbyfields(SelectParser.GroupbyfieldsContext ctx) {
        return "2";
    }

    @Override
    public String visitWhere(SelectParser.WhereContext ctx) {
        return "3";
    }

    @Override
    public String visitTables(SelectParser.TablesContext ctx) {
        List<SelectParser.TablesContext> tablesContexts = ctx.tables();
        for (int i = 0; i < tablesContexts.size(); i++) {
            SelectParser.TablesContext tablesContext = tablesContexts.get(i);
            SeparateDataTable table = new SeparateDataTable();
            separateDataTables.add(table);

            SeparateDataParsingLinkEntrance<SeparateDataTable> entrance = new SeparateDataParsingLinkEntrance<>();
            entrance.addParsingLink(new SeparateDataTableWithAliasParsingLinkHandler(),tablesContext.table().tablewithalias())
                    .addParsingLink(new SeparateDataTableWithoutAliasParsingLinkHandler(),tablesContext.table().tablewithoutalias())
                    .invoke(table);

        }
        return "4";
    }

    @Override
    public String visitOrderbyfields(SelectParser.OrderbyfieldsContext ctx) {
        return "5";
    }
}
