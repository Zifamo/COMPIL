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
int nbMots=0;
%}

%eof{
System.out.println("Nbre de caracteres : "+nbCarac);
System.out.println("Nbre de Mots : "+nbMots);
System.out.println("Nbre de caracteres ignores : "+nb);
System.out.println("Fin de l’analyse lexicale.");
%eof}


carac = [a-z] | [0-9] 
mot = {carac}*

%%

{mot}       { nbMots++ ; nbCarac = nbCarac + yylength(); }
[\n]        {}  // ne rien faire
.           { nb++; }
