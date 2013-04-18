grammar ETP;

etp_term:
    etp_int
    | etp_float
    | etp_string
    | etp_bool
    | etp_atom
    | etp_list
    | etp_tuple;

// TODO: binaries, $\n, 2#101
etp_int: INT;
etp_float: FLOAT;
etp_string: STRING;
etp_atom: ID | IDSTRING;
etp_bool: TRUE | FALSE;
etp_list: LSQUARE (listitems+=etp_term (COMMA listitems+=etp_term)*)? RSQUARE;
etp_tuple: LCURLY (tupleitems+=etp_term (COMMA tupleitems+=etp_term)*)? RCURLY;
       
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

ID          :       [a-z][A-Za-z_@0-9]*;
IDSTRING  :  '\'' (IDESC|.)*? '\'';

fragment IDESC : '\\\'' | '\\\\' ;

INT         :   DIGIT+;
FLOAT       :   DIGIT+ DOT DIGIT*
               | DOT DIGIT+
            ;

fragment DIGIT  : '0' .. '9';

STRING  :  '"' (ESC|.)*? '"';
fragment ESC : '\\"' | '\\\\' ;

LINE_COMMENT  : '%' .*? '\r'? '\n' -> skip ;
//COMMENT       : '/*' .*? '*/'       -> skip ;

WS      :       [ \t\r\n]+ -> skip;
