grammar Operate;
import Function;

distinct : DISTINCT compute;

like :compute NOT? LIKE Value;

between : compute NOT? BETWEEN LB compute AND compute RB;

in : compute NOT? IN LB values RB;


function : ;

condition : compute relator compute;

compute : compute (PLUS|SUB|SR|DS|TUB|MG|PC|IX) compute | Value | fieldwithoutalias |
    | function | LB compute RB
    ;






