%{
    #include<stdio.h>    
%}

%s A B F DEAD

%%

<INITIAL>"x"    { BEGIN(A); }
<INITIAL>"y"     { BEGIN(DEAD); printf("\nDead state started!"); }
<INITIAL>"z"     { BEGIN(DEAD); printf("\nDead state started!"); }
<INITIAL>"\n"   { printf("\nString not accepted"); }
<INITIAL>.       { printf("Not valid string"); return 0; }

<A>"y"      { BEGIN(B); }
<A>"z"      { ; }
<A>"x"      { ; }
<A>"\n"     { printf("\nString not accepted"); }
<A>.        { printf("Not valid string"); return 0; }

<B>"x"      { BEGIN(A); }
<B>"y"      { ; }
<B>"z"      { BEGIN(F); }
<B>"\n"     { printf("\nString not accepted"); }
<B>.        { printf("Not valid string"); return 0; }

<F>"\n"     { printf("\nString accepted, Succesfuly!"); }
<F>"x"      { BEGIN(A); }
<F>"y"      { BEGIN(B); }
<F>"z"      { BEGIN(A); }
<F>.        { printf("Not valid string"); return 0; }

%%

int main(){
    printf("Your {x,y,z}  such that starts with 'x' and ends with 'yz' : ");
    yylex();
    return 0;
}

int yywrap(){ return 1; }