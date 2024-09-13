package com.exercices.banque;

/**
 * Interface représentant un compte bancaire.
 */
public interface CompteBancaire {

    /**
     * Ajoute un montant au solde du compte.
     *
     * @param montant Le montant à ajouter.
     */
    void ajouterMontant(double montant);

    /**
     * Débite un montant du solde du compte.
     *
     * @param montant Le montant à débiter.
     */
    void debiterMontant(double montant);

    /**
     * Applique la rémunération annuelle.
     */
    void appliquerRemuAnnuelle();

    /**
     * Retourne le solde du compte.
     *
     * @return Le solde du compte.
     */
    double getSolde();

    /**
     * Définit le solde du compte.
     *
     * @param solde Le solde à définir.
     */
    void setSolde(double solde);

    /**
     * Retourne le découvert autorisé.
     *
     * @return Le découvert autorisé.
     */
    double getDecouvert();

    /**
     * Définit le découvert autorisé.
     *
     * @param decouvert Le découvert à définir.
     */
    void setDecouvert(double decouvert);

    /**
     * Retourne le taux de rémunération.
     *
     * @return Le taux de rémunération.
     */
    double getTauxRemuneration();

    /**
     * Définit le taux de rémunération.
     *
     * @param tauxRemuneration Le taux de rémunération à définir.
     */
    void setTauxRemuneration(double tauxRemuneration);

    /**
     * Retourne le type du compte.
     *
     * @return Le type du compte.
     */
    String getType();

    /**
     * Définit le type du compte.
     *
     * @param type Le type du compte à définir.
     */
    void setType(String type);
}
