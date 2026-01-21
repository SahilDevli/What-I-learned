%{
#include <stdio.h>
%}

%s Identifier Integer Float Dead

%%
<INITIAL>[a-zA-Z_]        { BEGIN(Identifier); }
<INITIAL>[0-9]            { BEGIN(Integer); }
<INITIAL>[^a-zA-Z0-9_.]   { BEGIN(Dead); }

<Identifier>[a-zA-Z0-9_]+     { }
<Identifier>\n                { printf("Valid Identifier\n"); return 0; }
<Identifier>[^a-zA-Z0-9_\n]   { BEGIN(Dead); }

<Integer>[0-9]+               { }
<Integer>"."[0-9]+            { BEGIN(Float); }
<Integer>\n                   { printf("Valid Integer\n"); return 0; }
<Integer>[^0-9.\n]            { BEGIN(Dead); }

<Float>[0-9]+                 { }
<Float>\n                     { printf("Valid Float\n"); return 0; }
<Float>[^0-9\n]               { BEGIN(Dead); }

<Dead>.                       { printf("Dead State\n"); return 0; }

%%

int main() {
    printf("Input: ");
    yylex();
    return 0;
}

int yywrap() {
    return 1;
}
