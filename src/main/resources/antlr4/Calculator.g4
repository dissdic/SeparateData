grammar Calculator;            // Define a grammar called demo

parse : prog+ ;              // A program consists of at least one statement

prog : 'Hello' ID            // match keyword hello/Hello followed by an identifier
    | 'hello' ID
    ;

ID : [a-z]+ ;               // match lower-case identifiers

WS : [ \t\n\r]+ -> skip ;   // skip spaces, tabs, newlines, \r (Windows)