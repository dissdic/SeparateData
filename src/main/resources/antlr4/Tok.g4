grammar Tok;
import Letter;
tokens {TN}

stat: SL WS+ el+=a WS+ FR WS+ (TN|FN);


SL  : 'select' | 'SELECT';
FR  : 'from' | 'FROM';
WS : ' ';
FN : [a-z]+;
a: FN(',' FN)* | '*';




