grammar Operate;
import Basic;

like :compute NOT? LIKE Value;

between : compute NOT? BETWEEN LB compute AND compute RB;

in : compute NOT? IN LB values RB;

condition : compute relator compute | in | between | like;

function : static LB ( compute | .)*? RB;

compute : compute (PLUS|SUB|SR|DS|TUB|MG|PC|IX) compute | function | Value
    | field | LB compute RB
    ;






