// ResultatQuiz.java
package projet_poo;

import java.util.ArrayList;

public class ResultatQuiz {
    private Quiz quiz; // Quiz auquel le résultat correspond
    private double score; // Score obtenu au quiz
    private ArrayList<Integer> reponses; // Liste des réponses de l'étudiant

    public ResultatQuiz(Quiz quiz, double score, ArrayList<Integer> reponses) {
        this.quiz = quiz; // Initialise le quiz
        this.score = score; // Initialise le score
        this.reponses = reponses; // Initialise la liste des réponses
    }

    public Quiz getQuiz() {
        return quiz; // Retourne le quiz
    }

    public double getScore() {
        return score; // Retourne le score
    }

    public ArrayList<Integer> getReponses() {
        return reponses; // Retourne la liste des réponses
    }
}