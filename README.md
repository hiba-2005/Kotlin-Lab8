# Lab 8 — Kotlin Collections (List, Set, Map & Elvis `?:`)

## 📘 Module
Fondamentaux de la programmation en Kotlin

---

## 🎯 Objectifs pédagogiques
À la fin de ce TP, l’étudiant sera capable de :
- Créer et manipuler une **liste d’objets** (`List<Comment>`)
- Utiliser un **ensemble** (`Set<Int>`) pour gérer des identifiants uniques
- Créer et exploiter une **map** (`Map<Int, String>`) pour représenter des relations
- Parcourir une collection avec une boucle `for`
- Tester l’appartenance avec les opérateurs `in` et `!in`
- Récupérer une valeur nullable depuis une map avec `map[key]`
- Utiliser l’opérateur **Elvis `?:`** pour fournir une valeur par défaut

---

## 🧠 Contexte (Scénario)
Un forum contient un **post unique**.  
Des utilisateurs publient des commentaires.  
L’auteur du post peut :
- **Bloquer certains utilisateurs** (leurs commentaires ne doivent pas s’afficher)
- **Afficher la relation** entre lui et l’auteur du commentaire (Friend, Work Colleague, etc.)
- Afficher **"unknown"** si aucune relation n’est définie

---

## 🧾 Résultat attendu
<div align="center"> <img src="image/image1.jpeg" alt="Résultat image 1" width="1000"/> <p><em>Figure 1</em></p> </div>

