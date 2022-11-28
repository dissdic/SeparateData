grammar Tok;
tokens {A,B,C}
stat: S WS+ a 'from' TB;
a: FN(',' FN)*;
FN : [a-z]+;
TB : [a-z]+;
S  : 'select';
WS : ' ';