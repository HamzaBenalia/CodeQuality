package com.exercices.gestionzoo;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente un zoo avec une liste d'animaux.
 */
public class Zoo {

    private String nom;
    private List<Animal> animaux;

    /**
     * Constructeur pour initialiser un zoo avec un nom.
     *
     * @param nom Le nom du zoo.
     */
    public Zoo(String nom) {
        this.nom = nom;
        this.animaux = new ArrayList<>();
    }

    /**
     * Ajoute un animal au zoo.
     *
     * @param animal L'animal à ajouter.
     */
    public void ajouterAnimal(Animal animal) {
        if (animal == null) {
            throw new IllegalArgumentException("L'animal ne peut pas être null.");
        }
        animaux.add(animal);
    }

    /**
     * Affiche la liste des animaux du zoo.
     */
    public void afficherListeAnimaux() {
        if (animaux.isEmpty()) {
            System.out.println("Aucun animal dans le zoo.");
            return;
        }
        animaux.forEach(animal -> System.out.println(animal));
    }

    /**
     * Retourne le nombre d'animaux dans le zoo.
     *
     * @return Le nombre d'animaux.
     */
    public int taille() {
        return animaux.size();
    }

    /**
     * Getter pour le nom du zoo.
     *
     * @return Le nom du zoo.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter pour le nom du zoo.
     *
     * @param nom Le nom à définir.
     */
    public void setNom(String nom) {
        if (nom == null || nom.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom du zoo ne peut pas être null ou vide.");
        }
        this.nom = nom;
    }
}
