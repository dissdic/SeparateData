lexer grammar Norm;
import Keyword;

fragment DIGIT : [0-9];
fragment CHARACTER : [a-zA-Z];
fragment DIGIT_AND_CHARACTER : [0-9a-zA-Z];


WORDS : ID | '"'ID'"' | '['ID']'|'`'ID'`';
INT : DIGIT+;
ID  : (DIGIT_AND_CHARACTER|UL|SUB)+;

WS : [ \t\n\r]+ ->channel(HIDDEN);
OTHER : . ->skip;