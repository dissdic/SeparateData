grammar PostgreSQL;
import Expr,Keyword,Norm;
tokens {OTHER}

select: SELECT el+=fields FROM tables (WHERE where)? (GROUP BY)? (HAVING singlewhere)? ORDER BY ;

fields : tables | STAR;
tables : tables COMMA tables | table;

where : where (AND|OR) where | '(' where ')'|singlewhere;
singlewhere : TABLEDOTFIELD (EQ|IS|(IS NOT)|GT|LT|GE|LE|BI|NE) (VALUE|TABLEDOTFIELD);







