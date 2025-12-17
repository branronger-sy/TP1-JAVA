## TP1 JAVA – Médiathèque

Ce projet est un mini-système de médiathèque écrit en Java.  
Il permet de gérer un catalogue de médias (livres, DVD), d’afficher leurs informations, et de simuler l’emprunt et le retour de médias par des utilisateurs.

### Structure du projet

- **`mediatheque.model`**  
  - `Media` : classe abstraite représentant un média (titre, année, disponibilité).  
  - `Livre` : représente un livre, hérite de `Media`.  
  - `Dvd` : représente un DVD, hérite de `Media`.  
  - `Empruntable` : interface définissant le contrat d’emprunt / retour d’un média.  
  - `Affichable` : interface pour les objets pouvant afficher leurs informations.  
  - `Afficheur` : classe utilitaire pour afficher les informations.  
  - `Utilisateur` : représente un utilisateur (nom, prénom, âge).

- **`mediatheque.service`**  
  - `Mediatheque` : gère la collection de médias (ajout, affichage du catalogue, recherche par titre).

- **`mediatheque.ui`**  
  - `TestMediatheque` : classe contenant le `main`, permettant de tester le fonctionnement de la médiathèque (création de médias, affichage, emprunt/retour, etc.).

### Prérequis

- **Java** : JDK 8 ou supérieur installé (`java` et `javac` disponibles dans le PATH).

### Compilation

Depuis la racine du projet (`TP1 JAVA`), exécuter dans un terminal :

```bash
javac mediatheque/model/*.java mediatheque/service/*.java mediatheque/ui/*.java
```

Cela va compiler toutes les classes dans leurs dossiers respectifs.

### Exécution

Pour lancer le programme principal (tests de la médiathèque), exécuter :

```bash
java mediatheque.ui.TestMediatheque
```

Assure-toi d’être dans le dossier `TP1 JAVA` lorsque tu lances cette commande.

### Fonctionnalités principales

- **Gestion du catalogue**
  - Ajout de livres et de DVDs dans la médiathèque.
  - Affichage du catalogue complet.

- **Emprunt de média**
  - Recherche d’un média par titre.
  - Vérification s’il est empruntable et disponible.
  - Association d’un utilisateur à un média emprunté.

- **Retour de média**
  - Recherche d’un média par titre.
  - Vérification s’il est actuellement emprunté.
  - Remise en disponibilité du média.

### Auteur

- Projet réalisé dans le cadre du **TP1 de Java**.  
  ISSAM AFJDGHIGH 2eme annee EST filier GI


