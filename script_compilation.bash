#!/bin/bash
echo "Installation de JFlex et java-cup"
mkdir ${HOME}/javalib
cp /home/commun_depinfo/enseignants/vnicolas/javalib/JFlex.jar ${HOME}/javalib/
cp /home/commun_depinfo/enseignants/vnicolas/javalib/java-cup-v11a.jar ${HOME}/javalib/
echo "Mise à jour du .bashrc (à ne faire qu'UNE FOIS)"
cat /home/commun_depinfo/enseignants/masse/compil_bashrc >> ${HOME}/.bashrc
echo "Installation terminée"
echo "N'oubliez pas de relancer un terminal pour prendre en compte les modifications"
echo "Ne pas relancer ce script au TP pour ne pas surcharger votre .bashrc"
read -p "Appuyez sur entrée pour terminer..."
