lexer grammar Core;

COLON: ':';
COMMA: ',';
DOT: '.';
PARENTHES_LEFT: '(';
PARENTHES_RIGHT: ')';
BRACKET_LEFT: '[';
BRACKET_RIGHT: ']';
BRACE_LEFT: '{';
BRACE_RIGHT: '}';
NL: '\n';

IDENTIFIER: (LOWER_CASE | UPPER_CASE | UNDERSCORE) (LOWER_CASE | UPPER_CASE | UNDERSCORE | DIGIT)*;
LOWER_CASE: 'a'..'z';
UPPER_CASE: 'A'..'Z';
UNDERSCORE: '_';
DIGIT: '0'..'9';

WHITESPACE: (' ' | '\t')+ -> channel(HIDDEN);
ERRCHAR: . -> channel(HIDDEN);
