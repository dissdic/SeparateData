grammar PostgreSQL;
import Keyword,Norm;
tokens {OTHER}
stat: SELECT el+=fields FROM tables ;

fields : tables | ALL;
tables : tables COMMA tables | tableOrField;
tableOrField : tableOrField AS tableOrField | ID;
where : where (AND|OR) where | singlewhere;
singlewhere : ID (EQ|IS|(IS NOT)|GT|LT|GE|LE|BI|NE) ID;
WS : [ \t\n\r]+ ->skip;




