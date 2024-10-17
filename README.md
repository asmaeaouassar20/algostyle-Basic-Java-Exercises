# Exercices Java

Bienvenue dans ce repository !
Ce projet contient un ensemble d'exercices en Java pour t'aider à améliorer tes compétences en programmation.




### Exercice 1
#### Enoncé
Une phrase est dite palindrome si en éliminant les blancs entre les mots elle représente la même lecture dans les deux sens :

Exemple :
“ Elu par cette crapule ”
“ Engage le jeu que je le gagne ”
“ Mon nom ”

Ecrire les méthodes **compresser** et **Inverser**, il est demandé d’écrire deux versions de la méthode **Inverser** :

- La première version de la méthode **Inverser** construira une chaîne locale à la méthode caractère par caractère avec une boucle for à un seul indice
- La deuxième version de la méthode **Inverser** modifiera les positions des caractères ayant des positions symétriques dans la chaîne avec une boucle for à deux indices et en utilisant un tableau de char

#### Concepts à apprendre
- Manipulation de chaînes
- Utilisation de tableaux
- Boucles et conditions




### Exercice 2
#### Enoncé
construire un programme permettant lorsqu’on lui fournit une date sous la forme numérique (3/2/5 où 3 indique le n° du jour de la semaine lundi=1, dimanche=7 ; le deuxième chiffre 2 indique le jour, enfin le troisième chiffre 5 indique le n° du mois)  le convertit en clair

Exemple : 3/2/5 est convertit en : mercredi 2 mai

#### Concepts à apprendre
- Expressions régulières
- Manipulation d ecollections
- Validation d edonnées


### Exercice 3
#### Enoncé
Le but de cet exercice est d’écrire 3 méthodes pour incrémenter un même tableau, en jouant sur différentes formes de paramétrage

Vous déclarez les 3 méthodes de classe (statiques) afin de pouvoir les utiliser directement dans la méthode principale, comme s’il s’agissait de simples fonctions

Méthode IncTab :
- cette méthode incrémente chaque case d’un tableau d’entiers passé en argument .
- Après l’appel de la méthode , le tableau fourni en argument est modifié. Utilisez une boucle for.

Méthode IncNewTab : 
- cette méthode prend en paramètre un tableau d’entiers
- retourne un nouveau tableau de même taille contenant les valeurs du tableau passé en paramètres, mais incrémentées de 1

Méthode incNewTabOut
- Cette méthode prend en paramètre un tableau d'entiers.
- Elle utilise un second tableau (passé en paramètre) pour stocker les résultats.
- Le tableau de sortie doit contenir les éléments du tableau d'entrée incrémentés de 1.

Dans la méthode principale, déclarez un tableau d’entiers que vous initialiserez et qui vous servira ensuite pour tester les 3 méthodes, Utilisez des boucles foreach pour afficher les différents résultats après chaque appel.

#### Concepts à apprendre
- Manipulation de tableaux
