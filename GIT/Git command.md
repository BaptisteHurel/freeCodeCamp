# Git Command

Il y a, l'espace de travail, l'index et le dépot.
- L'espace de travail correspond au répertoire local du développeur. C'est le dossier du projet ou se situe les fichiers que l'on ajoute, modifie.
- L'index correspond à la zone intermédiaire ou le développeur place ces fichiers en attendant le commit (tous les fichiers verts)
- le dépôt c'est l'espace ou git va enregistrer les groupes de modifications, versionner les fichiers, après avoir réaliser un commit.

## Manipulation des fichiers et commit.
#### initialiser un projet
```bash
git init
```

#### Afficher le status des fichiers.
```bash
git status
```

#### Identifier, ajouter un fichier à l'index.
```bash
git add <nom-du-fichier>
```

#### Identifier, ajouter tous les fichiers à l'index.
```bash
git add .
```

#### Afficher les fichiers non suivis
```bash
git ls-files --others
```

## Consultation et manipulation de l'historique.
#### Lister les 5 derniers log (le nombre détermine le nombre de log affich 1, 2, 3, 4, 5, 10, 15, 20 etc)

```bash
git log -5
```

#### Afficher le dernier commit

```bash
git log -n 1
```
ou
```bash
git log --max-count=1
```

#### Afficher les statistiques
```bash
git log -1 --stat
```

```bash
git log -1 --shortstat
```

#### Lister sur une ligne les commits
```bash
git log --oneline -5
```
Exemple:
```bash
C:\Users\trstndbrtl\Sites\devdesktop\mon-site (develop -> origin)
λ git log --oneline -5
4d5eb52 add new 
6338db2 [HotFix] translations 28/03/2019
a45602f Merge branch 'pre-production' of into develop
8458779 Add right customer for Electro
45680a7 Merge branch 'release/v1.0-Security_update' into master
```

#### Si pas configurer globalement, ajouter `--abbrev` pour une version abrégés du hashs
```bash
git log --online -5 --abbrev=7 
```

#### Afficher les commits qui on été ajoutés avant le 2 mars 2019
```bash
git log --before="2019-03-02"
```

#### Afficher les commits qui on été ajoutés après le 2 mars 2019
```bash
git log --after="2019-03-02"
```

#### Combiner after et before pour obtenir les commit entre deux date
```bash
git log --after="2019-03-02" --before="2019-03-12"
```

#### Lister les commits sur une certaine durée 
```bash
git log --since=.weeks
```
La commande précédente liste les commits ayant été effectué depuis une semaine. Il est possible d'utiliser les périodes suivantes :
- days
- weeks
- months
- years


#### chercher des commits par autheurs
```bash
git log -3 --author "trstndbrtl"
```

#### ou plusieurs auteurs 
le | permet de séparer les noms et le \ devant le | permet d'échapper le | pour qu'il soit considéré comme un métacaractére et non comme un caractére.
```bash
git log -3 --author "trstndbrtl\|carminedavide"
```

#### Afficher un graphique des 20 dernier commits sur les différentes branches.
```bash
git log --graph --oneline -20
```
exemple:
```bash
C:\Users\trstndbrtl\Sites\bdc-dev (development -> origin)
λ git log --graph --oneline -20
* ed45655 MM-125 - Add link field to user profile
* 6338db2 [HotFix] - Migration 28/03/2019
*   a18152f Merge branch 'pre-production' into master
|\
| *   123fr89 Merge branch 'release/v2.5' into pre-production
| |\
| * | 1256der MM-158 - Creation theme template.
| * |   e45r6e4 MM-153 - Mock template
| |\ \
| * \ \   ejrke5e Merge branch 'development' into pre-production
| |\ \ \
* | | | | 45e6e5r [MM-188] Add right user group friends
* | | | |   e4r5t78 Merge branch 'release/v2.1.22.0-Security_update' into development
|\ \ \ \ \
| * | | | | 12r3f2d Applied bdc specific .htaccess
| * | | | | f4d56s5 Security update - Drupal core updated to v8.6.14
* | | | | |   d4f5r6d Merge branch 'release/v2.2' into development
|\ \ \ \ \ \
| * | | | | | sbdfhfjr MM-72 - Fix add news fields ajax bugs.
| * | | | | | d4f5r5f MM-71 - Fix color system ajax bugs.
* | | | | | |   fd4f5r8 Merge branch 'release/v2.2' into development
|\ \ \ \ \ \ \
| |/ / / / / /
| * | | | | | 45d698d MM-70 - Fix ajax dependences.
| * | | | | | 4d58r89 MM-69 - Add bg color ajax.
| * | | | | | r7r8r5f MM-68 - Add email unique research ajax.
* | | | | | | d1f2d54 MM-67 - Add username unique research ajax.
* | | | | | |   d45r6e9 Merge branch 'release/v2.2' into master
|\ \ \ \ \ \ \
| |/ / / / / /
```
### Prendre en compte les merges
```
git log --merges -2
```

