grammar HoloCalc;

// Calcalates a string terminated by EOF
calc returns [double result]
    :   value = addsub {$result = $value.result;}
    ;

// Addition and subtraction
addsub returns [double result]
    :   value = muldiv {$result = $value.result;}
        (   PLUS  value2 = muldiv PERCENT {$result *= 1 + $value2.result/100;}
        |   PLUS  value2 = muldiv {$result += $value2.result;}
        |   MINUS value2 = muldiv PERCENT {$result *= 1 - $value2.result/100;}
        |   MINUS value2 = muldiv {$result -= $value2.result;}
        )*
    ;

// Multiplication and division
muldiv returns [double result]
    :   value = power {$result = $value.result;}
        (   MULTIPLY value2 = power PERCENT {$result *= $value2.result/100;}
        |   MULTIPLY value2 = power {$result *= $value2.result;}
        |   DIVIDE   value2 = power PERCENT {$result /= $value2.result/100;}
        |   DIVIDE   value2 = power {$result /= $value2.result;}
        )*
    ;

// Powers/exponents
power returns [double result]
    :   value = negation POWER value2 = power PERCENT{$result = java.lang.Math.pow($value.result, $value2.result/100);}
    |   value = negation POWER value2 = power {$result = java.lang.Math.pow($value.result, $value2.result);}
    |   value = negation {$result = $value.result;}
    ;

// Negation, i.e. -x
negation returns [double result]
    :   value = atom PERCENT       {$result = $value.result/100;}
    |   value = atom               {$result = $value.result;}
    |   INVERT value = atom PERCENT {$result = -$value.result/100;}
    |   INVERT value = atom         {$result = -$value.result;}
    ;

// Functions, numbers, and parentheses groups
atom returns [double result]
    :   LOG10   '(' exp = addsub ')' {$result = java.lang.Math.log10($exp.result);}
    |	LOG8    '(' exp = addsub ')' {$result = java.lang.Math.log10($exp.result)/java.lang.Math.log10(8.0);}
    |	LOG2    '(' exp = addsub ')' {$result = java.lang.Math.log10($exp.result)/java.lang.Math.log10(2.0);}
    |	LN      '(' exp = addsub ')' {$result = java.lang.Math.log($exp.result);}
    |	ASIN    '(' exp = addsub ')' {$result = Math.asin(Math.PI*(($exp.result/Math.PI) % 2));}
    |	ACOS    '(' exp = addsub ')' {$result = Math.acos(Math.PI*(($exp.result/Math.PI) % 2));}
    |	ATAN    '(' exp = addsub ')' {$result = Math.atan(Math.PI*(($exp.result/Math.PI) % 2));}
    |	SIN     '(' exp = addsub ')' {$result = Math.sin(Math.PI*(($exp.result/Math.PI) % 2));}
    |	COS     '(' exp = addsub ')' {$result = Math.cos(Math.PI*(($exp.result/Math.PI) % 2));}
    |	TAN     '(' exp = addsub ')' {$result = Math.tan(Math.PI*(($exp.result/Math.PI) % 2));}
    |	ASIND   '(' exp = addsub ')' {$result = 180f/Math.PI*Math.asin($exp.result);}
    |	ACOSD   '(' exp = addsub ')' {$result = 180f/Math.PI*Math.acos($exp.result);}
    |	ATAND   '(' exp = addsub ')' {$result = 180f/Math.PI*Math.atan($exp.result);}
    |	SIND    '(' exp = addsub ')' {$result = Math.sin(Math.PI*(($exp.result/180f) % 2));}
    |	COSD    '(' exp = addsub ')' {$result = Math.cos(Math.PI*(($exp.result/180f) % 2));}
    |	TAND    '(' exp = addsub ')' {$result = Math.tan(Math.PI*(($exp.result/180f) % 2));}
    |	SQRT    '(' exp = addsub ')' {$result = (double) java.lang.Math.pow($exp.result, 0.5);}
    |	CBRT    '(' exp = addsub ')' {$result = (double) java.lang.Math.pow($exp.result, 1.0/3.0);}
    |   DOUBLE                       {$result = (double) Double.parseDouble($DOUBLE.text.replaceAll(",", ""));}
    |   INT                          {$result = (double) Double.parseDouble($INT.text.replaceAll(",", ""));}
    |   PI                           {$result = (double) java.lang.Math.PI;}
    |   EXP                          {$result = (double) java.lang.Math.E;}
    |   OPENPAREN   exp2 = addsub CLOSEPAREN {$result = $exp2.result;}
    ;


// Operators
PLUS    :   '+';
MINUS   :   '-';
MULTIPLY:   '*';
DIVIDE  :   '/';
POWER   :   '^';
PERCENT :   '%';
INVERT	:   'inv';

// Number-likes
INT     :   [0-9]+;
DOUBLE  :   [0-9]+'.'[0-9]*;
OPENPAREN:  '(';
CLOSEPAREN: ')';
PI	    :	'pi';
EXP	    :	'e';

// Functions
SQRE	:	'sqre';
CUBE	:	'cube';
SQRT	:	'sqrt';
CBRT	:	'cbrt';
LN 	    :	 'ln';
LOG10	:	'log10';
LOG8	:	'log8';
LOG2	:	'log2';
SIN	    :	'sin';
COS	    :	'cos';
TAN	    :	'tan';
ASIN	:	'asin';
ACOS	:	'acos';
ATAN	:	'atan';
// For trig in degrees
SIND	:	'sind';
COSD	:	'cosd';
TAND	:	'tand';
ASIND	:	'asind';
ACOSD	:	'acosd';
ATAND	:	'atand';

// Etc
NEWLINE :   '\n';
EQUALS	:   '=';

