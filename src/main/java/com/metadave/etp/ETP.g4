grammar ETP;

term:       
    INT
    | FLOAT
    | STRING
    | bool
    | atom;

// TODO: binaries, $\n, 2#101

atom: ID | IDSTRING;
bool: TRUE | FALSE;
list: LSQUARE (listitems+=term (COMMA listitems+=term)*)? RSQUARE;
tuple: LCURLY (tupleitems+=term (COMMA tupleitems+=term)*)? RCURLY;
       
COMMA:         ',';
LSQUARE:       '[';
RSQUARE:       ']';

LCURLY:        '{';
RCURLY:        '}';
DOT:           '.';
BINSTART:      '<<';
BINEND:        '>>';
TRUE:          'true';
FALSE:         'false';
AT:            '@';

ID          :       [a-z][A-Za-z_@]*;
IDSTRING  :  '\'' (IDESC|.)*? '\'';

fragment IDESC : '\\\'' | '\\\\' ;

INT         :   DIGIT+;
FLOAT       :   DIGIT+ DOT DIGIT*
               | DOT DIGIT+
            ;

fragment DIGIT  : '0' .. '9';

STRING  :  '"' (ESC|.)*? '"';
fragment ESC : '\\"' | '\\\\' ;

LINE_COMMENT  : '//' .*? '\r'? '\n' -> skip ;
COMMENT       : '/*' .*? '*/'       -> skip ;

WS      :       [ \t\r\n]+ -> skip;
