%{
#include <stdio.h>
%}

%s A  F Dead

%%

<INITIAL>"a"     { BEGIN(A); }
<INITIAL>     { BEGIN(A); }

<A>[a-zA-Z]                 { ; }
<A>"b"    { BEGIN(F); }


<F>"b"  { ; }
<F>"\n"


<CheckAB>[a-zA-Z0-9_]+       { }
<CheckAB>\n                  { printf("Invalid: ends without 'b'\n"); return 0; }
<CheckAB>[^a-zA-Z0-9_\n]     { BEGIN(Dead); }

<INITIAL>.|\n                { BEGIN(Dead); }

<Dead>.                      { printf("Dead State: Invalid input\n"); return 0; }

%%

int main() {
    printf("Enter a string: ");
    yylex();
    return 0;
}

int yywrap() {
    return 1;
}
