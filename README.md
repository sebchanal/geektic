GEEKTIC : TP JEE
================

Pre-requis
==========

- Un client HSQL
- Un serveur apach tomcat v7.0.40
- L'IDE Eclipse

Arborescence
============

- Geektic : Contient les sources du projet
- Geektic-hsql : Contient les fichiers de la bases de données
- Geektic.sql : Contient le script de création des tables ainsi qu'un jeu de données

Fonctionnement
==============

L'application web se présente de la manière suivante, l'utilisateur arrive sur une barre de recherche. Trois possibilités s'offre à lui :

1. Il ne met rien est appuie sur 'Entrer' pour lister tous les geeks
2. Il saisie un pseudo ou le début d'un pseudo et appuie sur 'Entrer' pour lancer la recherche
3. Il décide d'avoir plus d'option de recherche, dans ce cas un simple clic sur la flêche situé à droite de la barre de recherche lui permettra de filtrer par sexe et/ou par centre d'intérêts

Concernant l'affichage, les geeks sont affichés sous forme de carte et un bouton situé sur chaque carte permet d'ajouter une vue à un geek.



