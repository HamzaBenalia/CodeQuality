package com.exercices.stock;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente une caisse contenant des articles.
 */
public class Caisse {

    private String nom;
    private List<Item> items;

    /**
     * Constructeur pour initialiser une caisse avec un nom.
     *
     * @param nom Le nom de la caisse.
     */
    public Caisse(String nom) {
        this.nom = nom;
        this.items = new ArrayList<>();
    }

    /**
     * Getter pour l'attribut nom.
     *
     * @return Le nom de la caisse.
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
        this.nom = nom;
    }

    /**
     * Getter pour l'attribut items.
     *
     * @return La liste des articles dans la caisse.
     */
    public List<Item> getItems() {
        return new ArrayList<>(items);  // Retourne une copie de la liste pour éviter les modifications externes
    }

    /**
     * Ajoute un article à la caisse.
     *
     * @param item L'article à ajouter.
     */
    public void addItem(Item item) {
        if (item != null) {
            this.items.add(item);
        }
    }

    /**
     * Retire un article de la caisse.
     *
     * @param item L'article à retirer.
     * @return true si l'article a été retiré, false sinon.
     */
    public boolean removeItem(Item item) {
        return this.items.remove(item);
    }

    /**
     * Retourne le nombre d'articles dans la caisse.
     *
     * @return Le nombre d'articles.
     */
    public int getNombreItems() {
        return items.size();
    }
}

