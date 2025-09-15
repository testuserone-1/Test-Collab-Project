**Étape 1 :**

- *Développeur 1 :*
    - [ ] Ajouter une nouvelle classe Dragon héritant des comportements de la classe Monster.
    - [ ] La classe a la particularité de posséder 30% de chance d'esquiver les dégâts subit lors d'un tour de combat.
    - [ ] Elle possède 400 points de vie et une force de 1 au début.


- *Développeur 2 :*
    - [ ] Ajouter une nouvelle classe Mage héritant par défaut des comportements de la classe Hero.
    - [ ] La classe peut posséder un sort de dégât allant de 20 à 40 mais son pouvoir n'augmente pas.
    - [ ] Elle possède 200 points de vie et une force de 1 (qui sera donc fixe).

**Étape 2 :**

- *Développeur 1 :*
    - [ ] Ajouter une nouvelle classe Orc héritant des comportements de la classe Monster.
    - [ ] La classe a la particularité de pouvoir, par moment, d'infliger 10 fois les dégâts. Cela à hauteur de 5\% de probabilité.
    - [ ] Elle possède 120 points de vie et une force de 3 au début mais qui décroit de 5\% après chaque attaque.


- *Développeur 2 :*
    - [ ] Ajouter une nouvelle classe Knight héritant par défaut des comportements de la classe Hero.
    - [ ] La classe peut posséder un sort de protection qui permet de ne subir que 50% des dégâts les 3 premiers tours.
    - [ ] Elle possède 100 points de vie et une force de 2 qui n'évolue pas pendant la partie.

**Étape 3 :**

- *Développeur 1 :*
    - [ ] Les héros et les monstres peuvent posséder une protection. Ajouter un indicateur de protection compris entre 0 et 1.
    - [ ] Les classes Dragon, Mage, Orc et Knight ont respectivement  les valeurs de protection suivantes : 0.8, 0.3, 0.1 et 0.6.
    - [ ] L'indicateur de protection est appliqué lors du calcul de l'impact d'une attaque. La valeur de l'attaque est alors égale à : (1-protection) * damage


- *Développeur 2 :*
    - [ ] Les attributs de la classe Character sont protected. Passez les en private.
    - [ ] Développer strictement les méthodes nécessaires pour prendre en compte ce changement. Il est interdit de développer des méthodes de type setter.

**Étape 4 :**

- *Développeur 1 :*
  - [ ] Ajouter la protection dans la méthode to_string


- *Développeur 2 :*
  - [ ] Modifier la méthode apply_damage afin de faire apparaître dans le message en console le facteur de protection qui est appliqué.

**Étape 5 :**

- *Développeur 1 :*
  - [ ] Ajouter une nouvelle classe Squad qui représente un ensemble de Characters. Elle possède les attributs suivants : name et liste des membres (de type Character) et les méthodes suivantes : constructeur, get_name et to_string.
  - [ ] Définir une sous-classe MonsterSquad avec une méthode add_monster.


- *Développeur 2 :*
  - [ ] Définir une sous-classe HeroSquad avec une méthode add_hero.
  - [ ] Ajouter la méthode select qui choisit aléatoirement un membre de la Squad.

**Étape 6 :**

- *Développeur 1 :*
  - [ ] Modifier la fonction main afin de réaliser un combat entre deux squads (une squad de monstres et une squad de héros). A chaque tour, un monstre et un héro sont sélectionnés aléatoirement. Si l'un des deux n'a plus de vie, alors il ne peut pas être choisi pour les tours suivants.


- *Développeur 2 :*
  - [ ] Modifier la méthode to_string de la classe Squad afin qu'elle produise une chaîne de caractères avec la liste ordonnée des personnages en fonction de leur point de vie.
  - [ ] Ajouter une méthode clean dans la classe Squad qui supprime les personnages qui n'ont plus de vie.