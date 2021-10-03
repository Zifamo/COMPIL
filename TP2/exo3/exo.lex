import java_cup.runtime.Symbol;

%%
%unicode
%cup
%line
%column


nom = [A-Z][0-9][0-9][0-9]
nomArticle = [A-Z][a-z]+
entier = [0-9]+
point = [.]
deuxpoint = [:]
virg = [,]


%%
FACTURE         { return new Symbol(sym.FACTURE); }
TOTAL           { return new Symbol(sym.TOTAL); }
{point}         { return new Symbol(sym.POINT); }
{deuxpoint}     { return new Symbol(sym.DEUXPOINT); }
{virg}          { return new Symbol(sym.VIRG); }
{nom}           { return new Symbol(sym.NOM); }
{nomArticle}    { return new Symbol(sym.NOMARTICLE); }
{entier}        { return new Symbol(sym.ENTIER, new Integer(yytext())); }
\n {} // consommation d’un passage a la ligne
.  {} // ne rien faire
