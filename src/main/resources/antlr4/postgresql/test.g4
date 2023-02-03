grammar test;
file : clazz* ;
clazz : 'class' ID '{' ignore '}' ;
ignore : (method|clazz|.)*? ; // <- only change is to add clazz alt here
method : type ID '()' block ;
type : 'int' | 'void' ;
block : '{' (block | .)*? '}' ;
ID : [a-zA-Z] [a-zA-Z0-9]* ;
WS : [ \r\t\n]+ -> skip ;
ANY : . ;