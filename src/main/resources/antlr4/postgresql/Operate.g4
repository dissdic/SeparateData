grammar Operate;
import Keyword,Expr;

select: SELECT (fields|STAR) FROM tables join* (WHERE where)? (GROUP BY fields)? (HAVING where)? (ORDER BY fields (ASC|DESC)?)?;






