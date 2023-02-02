grammar Basic;
import Keyword,Norm;


field : fieldwithalias | fieldwithoutalias;

table : tablewithalias | tablewithoutalias;

tablewithalias : tablewithoutalias AS alias | tablewithoutalias alias;

fieldwithalias : fieldwithoutalias AS alias | fieldwithoutalias alias;

tablewithoutalias : name;

fieldwithoutalias : tabledotfield | name;

fieldorvalue : fieldwithoutalias | Value;

name : static;

alias : static;

nameoralias : static;

static : TABLEORFIELD | keyword | groupfunctionname;

keyword: ALL|COLLATE|CURRENT_USER|TABLE|PLACING|AND|WINDOW|SOME|TRAILING|THEN|INTO|GRANT|GROUP|CASE|UNIQUE|DEFERRABLE|CURRENT_DATE|DESC|OFFSET|OR|CURRENT_CATALOG|CAST|ANALYZE|REFERENCES|CHECK|AS|LIMIT|CURRENT_TIMESTAMP|RETURNING|FROM|NOT|WHERE|BOTH|LOCALTIMESTAMP|PRIMARY|FOR|INTERSECT|WHEN|ANALYSE|ORDER|ON|CURRENT_ROLE|INITIALLY|SYMMETRIC|LEADING|UNION|IN|CURRENT_TIME|EXCEPT|VARIADIC|END|NULL|USING|CONSTRAINT|DEFAULT|ASYMMETRIC|USER|DISTINCT|ANY|HAVING|LATERAL|FETCH|DO|LOCALTIME|ARRAY|ELSE|FOREIGN|TO|ONLY|WITH|SELECT|CREATE|FALSE|ASC|TRUE|COLUMN|SESSION_USER|IS|BY|INSERT|LEFT|RIGHT|JOIN|OUTER|INNER|FULL|SETS|CUBE|ROLLUP|EXTRACT|LIKE|BETWEEN;

groupfunctionname : ARRAY_AGG | AVG | BIT_AND | BIT_OR | BOOL_AND | BOOL_OR | COUNT | EVERY | JSON_AGG | JSONB_AGG | JSON_OBJECT_AGG | JSONB_OBJECT_AGG | MAX | MIN | STRING_AGG | SUM | XMLAGG | CORR | COVAR_POP | COVAR_SAMP | REGR_AVGX | REGR_AVGY | REGR_COUNT | REGR_R2 | REGR_SLOPE | REGR_SXX | REGR_SXY | REGE_SYY | STDDEV | STDDEV_POP | STDDEV_SAMP | VARIANCE | VAR_POP | VAR_SAMP | GROUPING;

values : values COMMA values | Value;

Value : INT|'\'' .*? '\''|'"'.*?'"'|NULL|TRUE|FALSE;

tabledotfield : nameoralias DOT field;

relator : EQ|IS|(IS NOT)|GT|LT|GE|LE|BI|NE|;

relation : AND|OR;
