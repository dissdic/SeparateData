grammar Select;
import Keyword,Expr;

select: SELECT queryfields FROM tables join* (WHERE where)? (GROUP BY fields)? (HAVING where)? (ORDER BY (field (ASC|DESC)?)*)? (LIMIT INT(COMMA INT)?)?;



