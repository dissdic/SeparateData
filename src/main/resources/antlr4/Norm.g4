lexer grammar Norm;

fragment DIGIT : [0-9];
fragment CHARACTER : [a-zA-Z];
fragment DIGIT_AND_CHARACTER : [0-9a-zA-Z];

UL : '_';
COMMA : ',';
LINE : '-';
ALL : '*';
EQ : '=';
GT : '>';
LT : '<';
GE : '>=';
LE : '<=';
NE : '!=';
BI : '<>';

INT : DIGIT+;
ID  : (DIGIT_AND_CHARACTER|UL|LINE)+;

