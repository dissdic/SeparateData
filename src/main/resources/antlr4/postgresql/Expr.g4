grammar Expr;
import Operate;

join : ((((LEFT|RIGHT|FULL) OUTER?) | INNER | CROSS) JOIN) table (ON where | USING LB fields RB);

queryfields : queryfields COMMA queryfields | queryfield;

queryfield : DISTINCT? compute (AS? alias)?;

where : where relation where | '(' where ')'| condition;

orderbyfields : orderbyfields COMMA orderbyfields | field (ASC | DESC)?;

groupbyfields : groupbyfields COMMA groupbyfields | compute;





