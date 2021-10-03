import java_cup.runtime.Symbol;

%%
%unicode
%cup
%line
%column



parOvt = [(]
parFmt = [)]
entier = [0-9]+
id = [a-z][a-z]* | [a-z][0-9]*


%%
{parOvt}        { return new Symbol(sym.PAROVT); }
{parFmt}        { return new Symbol(sym.PARFMT); }
{entier}        {}//ne rien faire
{id}            {}//ne rien faire
" "             {}//ne rien faire
\n              {} // consommation d’un passage a la ligne
.               { System.out.println("Caractère non reconnue "+yytext()); } // caractère non reconnue
