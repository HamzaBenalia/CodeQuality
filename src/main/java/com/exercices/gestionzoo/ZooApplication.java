package com.exercices.gestionzoo;

/**
 * Application principale pour démontrer les fonctionnalités du Zoo.
 */
public class ZooApplication {

    public static void main(String[] args) {
        // Création d'une instance de Zoo avec un nom
        Zoo zoo = new Zoo("Thoiry");

        // Ajout d'animaux au zoo
        ajouterAnimauxAuZoo(zoo);

        // Affichage de la liste des animaux
        zoo.afficherListeAnimaux();

        // Affichage de la taille du zoo
        System.out.println("Nombre total d'animaux : " + zoo.taille());
    }

    /**
     * Ajoute une liste d'animaux au zoo spécifié.
     *
     * @param zoo Le zoo auquel ajouter les animaux.
     */
    private static void ajouterAnimauxAuZoo(Zoo zoo) {
        zoo.ajouterAnimal(new Animal("Gazelle", "MAMMIFERE", "HERBIVORE"));
        zoo.ajouterAnimal(new Animal("Zèbre", "MAMMIFERE", "HERBIVORE"));
        zoo.ajouterAnimal(new Animal("Lion", "MAMMIFERE", "CARNIVORE"));
        zoo.ajouterAnimal(new Animal("Panthère", "MAMMIFERE", "CARNIVORE"));
        zoo.ajouterAnimal(new Animal("Requin blanc", "POISSON", "CARNIVORE"));
        zoo.ajouterAnimal(new Animal("Truite dorée", "POISSON", "HERBIVORE"));
        zoo.ajouterAnimal(new Animal("Boa constrictor", "SERPENT", "CARNIVORE"));
        zoo.ajouterAnimal(new Animal("Python", "SERPENT", "CARNIVORE"));
    }
}
