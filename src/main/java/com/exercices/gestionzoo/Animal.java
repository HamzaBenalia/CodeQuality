package com.exercices.gestionzoo;

/**
 * Interface représentant un animal dans le zoo.
 */
public interface Animal {

    /**
     * Retourne le nom de l'animal.
     *
     * @return Le nom de l'animal.
     */
    String getNom();

    /**
     * Retourne le type de l'animal.
     *
     * @return Le type de l'animal.
     */
    String getType();

    /**
     * Retourne le comportement de l'animal.
     *
     * @return Le comportement de l'animal.
     */
    String getComportement();
}
