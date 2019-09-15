grammar Config;

file: (section | entry | COMMENT)*;

section: '[' (IDENTIFIER | entry)+ ']';
entry: IDENTIFIER '=' value;
value: STRING | NUMBER | KEYWORD | constructor | list | dictionary;
constructor: IDENTIFIER '(' value? (',' value)* ')';
list: '[' value? (',' value)* ']';
dictionary: '{' dictionary_entry? (',' dictionary_entry)* '}';
dictionary_entry: STRING ':' value;

KEYWORD: 'true' | 'false';
IDENTIFIER: [_a-zA-Z] [._/a-zA-Z0-9]*;
STRING: '"' .*? '"';
NUMBER: [-.0-9]+;
COMMENT: ';' .*? '\n';
WHITESPACE: ('\n' | ' '+) -> channel(HIDDEN);