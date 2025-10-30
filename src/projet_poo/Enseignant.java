// Enseignant.java
package projet_poo;

import java.util.ArrayList;
import java.util.Scanner;

public class Enseignant extends Utilisateur {

    public Enseignant(String nom, String prenom, String identifiant) {
        super(nom, prenom, identifiant);
    }

    public void creerQuiz(Gestionnaire gestionnaire) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le thème du quiz : ");
        String theme = scanner.nextLine();
        System.out.print("Entrez l'auteur du quiz : ");
        String auteur = scanner.nextLine();
        Quiz nouveauQuiz = new Quiz(theme, auteur);

        String reponse;
        do {
            System.out.print("Ajouter une question ? (O/N) : ");
            reponse = scanner.nextLine();

            // Vérifie si l'utilisateur veut ajouter une question
            if (reponse.equalsIgnoreCase("O")) {
                System.out.print("Entrez le texte de la question : ");
                String texte = scanner.nextLine();
                int numeroQuestion = nouveauQuiz.getQuestions().size() + 1;
                Question question = new Question(numeroQuestion, texte);

                String reponseOption;
                do {
                    System.out.print("Ajouter une option ? (O/N) : ");
                    reponseOption = scanner.nextLine();

                    // Vérifie si l'utilisateur veut ajouter une option
                    if (reponseOption.equalsIgnoreCase("O")) {
                        System.out.print("Entrez le texte de l'option : ");
                        String texteOption = scanner.nextLine();
                        System.out.print("L'option est-elle valide ? (V/F) : ");
                        boolean valide = scanner.nextLine().equalsIgnoreCase("V");
                        question.ajouterOption(new Option(texteOption, valide));
                    }
                } while (reponseOption.equalsIgnoreCase("O")); // Boucle tant que l'utilisateur veut ajouter des options

                // Vérifie si la question a au moins une option
                if (question.getOptions().isEmpty()) {
                    System.out.println("Erreur : Une question doit avoir au moins une option.");
                } else {
                    nouveauQuiz.ajouterQuestion(question);
                }
            }
        } while (reponse.equalsIgnoreCase("O")); // Boucle tant que l'utilisateur veut ajouter des questions

