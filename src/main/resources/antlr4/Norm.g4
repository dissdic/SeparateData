lexer grammar Norm;
import Keyword;
fragment DIGIT : [0-9];
fragment CHARACTER : [a-zA-Z];
fragment DIGIT_AND_CHARACTER : [0-9a-zA-Z];

UL : '_';
COMMA : ',';
LINE : '-';
STAR : '*';
EQ : '=';
GT : '>';
LT : '<';
GE : '>=';
LE : '<=';
NE : '!=';
BI : '<>';
DOT : '.';

VALUE : INT|('\''|'"') .*? ('\''|'"')|NULL;
TABLEDOTFIELD : TABLEORFIELD DOT TABLEORFIELD | TABLEORFIELD;
TABLEORFIELD : ID | '"'ID'"' | '['ID']'|'`'ID'`';

INT : DIGIT+;
ID  : (DIGIT_AND_CHARACTER|UL|LINE)+;

WS : [ \t\n\r]+ ->skip;

