%{
#include <stdio.h>
%}

%s A B C DEAD

%%

<INITIAL>"a"     { BEGIN(A); }
<INITIAL>"\n"    { printf("Accepted\n"); return 0; }
<INITIAL>.       { BEGIN(DEAD); }

<A>"b"           { BEGIN(INITIAL); }
<A>.             { ; }
<A>"\n"          { printf("Not accepted\n"); return 0; }

<DEAD>.          { printf("Dead state! Restart the machine.\n"); return 0; }

%%

int main() {
    printf("Enter a string: ");
    yylex();
    return 0;
}
int yywrap(){ return 1;}
