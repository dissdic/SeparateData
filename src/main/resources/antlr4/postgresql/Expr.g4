grammar Expr;
import Operate;

join : ((((LEFT|RIGHT|FULL) OUTER?) | INNER | CROSS) JOIN) table (ON where | USING LB fields RB);

queryfields : queryfields COMMA queryfields | DISTINCT? compute (AS? alias)?;

where : where relation where | '(' where ')'| condition;




