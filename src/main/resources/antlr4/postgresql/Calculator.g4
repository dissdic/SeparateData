grammar Calculator;
import Basic;

prog:   stat+ ;

stat:   condition                        # printExpr
    |   ID '=' condition         # assign
    ;

condition:   condition op=('+'|'-') condition      # AddSub
             |   field                         # int
    |   '(' condition ')'                # parents
    ;
