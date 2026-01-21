%{
    #include<stdio.h>   
%}

%s op div mul sum sub DEAD

%%
    <INITIAL>[0-9]  { BEGIN(op); }
    <INITIAL>.      { BEGIN(DEAD); }
    
    <op>"+"     { BEGIN(sum); }
    <op>"-"     { BEGIN(sub); }
    <op>"*"     { BEGIN(mul); }
    <op>"/"     { BEGIN(div); }
    <op>.       { BEGIN(DEAD); }

    <sum>[0-9]  { $$=$1+$3; }
    <sum>.  { BEGIN(DEAD); }

    <sub>[0-9]  { $$=$1-$3; }
    <sub>.  { BEGIN(DEAD); }

    <mul>[0-9]  { $$=$1*$3; }
    <mul>.  { BEGIN(DEAD); }

    <div>[0-9]  { $$=$1/$3; }
    <div>.  { BEGIN(DEAD); }

%%

int main() {
    printf("Enter expression: \n");
    yylex();
    return 0;
}

int yywrap(){ return 1;}