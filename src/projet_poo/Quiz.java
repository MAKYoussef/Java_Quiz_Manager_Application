// Quiz.java
package projet_poo;

import java.util.ArrayList;

public class Quiz {
    private String theme; // Thème du quiz (ex: "POO", "BD", etc.)
    private String auteur; // Auteur du quiz
    private ArrayList<Question> questions; // Liste des questions du quiz

    public Quiz(String theme, String auteur) {
        this.theme = theme; // Initialise le thème du quiz
        this.auteur = auteur; // Initialise l'auteur du quiz
        this.questions = new ArrayList<>(); // Initialise la liste des questions
    }

    public void ajouterQuestion(Question question) {
        questions.add(question); // Ajoute une question à la liste des questions
    }

    public void supprimerQuestion(int numeroQuestion) {
        // Supprime la question avec le numéro spécifié
        for (int i = 0; i < questions.size(); i++) {
            if (questions.get(i).getNumero() == numeroQuestion) {
                questions.remove(i);
                break; // Sort de la boucle après avoir supprimé la question
            }
        }
    }

    public ArrayList<Question> getQuestions() {
        return questions; // Retourne la liste des questions
    }

    public String getTheme() {
        return theme; // Retourne le thème du quiz
    }

    public void setTheme(String theme) {
        this.theme = theme; // Définit le thème du quiz
    }

    public String getAuteur() {
        return auteur; // Retourne l'auteur du quiz
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur; // Définit l'auteur du quiz
    }


    public int calculerScore(ArrayList<Integer> reponsesEtudiant) {
        // Calcule le score de l'étudiant en fonction de ses réponses
        int nbQuestions = questions.size(); // Nombre total de questions dans le quiz
        if (nbQuestions == 0) {
            return 0; // Retourne 0 si le quiz n'a pas de questions
        }

        int score = 0; // Initialise le score à 0
        int reponseIndex = 0; // Indice pour suivre les réponses de l'étudiant dans la liste

        // Parcours chaque question du quiz
        for (int i = 0; i < nbQuestions; i++) {
            Question question = questions.get(i); // Obtient la question courante
            int nbOptions = question.getOptions().size(); // Nombre d'options pour la question courante
            boolean questionCorrecte = true; // Indicateur pour savoir si la question est correctement répondue

            // Parcours chaque option de la question
            for (int j = 0; j < nbOptions; j++) {
                int indexReponseEtudiant = reponseIndex + j; // Calcule l'indice de la réponse de l'étudiant

                // Vérifie si l'étudiant a répondu à cette option
                if (indexReponseEtudiant < reponsesEtudiant.size()) {
                    int reponseEtudiantIndex = reponsesEtudiant.get(indexReponseEtudiant); // Obtient la réponse de l'étudiant
                    Option option = question.getOptions().get(j); // Obtient l'option courante

                    // Vérifie si la réponse de l'étudiant correspond à la validité de l'option
                    if (option.isValide() != (reponseEtudiantIndex == j)) {
                        questionCorrecte = false; // Marque la question comme incorrecte
                        break; // Sort de la boucle des options car la question est déjà incorrecte
                    }
                } else {
                    // L'étudiant n'a pas répondu à cette option, donc la question est incorrecte
                    questionCorrecte = false;
                    break; // Sort de la boucle des options
                }
            }

            if (questionCorrecte) {
                score++; // Incrémente le score si la question est correctement répondue
            }

            reponseIndex += nbOptions; // Met à jour l'indice pour la prochaine question
        }

        return score; // Retourne le score final
    }
    
    public String toString() {
        // Retourne une représentation textuelle du quiz (thème et auteur)
        return "Quiz: " + getTheme() + " (Créé par: " + getAuteur() + ")";
    }
}