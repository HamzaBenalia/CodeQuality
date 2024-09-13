package com.exercices.banque;

/**
 * Représente un livret A.
 */
public class LivretA implements CompteBancaire {

    private double solde;
    private double tauxRemuneration;

    public LivretA(double solde, double tauxRemuneration) {
        this.solde = solde;
        this.tauxRemuneration = tauxRemuneration;
    }

    @Override
    public void ajouterMontant(double montant) {
        if (montant < 0) {
            throw new IllegalArgumentException("Le montant à ajouter ne peut pas être négatif.");
        }
        this.solde += montant;
    }

    @Override
    public void debiterMontant(double montant) {
        if (montant < 0) {
            throw new IllegalArgumentException("Le montant à débiter ne peut pas être négatif.");
        }
        if (solde - montant < 0) {
            throw new IllegalArgumentException("Le solde ne peut pas devenir négatif.");
        }
        solde -= montant;
    }

    @Override
    public void appliquerRemuAnnuelle() {
        solde += solde * tauxRemuneration / 100;
    }

    @Override
    public double getSolde() {
        return solde;
    }

    @Override
    public void setSolde(double solde) {
        if (solde < 0) {
            throw new IllegalArgumentException("Le solde ne peut pas être négatif.");
        }
        this.solde = solde;
    }

    @Override
    public double getDecouvert() {
        return 0; // Pas de découvert pour les livrets A
    }

    @Override
    public void setDecouvert(double decouvert) {
        // Pas de découvert pour les livrets A
    }

    @Override
    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    @Override
    public void setTauxRemuneration(double tauxRemuneration) {
        if (tauxRemuneration < 0) {
            throw new IllegalArgumentException("Le taux de rémunération ne peut pas être négatif.");
        }
        this.tauxRemuneration = tauxRemuneration;
    }

    @Override
    public String getType() {
        return "LA";
    }

    @Override
    public void setType(String type) {
        // Pas besoin de changer le type pour les livrets A
    }
}