        // Vérifie si le quiz a au moins une question
        if (nouveauQuiz.getQuestions().isEmpty()) {
            System.out.println("Erreur : Un quiz doit avoir au moins une question.");
        } else {
            gestionnaire.ajouterQuiz(nouveauQuiz);
            System.out.println("Quiz créé avec succès !");
        }
    }

    public void afficherQuiz(Quiz quiz) {
        System.out.println(quiz);
        System.out.println("Liste des questions :");
        for (Question question : quiz.getQuestions()) {
            System.out.println(question);
            for (Option option : question.getOptions()) {
                System.out.println("  " + option);
            }
            System.out.println();
        }
    }

    public void supprimerQuiz(Gestionnaire gestionnaire, Quiz quiz) {
        gestionnaire.supprimerQuiz(quiz);
        System.out.println("Quiz supprimé avec succès !");
    }

    public void modifierQuiz(Quiz quiz, Scanner scanner) {
        System.out.println("Quiz actuel : " + quiz);

        System.out.print("Modifier le thème ? (O/N) : ");
        if (scanner.nextLine().equalsIgnoreCase("O")) {
            System.out.print("Nouveau thème : ");
            quiz.setTheme(scanner.nextLine());
        }

        System.out.print("Modifier l'auteur ? (O/N) : ");
        if (scanner.nextLine().equalsIgnoreCase("O")) {
            System.out.print("Nouvel auteur : ");
            quiz.setAuteur(scanner.nextLine());
        }

        String reponse;
        do {
            System.out.print("Ajouter une question ? (O/N) : ");
            reponse = scanner.nextLine();
            if (reponse.equalsIgnoreCase("O")) {
                System.out.print("Entrez le texte de la question : ");
                String texte = scanner.nextLine();
                int numeroQuestion = quiz.getQuestions().size() + 1;
                Question question = new Question(numeroQuestion, texte);

                String reponseOption;
                do {
                    System.out.print("Ajouter une option ? (O/N) : ");
                    reponseOption = scanner.nextLine();
                    if (reponseOption.equalsIgnoreCase("O")) {
                        System.out.print("Entrez le texte de l'option : ");
                        String texteOption = scanner.nextLine();
                        System.out.print("L'option est-elle valide ? (V/F) : ");
                        boolean valide = scanner.nextLine().equalsIgnoreCase("V");
                        question.ajouterOption(new Option(texteOption, valide));
                    }
                } while (reponseOption.equalsIgnoreCase("O"));

                quiz.ajouterQuestion(question);
            }
        } while (reponse.equalsIgnoreCase("O"));

        System.out.print("Supprimer une question ? (O/N) : ");
        if (scanner.nextLine().equalsIgnoreCase("O")) {
            System.out.print("Entrez le numéro de la question à supprimer : ");
            int numeroQuestion = scanner.nextInt();
            scanner.nextLine();
            quiz.supprimerQuestion(numeroQuestion);
        }
    }

    public void visualiserResultats(Quiz quiz, Gestionnaire gestionnaire) {
        System.out.println("Résultats pour le quiz : " + quiz.getTheme());
        ArrayList<Etudiant> etudiants = gestionnaire.getEtudiants();
        boolean aucunResultat = true;
        for (Etudiant etudiant : etudiants) {
            for (ResultatQuiz resultat : etudiant.getResultatsQuizzes()) {
                if (resultat.getQuiz() == quiz) {
                    System.out.println("- " + etudiant.getNomComplet() + ": " + resultat.getScore());
                    aucunResultat = false;
                }
            }
        }
        if (aucunResultat) {
            System.out.println("Aucun résultat disponible pour ce quiz.");
        }
    }

    public void afficherTauxReponses(Quiz quiz, Gestionnaire gestionnaire) {
        System.out.println("Taux de réponses pour le quiz : " + quiz.getTheme());
        ArrayList<Question> questions = quiz.getQuestions();
        ArrayList<Etudiant> etudiants = gestionnaire.getEtudiants();

        // Parcours de chaque question du quiz
        for (Question question : questions) {
            int totalReponses = 0;
            int bonnesReponses = 0;

            // Parcours de chaque étudiant
            for (Etudiant etudiant : etudiants) {
                // Parcours des résultats de chaque étudiant
                for (ResultatQuiz resultat : etudiant.getResultatsQuizzes()) {
                    // Vérifie si le résultat correspond au quiz actuel
                    if (resultat.getQuiz() == quiz) {
                        ArrayList<Integer> reponsesEtudiant = resultat.getReponses();
                        // Vérifie si l'étudiant a répondu à toutes les questions
                        if (reponsesEtudiant != null && reponsesEtudiant.size() == questions.size()) {
                            int reponseIndex = questions.indexOf(question);
                            // Vérifie si l'index de la réponse est valide
                            if (reponseIndex >= 0 && reponseIndex < reponsesEtudiant.size()) {
                                int reponseEtudiantIndex = reponsesEtudiant.get(reponseIndex);
                                if (question.isReponseValide(reponseEtudiantIndex)) {
                                    bonnesReponses++;
                                }
                                totalReponses++;
                            }
                        }
                    }
                }
            }

            // Affiche le taux de réponses correctes et incorrectes pour la question
            if (totalReponses > 0) {
                double tauxCorrect = ((double) bonnesReponses / totalReponses) * 100;
                double tauxIncorrect = 100 - tauxCorrect;
                System.out.println("Question " + question.getNumero() + ":");
                System.out.println("  Taux de réponses justes : " + tauxCorrect + "%");
                System.out.println("  Taux de réponses fausses : " + tauxIncorrect + "%");
            } else {
                System.out.println("Question " + question.getNumero() + ": Aucune réponse enregistrée.");
            }
        }
    }
}