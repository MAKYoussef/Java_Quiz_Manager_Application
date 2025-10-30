package projet_poo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// Crée un objet Scanner pour lire les entrées utilisateur
        Gestionnaire gestionnaire = Gestionnaire.obtenirGestionnaire();// Obtient l'instance unique du gestionnaire de quiz

        // Création de quiz et de questions pour les tests
        // Quiz 1: POO
        Quiz quiz1 = new Quiz("POO", "John Doe");// Crée un quiz sur la POO par John Doe

        Question q1 = new Question(1, "Qu'est-ce que l'encapsulation ?");// Crée la question 1
        q1.ajouterOption(new Option("Cacher les données membres d'une classe", true));// Ajoute une option correcte
        q1.ajouterOption(new Option("Permettre l'accès aux données membres depuis l'extérieur", false));// Ajoute une option incorrecte
        q1.ajouterOption(new Option("Regrouper les données et les méthodes qui les manipulent", true));// Ajoute une option correcte
        quiz1.ajouterQuestion(q1);// Ajoute la question au quiz

        Question q2 = new Question(2, "Qu'est-ce que le polymorphisme ?");// Crée la question 2
        q2.ajouterOption(new Option("La capacité d'un objet à prendre plusieurs formes", true));// Ajoute une option correcte
        q2.ajouterOption(new Option("La capacité d'une méthode à avoir plusieurs signatures", true));// Ajoute une option correcte
        q2.ajouterOption(new Option("L'utilisation de l'héritage pour créer de nouvelles classes", false));// Ajoute une option incorrecte
        quiz1.ajouterQuestion(q2);// Ajoute la question au quiz

        Question q3 = new Question(3, "Qu'est-ce que l'héritage ?");// Crée la question 3
        q3.ajouterOption(new Option("Créer une nouvelle classe à partir d'une classe existante", true));// Ajoute une option correcte
        q3.ajouterOption(new Option("Réutiliser du code existant", true));// Ajoute une option correcte
        q3.ajouterOption(new Option("Cacher des données membres", false));// Ajoute une option incorrecte
        quiz1.ajouterQuestion(q3);// Ajoute la question au quiz

        Question q4 = new Question(4, "Qu'est-ce qu'une classe abstraite ?");// Crée la question 4
        q4.ajouterOption(new Option("Une classe qui ne peut pas être instanciée", true));// Ajoute une option correcte
        q4.ajouterOption(new Option("Une classe qui doit être héritée", true));// Ajoute une option correcte
        q4.ajouterOption(new Option("Une classe qui ne contient que des méthodes abstraites", false));// Ajoute une option incorrecte 
        quiz1.ajouterQuestion(q4);// Ajoute la question au quiz

        gestionnaire.ajouterQuiz(quiz1);// Ajoute le quiz "POO" au gestionnaire


        // Quiz 2: BD
        Quiz quiz2 = new Quiz("BD", "Jane Smith");// Crée un quiz sur les BD par Jane Smith
        
        Question q21 = new Question(1, "Qu'est-ce qu'une base de données relationnelle ?");// Crée la question 1
        q21.ajouterOption(new Option("Une collection de données organisées en tables", true));// Ajoute une option correcte
        q21.ajouterOption(new Option("Un type de base de données NoSQL", false));// Ajoute une option incorrecte
        q21.ajouterOption(new Option("Une base de données hiérarchique", false));// Ajoute une option incorrecte
        quiz2.ajouterQuestion(q21);// Ajoute la question au quiz

        Question q22 = new Question(2, "Qu'est-ce qu'une clé primaire ?");// Crée la question 2
        q22.ajouterOption(new Option("Un attribut qui identifie de manière unique un enregistrement dans une table", true));// Ajoute une option correcte
        q22.ajouterOption(new Option("Un attribut qui peut prendre une valeur nulle", false));// Ajoute une option incorrecte
        q22.ajouterOption(new Option("Un attribut qui est utilisé pour lier deux tables", false));// Ajoute une option incorrecte
        quiz2.ajouterQuestion(q22);// Ajoute la question au quiz

        Question q23 = new Question(3, "Qu'est-ce qu'une requête SQL ?");// Crée la question 3
        q23.ajouterOption(new Option("Une instruction qui permet de manipuler les données d'une base de données", true));// Ajoute une option correcte
        q23.ajouterOption(new Option("Un langage de programmation orienté objet", false));// Ajoute une option incorrecte
        q23.ajouterOption(new Option("Un type de base de données", false));// Ajoute une option incorrecte
        quiz2.ajouterQuestion(q23);// Ajoute la question au quiz

        Question q24 = new Question(4, "Qu'est-ce qu'une jointure ?");// Crée la question 4
        q24.ajouterOption(new Option("Une opération qui combine les données de deux tables ou plus", true));// Ajoute une option correcte
        q24.ajouterOption(new Option("Une opération qui supprime des données d'une table", false));// Ajoute une option incorrecte
        q24.ajouterOption(new Option("Une opération qui trie les données d'une table", false));// Ajoute une option incorrecte
        quiz2.ajouterQuestion(q24);// Ajoute la question au quiz

        gestionnaire.ajouterQuiz(quiz2);// Ajoute le quiz "BD" au gestionnaire
        

        // Quiz 3: COO
        Quiz quiz3 = new Quiz("COO", "Peter Jones"); // Crée un quiz sur les concepts d'exploitation par Peter Jones

        Question q31 = new Question(1, "Qu'est-ce qu'un système d'exploitation ?");// Crée la question 1
        q31.ajouterOption(new Option("Un ensemble de programmes qui gèrent les ressources d'un ordinateur", true));// Ajoute une option correcte
        q31.ajouterOption(new Option("Un langage de programmation", false));// Ajoute une option incorrecte
        q31.ajouterOption(new Option("Un type de matériel informatique", false));// Ajoute une option incorrecte
        quiz3.ajouterQuestion(q31);// Ajoute la question au quiz

        Question q32 = new Question(2, "Qu'est-ce qu'un processus ?");// Crée la question 2
        q32.ajouterOption(new Option("Une instance d'un programme en cours d'exécution", true));// Ajoute une option correcte
        q32.ajouterOption(new Option("Une unité d'exécution dans un programme", false));// Ajoute une option incorrecte
        q32.ajouterOption(new Option("Une partie de la mémoire vive", false));// Ajoute une option incorrecte
        quiz3.ajouterQuestion(q32);// Ajoute la question au quiz

        Question q33 = new Question(3, "Qu'est-ce qu'un thread ?");// Crée la question 3
        q33.ajouterOption(new Option("Une unité d'exécution dans un processus", true));// Ajoute une option correcte
        q33.ajouterOption(new Option("Un programme en cours d'exécution", false));// Ajoute une option incorrecte
        q33.ajouterOption(new Option("Une partie du disque dur", false));// Ajoute une option incorrecte
        quiz3.ajouterQuestion(q33);// Ajoute la question au quiz

        Question q34 = new Question(4, "Qu'est-ce que la mémoire virtuelle ?");// Crée la question 4
        q34.ajouterOption(new Option("Une technique qui permet d'utiliser le disque dur comme extension de la mémoire vive", true));// Ajoute une option correcte
        q34.ajouterOption(new Option("La mémoire cache du processeur", false));// Ajoute une option incorrecte
        q34.ajouterOption(new Option("La mémoire ROM", false));// Ajoute une option incorrecte
        quiz3.ajouterQuestion(q34);// Ajoute la question au quiz

        gestionnaire.ajouterQuiz(quiz3);// Ajoute le quiz "COO" au gestionnaire

        // Quiz 4: Réseaux
        Quiz quiz4 = new Quiz("Réseaux", "Alice Brown");// Crée un quiz sur les réseaux par Alice Brown

        Question q41 = new Question(1, "Qu'est-ce que le modèle OSI ?");// Crée la question 1
        q41.ajouterOption(new Option("Un modèle en couches qui décrit les fonctions d'un réseau de communication", true));// Ajoute une option correcte
        q41.ajouterOption(new Option("Un protocole de communication", false));// Ajoute une option incorrecte
        q41.ajouterOption(new Option("Un type de réseau", false));// Ajoute une option incorrecte
        quiz4.ajouterQuestion(q41);// Ajoute la question au quiz

        Question q42 = new Question(2, "Qu'est-ce que TCP/IP ?");// Crée la question 2
        q42.ajouterOption(new Option("Une suite de protocoles de communication", true));// Ajoute une option correcte
        q42.ajouterOption(new Option("Un langage de programmation", false));// Ajoute une option incorrecte
        q42.ajouterOption(new Option("Un système d'exploitation", false));// Ajoute une option incorrecte
        quiz4.ajouterQuestion(q42);// Ajoute la question au quiz

        Question q43 = new Question(3, "Qu'est-ce qu'une adresse IP ?");// Crée la question 3
        q43.ajouterOption(new Option("Une adresse numérique qui identifie un appareil sur un réseau", true));// Ajoute une option correcte
        q43.ajouterOption(new Option("Une adresse physique d'un appareil", false));// Ajoute une option incorrecte
        q43.ajouterOption(new Option("Un nom de domaine", false));// Ajoute une option incorrecte
        quiz4.ajouterQuestion(q43);// Ajoute la question au quiz

        Question q44 = new Question(4, "Qu'est-ce qu'un routeur ?");// Crée la question 4
        q44.ajouterOption(new Option("Un appareil qui permet de connecter plusieurs réseaux", true));// Ajoute une option correcte
        q44.ajouterOption(new Option("Un appareil qui permet de connecter un ordinateur à Internet", false));// Ajoute une option incorrecte
        q44.ajouterOption(new Option("Un type de serveur", false));// Ajoute une option incorrecte
        quiz4.ajouterQuestion(q44);// Ajoute la question au quiz

        gestionnaire.ajouterQuiz(quiz4);// Ajoute le quiz "Réseaux" au gestionnaire


        // Boucle principale du programme
        while (true) {
            // Affiche le menu principal
            System.out.println("\n--- Gestionnaire de Quiz ---");
            System.out.println("1. Connexion Enseignant");
            System.out.println("2. Connexion Etudiant");
            System.out.println("3. Quitter");
            System.out.print("Choisissez une option : ");
            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:// Connexion Enseignant
                    System.out.print("Nom : ");
                    String nom = scanner.nextLine();
                    System.out.print("Prénom : ");
                    String prenom = scanner.nextLine();
                    System.out.print("Identifiant : ");
                    String identifiant = scanner.nextLine();

                    Enseignant enseignant = new Enseignant(nom, prenom, identifiant);// Crée un objet Enseignant
                    
                    while (true) {
                    	// Boucle du menu Enseignant : cette boucle permet à l'enseignant de rester dans le menu 
                        // et d'effectuer plusieurs actions avant de choisir de retourner au menu principal.
                        System.out.println("\n--- Menu Enseignant ---");
                        System.out.println("1. Créer un quiz");
                        System.out.println("2. Afficher un quiz");
                        System.out.println("3. Supprimer un quiz");
                        System.out.println("4. Modifier un quiz");
                        System.out.println("5. Visualiser les résultats d'un quiz");
                        System.out.println("6. Afficher le taux de réponses d'un quiz");
                        System.out.println("7. Retour");
                        System.out.print("Choisissez une option : ");
                        
                        int choixEnseignant = scanner.nextInt();
                        scanner.nextLine();

                        switch (choixEnseignant) {
                            case 1:// Créer un quiz : appelle la méthode creerQuiz de l'objet enseignant pour créer un nouveau quiz.
                                enseignant.creerQuiz(gestionnaire);
                                break;
                            case 2:// Affiche un quiz : affiche la liste des quiz disponibles et permet à l'enseignant de choisir un quiz à afficher.
                                System.out.println("Liste des quiz disponibles :");
                                ArrayList<Quiz> quizzes = gestionnaire.getQuizzes();
                                for (int i = 0; i < quizzes.size(); i++) {
                                    System.out.println((i + 1) + ". " + quizzes.get(i).getTheme());
                                }
                                System.out.print("Choisissez un quiz à afficher : ");
                                int choixQuiz = scanner.nextInt();
                                scanner.nextLine();
                                if (choixQuiz > 0 && choixQuiz <= quizzes.size()) {
                                    enseignant.afficherQuiz(quizzes.get(choixQuiz - 1));
                                } else {
                                    System.out.println("Choix invalide.");
                                }
                                break;
                            case 3:// Supprimer un quiz : affiche la liste des quiz disponibles et permet à l'enseignant de choisir un quiz à supprimer.
                                System.out.println("Liste des quiz disponibles :");
                                quizzes = gestionnaire.getQuizzes();
                                for (int i = 0; i < quizzes.size(); i++) {
                                    System.out.println((i + 1) + ". " + quizzes.get(i).getTheme());
                                }
                                System.out.print("Choisissez un quiz à supprimer : ");
                                choixQuiz = scanner.nextInt();
                                scanner.nextLine();
                                if (choixQuiz > 0 && choixQuiz <= quizzes.size()) {
                                    enseignant.supprimerQuiz(gestionnaire, quizzes.get(choixQuiz - 1));
                                } else {
                                    System.out.println("Choix invalide.");
                                }
                                break;
                            case 4:// Modifier un quiz : affiche la liste des quiz disponibles et permet à l'enseignant de choisir un quiz à modifier.
                                System.out.println("Liste des quiz disponibles :");
                                quizzes = gestionnaire.getQuizzes();
                                for (int i = 0; i < quizzes.size(); i++) {
                                    System.out.println((i + 1) + ". " + quizzes.get(i).getTheme());
                                }
                                System.out.print("Choisissez un quiz à modifier : ");
                                choixQuiz = scanner.nextInt();
                                scanner.nextLine();
                                if (choixQuiz > 0 && choixQuiz <= quizzes.size()) {
                                    enseignant.modifierQuiz(quizzes.get(choixQuiz - 1), scanner);
                                } else {
                                    System.out.println("Choix invalide.");
                                }
                                break;
                            case 5:// Visualiser les résultats d'un quiz : affiche la liste des quiz disponibles et permet à l'enseignant de choisir un quiz pour visualiser les résultats des étudiants.
                                System.out.println("Liste des quiz disponibles :");
                                quizzes = gestionnaire.getQuizzes();
                                for (int i = 0; i < quizzes.size(); i++) {
                                    System.out.println((i + 1) + ". " + quizzes.get(i).getTheme());
                                }
                                System.out.print("Choisissez un quiz pour visualiser les résultats : ");
                                choixQuiz = scanner.nextInt();
                                scanner.nextLine();
                                if (choixQuiz > 0 && choixQuiz <= quizzes.size()) {
                                    enseignant.visualiserResultats(quizzes.get(choixQuiz - 1), gestionnaire);
                                } else {
                                    System.out.println("Choix invalide.");
                                }
                                break;
                            case 6:// Afficher le taux de réponses d'un quiz : affiche la liste des quiz disponibles et permet à l'enseignant de choisir un quiz pour afficher le taux de réponses correctes et incorrectes pour chaque question.
                                System.out.println("Liste des quiz disponibles :");
                                quizzes = gestionnaire.getQuizzes();
                                for (int i = 0; i < quizzes.size(); i++) {
                                    System.out.println((i + 1) + ". " + quizzes.get(i).getTheme());
                                }
                                System.out.print("Choisissez un quiz pour afficher le taux de réponses : ");
                                choixQuiz = scanner.nextInt();
                                scanner.nextLine();
                                if (choixQuiz > 0 && choixQuiz <= quizzes.size()) {
                                    enseignant.afficherTauxReponses(quizzes.get(choixQuiz - 1), gestionnaire);
                                } else {
                                    System.out.println("Choix invalide.");
                                }
                                break;
                            case 7:// Retour : sort de la boucle du menu Enseignant et retourne au menu principal.
                                break;
                            default:// Option invalide : affiche un message d'erreur si l'enseignant choisit une option invalide.
                                System.out.println("Option invalide.");
                        }
                        if (choixEnseignant == 7) break;// Sort de la boucle du menu Enseignant si l'option 7 est choisie.
                    }
                    break;// Sort du cas 1 (Connexion Enseignant)

                case 2:// Connexion Etudiant
                    System.out.print("Nom : ");
                    nom = scanner.nextLine();
                    System.out.print("Prénom : ");
                    prenom = scanner.nextLine();
                    System.out.print("Identifiant : ");
                    identifiant = scanner.nextLine();

                    Etudiant etudiant = null;
                    // Recherche si l'étudiant existe déjà
                    for (Etudiant e : gestionnaire.getEtudiants()) {
                        if (e.getNom().equals(nom) && e.getPrenom().equals(prenom) && e.getIdentifiant().equals(identifiant)) {
                            etudiant = e;
                            break;
                        }
                    }
                    // Si l'étudiant n'existe pas, le créer et l'ajouter à la liste
                    if (etudiant == null) {
                        etudiant = new Etudiant(nom, prenom, identifiant);
                        gestionnaire.ajouterEtudiant(etudiant);
                    }
                    // Boucle du menu Etudiant : cette boucle permet à l'étudiant de rester dans le menu 
                    // et d'effectuer plusieurs actions avant de choisir de retourner au menu principal.
                    while (true) {
                        System.out.println("\n--- Menu Etudiant ---");
                        System.out.println("1. Visualiser les quiz disponibles");
                        System.out.println("2. Répondre à un quiz");
                        System.out.println("3. Consulter mes scores");
                        System.out.println("4. Consulter la correction d'un quiz");
                        System.out.println("5. Retour");
                        System.out.print("Choisissez une option : ");

                        int choixEtudiant = scanner.nextInt();
                        scanner.nextLine();

                        switch (choixEtudiant) {
                            case 1:// Visualiser les quiz disponibles : appelle la méthode visualiserQuizDisponibles de l'objet etudiant pour afficher la liste des quiz disponibles.
                                etudiant.visualiserQuizDisponibles(gestionnaire);
                                break;
                            case 2:// Répondre à un quiz : affiche la liste des quiz disponibles et permet à l'étudiant de choisir un quiz à passer.
                                System.out.println("Liste des quiz disponibles :");
                                ArrayList<Quiz> quizzes = gestionnaire.getQuizzes();
                                for (int i = 0; i < quizzes.size(); i++) {
                                    System.out.println((i + 1) + ". " + quizzes.get(i).getTheme());
                                }
                                System.out.print("Choisissez un quiz à passer : ");
                                int choixQuiz = scanner.nextInt();
                                scanner.nextLine();
                                if (choixQuiz > 0 && choixQuiz <= quizzes.size()) {
                                    etudiant.repondreQuiz(quizzes.get(choixQuiz - 1), scanner);
                                } else {
                                    System.out.println("Choix invalide.");
                                }
                                break;
                            case 3:// Consulter mes scores : appelle la méthode consulterScores de l'objet etudiant pour afficher les scores de l'étudiant pour les quiz qu'il a déjà passés.
                                etudiant.consulterScores();
                                break;
                            case 4:// Consulter la correction d'un quiz : affiche la liste des quiz disponibles et permet à l'étudiant de choisir un quiz pour consulter sa correction.
                                System.out.println("Liste des quiz disponibles :");
                                quizzes = gestionnaire.getQuizzes();
                                for (int i = 0; i < quizzes.size(); i++) {
                                    System.out.println((i + 1) + ". " + quizzes.get(i).getTheme());
                                }
                                System.out.print("Choisissez un quiz pour consulter la correction : ");
                                choixQuiz = scanner.nextInt();
                                scanner.nextLine();
                                if (choixQuiz > 0 && choixQuiz <= quizzes.size()) {
                                    etudiant.consulterCorrection(quizzes.get(choixQuiz - 1));
                                } else {
                                    System.out.println("Choix invalide.");
                                }
                                break;
                            case 5:// Retour : sort de la boucle du menu Etudiant et retourne au menu principal.
                                break;
                            default:// Option invalide : affiche un message d'erreur si l'étudiant choisit une option invalide.
                                System.out.println("Option invalide.");
                        }
                        if (choixEtudiant == 5) break;// Sort de la boucle du menu Etudiant si l'option 5 est choisie
                    }
                    break;// Sort du cas 2 (Connexion Etudiant)

                case 3:
                    System.out.println("Au revoir !");// Sort du cas 3 (Arret de l'éxecution)
                    return;
                default:
                    System.out.println("Option invalide.");
            }
        }
    }
}