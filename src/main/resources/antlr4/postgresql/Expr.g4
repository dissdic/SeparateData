grammar Expr;
import Keyword,Norm;


fields : fields COMMA fields | field;
tables : tables COMMA tables | table;
values : values ',' values | VALUE;
table : TABLEORFIELD AS TABLEORFIELD | TABLEORFIELD;
field : (tabledotfield | TABLEORFIELD) AS TABLEORFIELD | TABLEORFIELD;
where : where (AND|OR) where | '(' where ')'| singlewhere;
singlewhere : (tabledotfield|TABLEORFIELD) (((EQ|IS|(IS NOT)|GT|LT|GE|LE|BI|NE) (VALUE|tabledotfield)) | NOT? IN '('values')');
tabledotfield : TABLEORFIELD DOT TABLEORFIELD;
