package com.exercices.stock;

/**
 * Représente un article avec un nom et un poids.
 */
public class Item {

    private String nom;
    private int poids;

    /**
     * Constructeur pour créer un article avec un nom et un poids.
     *
     * @param nom   Le nom de l'article.
     * @param poids Le poids de l'article.
     */
    public Item(String nom, int poids) {
        if (nom == null || nom.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom ne peut pas être null ou vide.");
        }
        if (poids < 0) {
            throw new IllegalArgumentException("Le poids ne peut pas être négatif.");
        }

        this.nom = nom;
        this.poids = poids;
    }

    /**
     * Getter pour l'attribut nom.
     *
     * @return Le nom de l'article.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter pour l'attribut nom.
     *
     * @param nom Le nom à définir.
     */
    public void setNom(String nom) {
        if (nom == null || nom.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom ne peut pas être null ou vide.");
        }
        this.nom = nom;
    }

    /**
     * Getter pour l'attribut poids.
     *
     * @return Le poids de l'article.
     */
    public int getPoids() {
        return poids;
    }

    /**
     * Setter pour l'attribut poids.
     *
     * @param poids Le poids à définir.
     */
    public void setPoids(int poids) {
        if (poids < 0) {
            throw new IllegalArgumentException("Le poids ne peut pas être négatif.");
        }
        this.poids = poids;
    }
}
