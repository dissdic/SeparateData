grammar Expr;
import Basic;

join : ((((LEFT|RIGHT|FULL) OUTER?) | INNER) JOIN) jointable ON joinwhere;
queryfields : fields|SR;
fields : fields COMMA fields | field | groupfunctionexpr | cube | rollup | groupingsets;
tables : tables COMMA tables | table;
values : values COMMA values | Value;
jointable : table;
joinwhere : where;

where : where relation where | '(' where ')'| singlewhere;
singlewhere : field ((relator fieldorvalue) | NOT? IN '('values')');
groupfunctionexpr : groupfunctionname '('(.*? field)*')';
groupingsets : GROUPING SETS '('(.*? field)*')';
cube : CUBE '('(.*? field)*')';
rollup : ROLLUP '('(.*? field)*')';

condition : compute relator compute;
compute : compute (PLUS|SUB|SR|DS|TUB|MG|PC|IX) compute | Value | fieldwithoutalias |
    |   LB compute RB
    ;
