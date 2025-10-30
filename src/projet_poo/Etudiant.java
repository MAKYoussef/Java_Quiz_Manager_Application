// Etudiant.java
package projet_poo;

import java.util.ArrayList;
import java.util.Scanner;

public class Etudiant extends Utilisateur {
    private ArrayList<ResultatQuiz> resultatsQuizzes; // Liste pour stocker les résultats des quiz

    public Etudiant(String nom, String prenom, String identifiant) {
        super(nom, prenom, identifiant);
        this.resultatsQuizzes = new ArrayList<>();
    }

    public void visualiserQuizDisponibles(Gestionnaire gestionnaire) {
        System.out.println("Liste des quiz disponibles :");
        ArrayList<Quiz> quizzes = gestionnaire.getQuizzes(); // Obtient la liste des quiz depuis le gestionnaire
        for (Quiz quiz : quizzes) { // Parcours la liste des quiz
            System.out.println("- " + quiz.getTheme() + " (Auteur : " + quiz.getAuteur() + ")"); // Affiche le thème et l'auteur de chaque quiz
        }
    }

    public void repondreQuiz(Quiz quiz, Scanner scanner) {
        // Vérifie si l'étudiant a déjà répondu au quiz
        boolean aDejaRepondu = false;
        for (ResultatQuiz resultat : resultatsQuizzes) {
            if (resultat.getQuiz() == quiz) {
                aDejaRepondu = true;
                break;
            }
        }

        if (aDejaRepondu) {
            System.out.println("Vous avez déjà répondu à ce quiz.");
            return;
        }

        ArrayList<Integer> reponsesEtudiant = new ArrayList<>(); // Liste pour stocker les réponses de l'étudiant
        // Parcours chaque question du quiz
        for (Question question : quiz.getQuestions()) {
            System.out.println(question); // Affiche la question
            // Affiche les options de la question
            for (int i = 0; i < question.getOptions().size(); i++) {
                System.out.println((i + 1) + ". " + question.getOptions().get(i).getTexte());
            }

            String reponse;
            do {
                System.out.print("Votre réponse (entrez les numéros des options séparés par des tirets, ex: 1-2-3): ");
                reponse = scanner.nextLine();
            } while (!reponse.matches("[1-" + question.getOptions().size() + "](-[1-" + question.getOptions().size() + "])*")); // Validation du format de la réponse

            // Analyse la réponse de l'étudiant
            for (String optionIndex : reponse.split("-")) {
                reponsesEtudiant.add(Integer.parseInt(optionIndex) - 1);
            }
        }

        int score = quiz.calculerScore(reponsesEtudiant); // Calcule le score de l'étudiant
        System.out.println("Votre score : " + score); // Affiche le score

        // Stocke le résultat du quiz
        resultatsQuizzes.add(new ResultatQuiz(quiz, score, reponsesEtudiant));
    }

    public void consulterScores() {
        System.out.println("Vos scores aux quiz :");
        if (resultatsQuizzes.isEmpty()) { // Vérifie si l'étudiant a des résultats
            System.out.println("Vous n'avez passé aucun quiz.");
        } else {
            // Affiche les scores de l'étudiant pour chaque quiz
            for (ResultatQuiz resultat : resultatsQuizzes) {
                System.out.println("- " + resultat.getQuiz().getTheme() + ": " + resultat.getScore());
            }
        }
    }

    public void consulterCorrection(Quiz quiz) {
        // Vérifie si l'étudiant a déjà répondu au quiz
        boolean aDejaRepondu = false;
        for (ResultatQuiz resultat : resultatsQuizzes) {
            if (resultat.getQuiz() == quiz) {
                aDejaRepondu = true;
                break;
            }
        }

        if (!aDejaRepondu) {
            System.out.println("Vous devez d'abord répondre au quiz pour consulter la correction.");
            return;
        }

        System.out.println("Correction du quiz : " + quiz.getTheme());
        // Affiche la correction du quiz
        for (Question question : quiz.getQuestions()) {
            System.out.println(question);
            for (int i = 0; i < question.getOptions().size(); i++) {
                Option option = question.getOptions().get(i);
                System.out.println((i + 1) + ". " + option.getTexte() + " - " + (option.isValide() ? "CORRECT" : "INCORRECT"));
            }
            System.out.println();
        }
    }

    public ArrayList<ResultatQuiz> getResultatsQuizzes() {
        return resultatsQuizzes; // Retourne la liste des résultats des quiz
    }
}