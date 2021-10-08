import java_cup.runtime.Symbol;

%%
%unicode
%cup
%line
%column


point = [.]
deuxpoint = [:]
virg = [,]
pvirg = [;]
accovt = [\{]
accfmt = [\}]
egale = [\=]
centre = "CS_"[0-9][0-9][0-9][0-9][0-9]"_"[A-Za-z][a-z]* | "PL_"[0-9][0-9][0-9][0-9][0-9]"_"[A-Za-z][a-z]*
jour = "lundi" | "mardi" | "mercredi" | "jeudi" | "vendredi" | "samedi" | "dimanche" | "Lundi" | "Mardi" | "Mercredi" | "Jeudi" | "Vendredi" | "Samedi" | "Dimanche" | "LUNDI" | "MARDI" | "MERCREDI" | "JEUDI" | "VENDREDI" | "SAMEDI" | "DIMANCHE"
horaire = [0-1]?[0-9]"h"[0-5]?[0-9]?"-"[0-1]?[0-9]"h"[0-5]?[0-9]? | [0-1]?[0-9]"h"[0-5]?[0-9]?"-""2"?[0-3]"h"[0-5]?[0-9]? | "2"?[0-3]"h"[0-5]?[0-9]?"-""2"?[0-3]"h"[0-5]?[0-9]?
chaine = \"[^\n\"]*\"
aspectLieu = "salle" | "terrain"
prenom = [A-Za-z][a-z]* | [A-Za-z][a-z]*"-"[A-Za-z][a-z]*


%%
Activites       { return new Symbol(sym.ACTIVITES); }
animateur       { return new Symbol(sym.ANIMATEUR); }
participants    { return new Symbol(sym.PARTICIPANTS); }
Fin             { return new Symbol(sym.FIN); }
{centre}        { return new Symbol(sym.CENTRE); }
{jour}          { return new Symbol(sym.JOUR, new String(yytext())); }
{horaire}       { return new Symbol(sym.HORAIRE, new String(yytext())); }
{aspectLieu}    { return new Symbol(sym.ASPECTLIEU, new String(yytext())); }
{chaine}        { return new Symbol(sym.CHAINE, new String(yytext())); }
{prenom}        { return new Symbol(sym.PRENOM); }
{point}         { return new Symbol(sym.POINT); }
{deuxpoint}     { return new Symbol(sym.DEUXPOINT); }
{virg}          { return new Symbol(sym.VIRG); }
{pvirg}          { return new Symbol(sym.POINTVIRG); }
{accovt}        { return new Symbol(sym.ACCOVT); }
{accfmt}        { return new Symbol(sym.ACCFMT); }
{egale}         { return new Symbol(sym.EGALE); }
" "             {}//ne rien faire
\t              {}
\n              {} // consommation d’un passage a la ligne
\r              {}
.               { System.out.println("Caractère non reconnue "+yytext()); }
