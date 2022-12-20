grammar Expr;
import Calculator;

join : ((((LEFT|RIGHT|FULL) OUTER?) | INNER) JOIN) jointable ON joinwhere;
queryfields : fields|STAR;
fields : fields COMMA fields | field | groupfunctionexpr | cube | rollup | groupingsets;
tables : tables COMMA tables | table;
values : values ',' values | Value;
jointable : table;
joinwhere : where;

where : where relation where | '(' where ')'| singlewhere;
singlewhere : field ((relator fieldorvalue) | NOT? IN '('values')');
groupfunctionexpr : groupfunctionname '('(.*? field)*')';
groupingsets : GROUPING SETS '('(.*? field)*')';
cube : CUBE '('(.*? field)*')';
rollup : ROLLUP '('(.*? field)*')';