### liste les commits impactant un fichier
```
git log -2 -- index.php
```
```
git log -2 -- index.php composer.json
```
## Différences

#### Différences en cours dans le répertoire
```
git diff
```

#### différences entre l'index et HEAD 
Commit le plus récent de la branche en cours.
```
git diff --cached
```

#### différences entre le répertoire de travail et HEAD 
```
git diff HEAD
```
## Différences introduites par un ou plusieurs commits
#### Pour identifier le commit parent d'un commit
```
git log --pretty=%P -1
```
Pour afficher le hash puis
```
git diff commit1..commit2
```
Ex : Pour voir les modifications introduites par le dernier commit 
```
git diff commit1..HEAD
```
ou
```
git diff HEAD^1..HEAD
```

### Identifier l'auteur d'une ligne de code
```
git blame index.php
```
## Recherche en mode pick axe
N'est ppas une commande mais une série de commandes
Il permet de faire des recherche en fonction des modifications qu'ils ajoutent.
Il peut etre utilisé avec `git log` ou `git diff` ou encore avec la commande `git format-patch`
Ajouter l'argument -S suivi du mot ou de la chaîne.
```
git log -S "le mot recherché"
```
Il est possible de faire des recherche en utilisant des expressions réguliaires avec l'argument -G
```
git log -G "expression1.{0, 20} expression2"
```
## Suppression
#### Suppression des modifications du répertoire de travail
Pour revenir à la derniere version du dépot (HEAD)
```
git reset --hard HEAD
```
#### Suppression des modifications de l'index
```
git reset HEAD
```
### Revenir à un état antérieur
#### Revenir à un état antérieur en utilisant un hash de commit
```
git reset hash_de_commit
```
### Modifier le dernier commit
#### Si le commit n'a pas été pushé dans le dépot
```
git commit --amend
```
Ex
```
cd forlder_projet
git init
vim index.php
git add index.php
git commit -m "ReadMe.md"
```
pour modifier le commit
```
vim index.php
git commit -m "README.md amend" --amend
```
#### Modifier uniquement le contenu sans modifier le message
```
git commit --amend --no-edit
```

## Branches et Tags
### Création d'un tag
```
git tag nom_du_tag
```
ou
```
git tag nom_du_tag hash
```
#### Création d'un tag annoté
```
git tag -a nom_du_tag
```
Cette commande demande à l'auteur d'inscrire un message de tag
#### Ajouter le message de tag dans la commande
```
git tag -a nom_du_tag -m "le message de tag"
```
### Lister les tags
```
git tag --list
```
#### Ex listant les tags, les noms et les 3 premières lignes du message de tag
`-l` peut remplacer `--list`
```
git tag -l -n3
```
### Détails d'un tag
Afficher les détails d'un tag affiche également le commit auquel il est associé.
```
git show v1.3.6
```
### Envoi des tags vers le dépot distant
Où `origin` est le nom du dépot distant
```
git push origin -tags
```
### Envoi des tags un a un
Où `origin` est le nom du dépot distant
```
git push origin nom_du_tag
```
### Suppression d'un tag
Supprimer un tag ne signifie pas supprimer le commit auquel il est attaché
```
git tag -d nom_du_tag
```
Le tag est supprimé localement
Pour faire savoir au dépot distant que le tag a été supprimer, il faut lui envoyer l'objet interne de git avec la commande
```
git push origin :refs/tags/nom_du_tag
```
## Les branches
### lister les branches
```
git branch
```
#### lister les branches, leurs hash et le message du dernier commit
```
git branch -v
```
### Création d'une branche
#### Vérifier si le nom d'une branche est valide 
```
git check-ref-format --branch nom_de_branche
```
#### Créer une branche
```
git branch nom_de_branche
```
ou
```
git checkout nom_de_branche
```
#### Se positionner sur une branche
```
git checkout nom_de_branche
```

### Fusionner deux branches
```
git checkout master
git merge nom_de_branche
```

# Git Entreprise
### Définir un utilisateur
```
git config --global user.name "trstndbrtl"
git config --global user.email trstndbrtl@hello.world
```

