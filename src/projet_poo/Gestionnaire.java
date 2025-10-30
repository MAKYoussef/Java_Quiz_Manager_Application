// Gestionnaire.java
package projet_poo;

import java.util.ArrayList;

public class Gestionnaire {
    public ArrayList<Enseignant> enseignants; // Liste des enseignants
    public ArrayList<Etudiant> etudiants; // Liste des étudiants
    public ArrayList<Quiz> quizzes; // Liste des quiz

    // Instance unique du gestionnaire
    public static Gestionnaire uniqueGestionnaire;

    public Gestionnaire() {
        enseignants = new ArrayList<>(); // Initialise la liste des enseignants
        etudiants = new ArrayList<>(); // Initialise la liste des étudiants
        quizzes = new ArrayList<>(); // Initialise la liste des quiz
    }

    public static Gestionnaire obtenirGestionnaire() {
        // Implémente le patron Singleton pour garantir une seule instance du gestionnaire
        if (uniqueGestionnaire == null) {
            uniqueGestionnaire = new Gestionnaire();
        }
        return uniqueGestionnaire;
    }

    public void ajouterEnseignant(Enseignant enseignant) {
        enseignants.add(enseignant); // Ajoute un enseignant à la liste
    }

    public void ajouterEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant); // Ajoute un étudiant à la liste
    }

    public void ajouterQuiz(Quiz quiz) {
        quizzes.add(quiz); // Ajoute un quiz à la liste
    }

    public void supprimerQuiz(Quiz quiz) {
        quizzes.remove(quiz); // Supprime un quiz de la liste
    }

    // Getters pour enseignants, etudiants, et quizzes 
    public ArrayList<Enseignant> getEnseignants() {
        return enseignants; // Retourne la liste des enseignants
    }

    public ArrayList<Etudiant> getEtudiants() {
        return etudiants; // Retourne la liste des étudiants
    }

    public ArrayList<Quiz> getQuizzes() {
        return quizzes; // Retourne la liste des quiz
    }
}