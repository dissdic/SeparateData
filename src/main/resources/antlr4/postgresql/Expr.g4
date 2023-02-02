grammar Expr;
import Basic;

join : ((((LEFT|RIGHT|FULL) OUTER?) | INNER) JOIN) jointable (ON joinwhere | USING LB usingfields RB);

queryfields : fields|SR;

fields : fields COMMA fields | field | groupfunctionexpr | cube | rollup | groupingsets;

tables : tables COMMA tables | table;

usingfields : usingfields COMMA usingfields | fieldwithoutalias;

jointable : table;

joinwhere : where;

where : where relation where | '(' where ')'| singlewhere;

singlewhere : field ((relator fieldorvalue) | NOT? IN '('values')');

//聚集函数不可出现在where子句中
groupfunctionexpr : groupfunctionname '('(.*? field)*')';

groupingsets : GROUPING SETS '('(.*? field)*')';

cube : CUBE '('(.*? field)*')';

rollup : ROLLUP '('(.*? field)*')';


