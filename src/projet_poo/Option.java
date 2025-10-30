// Option.java
package projet_poo;

public class Option {
    private String texte; // Texte de l'option
    private boolean valide; // Indique si l'option est une réponse correcte ou non

    public Option(String texte, boolean valide) {
        this.texte = texte; // Initialise le texte de l'option
        this.valide = valide; // Initialise la validité de l'option
    }

    public String getTexte() {
        return texte; // Retourne le texte de l'option
    }

    public boolean isValide() {
        return valide; // Retourne la validité de l'option
    }

    public String toString() {
        // Retourne une représentation textuelle de l'option, incluant son texte et sa validité
        return texte + " (" + (valide ? "Valide" : "Non Valide") + ")";
    }
}