### Cloner un dépot
```
git clone nom_du_depot.git
```

## Scénario 1 dev

### Initialiser un projet
```
git init
```

### afficher les modifications
```
git status
```

### Ajouter des fichiers à l'index
```
git add nom_du_fichier
```

### Ajouter des fichiers à l'index
```
git commit -m "nom du commit"
```

### Initialiser le dépot de son local projet
```
git remote add origin url_depot.git
git push -u origin --all
```

### Initialiser le dépot de son local projet avec des tags
```
git remote add origin url_depot.git
git push -u origin --tags
```

### Récuperer les modifications d'un dépot distant
```
git pull
```

### Revenir a l'état du HEAD
Après avoir modifier un ficher
```
git checkoout nom_du_fichier
```

### Ajouter tous les fichiers modifiés dans l'index
```
git add -A
```

### Commiter tous les fichiers déja modifiés sans passer par l'index
```
git commit -a -m "message du commit"
```

### Envoyer des commit au dépot distant
```
git push
```

### Créer une branche fonctionnelle
```
git branch nom_de_branche
git checkout nom_de_branche
```
ou
```
git checkout -b nom_de_branche
```

### Merge de branche
Se placer sur la branche ou l'on souhaite faire le merge (Ex : la branche nouveau_menu)
puis merger la branche master à l'intérieur
```

git checkout nouveau_menu
git merge master
```

### Suppression d'une branche
```
git branch -d nouveau_menu
```

## Scénario 2 dev et plus

### Obtenir la liste de tous les fichiers qui peuvent etre ajoutés avec un `git add`
```
git add --all --dry-run > liste_fichiers.txt
```

### Ajouter des dépots intégrés

#### Ajouter Bootstrap en dépot intégré
Dans le dossier `lib` du projet, excécuter la commande puis vérifier 
l'intégration de la librairie dans le fichier .gitmodules à la racine du dépot
```
git submodule add https://github.com/thomaspark/bootswatch bootswatch
```

#### Ajouter jQuery en dépot intégré
```
git submodule add https://github.com/jquery/jquery jquery
cd jquery
npm run build
```

### Création de la branche `develop` pour Git-Flow
```
git checkout -b develop
git commit -m "C2 : Branch develop" --allow-empty
git push -u --all
```

### Màj de sa branche à partir du commit le plus récent de la branche `develop`
```
git pull --all
```

### Vérifier les branches existantes
```
git branch -a
```

### Si une branche distante n'est pas encore présente sur votre espace local
```
git checkout remotes/origin/develop
git checkout -d develop
```

### Initialiser des submodules
```
git submodules init
git submodules update
```
## Workflow intégration d'un correctif
### Créer une branche corrective `hotfix` à partir de la branche `master`
```
git pull --all
git checkout master
git checkout -b hotfix-menu-item
```

### Envoyer sur le dépot distant sa branche `hotfix-menu-item`
```
git add --all
git commit -m "hotfix/123654 - menu items"
git push -u origin hotfix-menu-item 
```

### Màj de la branche `master` avec la branche `hotfix-menu-item`
on se place sur la branche `master`
```
git checkout master
git pull
git merge --no-ff hotfix-menu-item
git push
git tag v1.0.1
git push --tags
```
### Màj de la branche `develop` avec la branche `hotfix-menu-item`
```
git checkout develop
git merge --no-ff hotfix-menu-item
git push origin develop
```

### Suppresion de la branche `hotfix-menu-item`
```
git branch -d hotfix-menu-item
git push origin :hotfix-menu-item
```

## Process création d'une feature `feat-85/new-block-weather` puis merge dans `develop`
### étape 1
#### Création d'une nouvelle branche `feat-85/new-block-weather` avec envoi dans dépot
```
git pull --all
git checkout develop
git checkout -b feat-85/new-block-weather
git commit -m "feat-85 - Branch feat-85/new-block-weather" --allow-empty
git push -u origin feat-85/new-block-weather
```
### étape 2
Après dévelopement
#### commit des modifications et envoi
```
git pull
git commit -m "feat-85 - Add Uikit weather block"
git push
```
#### Intégration de la branche `feat-85/new-block-weather` dans la branche `develop`
```
git checkout develop
git pull origin develop
git merge --no-ff feat-85/new-block-weather -m "feat-85 - Weather Block feature + Admin"
git push origin develop
```
#### Suppression de la branche `feat-85/new-block-weather`
```
git branch -d feat-85/new-block-weather
git push :feat-85/new-block-weather
```
