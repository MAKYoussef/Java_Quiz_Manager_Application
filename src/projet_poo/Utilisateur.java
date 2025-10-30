// Utilisateur.java
package projet_poo;

public class Utilisateur {
    private String nom; // Nom de l'utilisateur
    private String prenom; // Prénom de l'utilisateur
    private String identifiant; // Identifiant unique de l'utilisateur

    public Utilisateur(String nom, String prenom, String identifiant) {
        this.nom = nom; // Initialise le nom de l'utilisateur
        this.prenom = prenom; // Initialise le prénom de l'utilisateur
        this.identifiant = identifiant; // Initialise l'identifiant de l'utilisateur
    }

    public String getNom() {
        return nom; // Retourne le nom de l'utilisateur
    }

    public String getPrenom() {
        return prenom; // Retourne le prénom de l'utilisateur
    }

    public String getIdentifiant() {
        return identifiant; // Retourne l'identifiant de l'utilisateur
    }

    public String getNomComplet() {
        // Retourne le nom complet de l'utilisateur (prénom + nom)
        return prenom + " " + nom;
    }
}