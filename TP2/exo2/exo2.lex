import java_cup.runtime.Symbol;

%%
%unicode
%cup
%line
%column

nbBinaire = [0-1]

%%
{nbBinaire}+ { return new Symbol(sym.BINAIRE, new String(yytext())); }
\n {} // consommation d’un passage a la ligne
.  {} // ne rien faire
