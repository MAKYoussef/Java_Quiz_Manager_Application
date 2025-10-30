// Question.java
package projet_poo;

import java.util.ArrayList;

public class Question {
    private int numero; // Numéro de la question
    private String texte; // Texte de la question
    private ArrayList<Option> options; // Liste des options de la question

    public Question(int numero, String texte) {
        this.numero = numero; // Initialise le numéro de la question
        this.texte = texte; // Initialise le texte de la question
        this.options = new ArrayList<>(); // Initialise la liste des options
    }

    public void ajouterOption(Option option) {
        options.add(option); // Ajoute une option à la liste des options
    }

    public ArrayList<Option> getOptions() {
        return options; // Retourne la liste des options
    }

    public boolean isReponseValide(int indexOption) {
        // Vérifie si l'option à l'index donné est une réponse valide
        if (indexOption >= 0 && indexOption < options.size()) {
            return options.get(indexOption).isValide();
        }
        return false;
    }

    public String getTexte() {
        return texte; // Retourne le texte de la question
    }

    public int getNumero() {
        return numero; // Retourne le numéro de la question
    }

    public String toString() {
        // Retourne une représentation textuelle de la question, incluant son numéro et son texte
        return "Question " + numero + ": " + texte;
    }
}