grammar test;
options {}

// Keywords
// Common Keywords

JIA:                                 '+';
JIAN:                                 '-';
CEHNG:                                 '*';
CHU:                                 '/';
LPAREN: '(';
RPAREN: ')';

ID : [a-zA-Z]+ ;
INT : [0-9]+ ;
NEWLINE:'\r'? '\n' ;
WS : [ \t]+ -> skip;

expr: expr op=(CEHNG|CHU) expr    # 乘除
| expr op=(JIA|JIAN) expr        # 加减
| INT                           # 数字
| ID                            # 符号
| LPAREN expr RPAREN                  # b
;

stat: expr NEWLINE          # 打印
    | ID '=' expr NEWLINE   # 表达式
    | NEWLINE               # 空行
    ;

prog : stat+;