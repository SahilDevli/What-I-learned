%{
#include <stdio.h>
%}

%s A B C DEAD

%%

<INITIAL>"a"     { BEGIN(A); }
<INITIAL>"b"     { BEGIN(B); }
<INITIAL>"\n"    { printf("Accepted\n"); return 0; }
<INITIAL>.       { BEGIN(DEAD); }

<A>"a"           { BEGIN(INITIAL); }
<A>"b"           { BEGIN(C); }
<A>"\n"          { printf("Not accepted\n"); return 0; }
<A>.             { BEGIN(DEAD); }

<B>"b"           { BEGIN(INITIAL); }
<B>"a"           { BEGIN(C); }
<B>"\n"          { printf("Not accepted\n"); return 0; }
<B>.             { BEGIN(DEAD); }

<C>"a"           { BEGIN(B); }
<C>"b"           { BEGIN(A); }
<C>"\n"          { printf("Not accepted\n"); return 0; }
<C>.             { BEGIN(DEAD); }

<DEAD>.          { printf("Dead state! Restart the machine.\n"); return 0; }

%%

int main() {
    printf("Enter a string of {a, b}, end with ENTER:\n");
    yylex();
    return 0;
}
int yywrap(){ return 1;}
