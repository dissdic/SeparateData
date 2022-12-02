grammar Operate;
import Expr,Keyword,Norm;
tokens {OTHER}

select: SELECT (fields|STAR) FROM tables (WHERE where)? (GROUP BY fields)? (HAVING where)? (ORDER BY fields (ASC|DESC)?)?;




