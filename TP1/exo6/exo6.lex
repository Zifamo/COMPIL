%%
%class lexer
%unicode
%int
%standalone
%line
%column

%{
int nb=0;
int nbCarac=0;
%}

%eof{
System.out.println("Nbre de caracteres gardés : "+nbCarac);
System.out.println("Nbre de caracteres supprimés : "+nb);
System.out.println("Nbre de caracteres ignores : "+nb);
System.out.println("Fin de l’analyse lexicale.");
%eof}


carac = [a-zA-Z]

%%

{carac}       { nbCarac++ ; System.out.println("Caracteres gardés : "+yytext()); }
[\n]        {}  // ne rien faire
.           { nb++; }
