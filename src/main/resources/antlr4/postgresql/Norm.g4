lexer grammar Norm;
import Keyword;

fragment DIGIT : [0-9];
fragment CHARACTER : [a-zA-Z];
fragment DIGIT_AND_CHARACTER : [0-9a-zA-Z];


TABLEORFIELD : ID | '"'ID'"' | '['ID']'|'`'ID'`';
INT : DIGIT+;
ID  : (DIGIT_AND_CHARACTER|UL)+;

WS : [ \t\n\r]+ ->skip;
OTHER : . ->skip;