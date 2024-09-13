package com.exercices.banque;

/**
 * Représente un compte courant.
 */
public class CompteCourant implements CompteBancaire {

    private double solde;
    private double decouvert;

    public CompteCourant(double solde, double decouvert) {
        this.solde = solde;
        this.decouvert = decouvert;
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
        if (solde - montant < -decouvert) {
            throw new IllegalArgumentException("Montant dépasse le découvert autorisé.");
        }
        solde -= montant;
    }

    @Override
    public void appliquerRemuAnnuelle() {
        // Pas de rémunération annuelle pour les comptes courants
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
        return decouvert;
    }

    @Override
    public void setDecouvert(double decouvert) {
        if (decouvert < 0) {
            throw new IllegalArgumentException("Le découvert ne peut pas être négatif.");
        }
        this.decouvert = decouvert;
    }

    @Override
    public double getTauxRemuneration() {
        return 0; // Pas de taux de rémunération pour les comptes courants
    }

    @Override
    public void setTauxRemuneration(double tauxRemuneration) {
        // Pas de taux de rémunération pour les comptes courants
    }

    @Override
    public String getType() {
        return "CC";
    }

    @Override
    public void setType(String type) {
        // Pas besoin de changer le type pour les comptes courants
    }
}
