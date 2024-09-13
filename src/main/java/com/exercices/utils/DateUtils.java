package com.exercices.utils;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Utilitaires pour le formatage des dates.
 */
public class DateUtils {

    private static final String DEFAULT_PATTERN = "dd/MM/yyyy HH:mm:ss";

    /**
     * Formate une date en utilisant le motif spécifié.
     *
     * @param pattern Le motif de formatage.
     * @param date La date à formater.
     * @return La date formatée en tant que chaîne.
     */
    public static String format(String pattern, Date date) {
        if (pattern == null || date == null) {
            throw new IllegalArgumentException("Pattern and date cannot be null.");
        }

        SimpleDateFormat formateur = new SimpleDateFormat(pattern);
        return formateur.format(date);
    }

    /**
     * Formate une date en utilisant le motif de formatage par défaut.
     *
     * @param date La date à formater.
     * @return La date formatée en tant que chaîne.
     */
    public static String formatDefaut(Date date) {
        if (date == null) {
            throw new IllegalArgumentException("Date cannot be null.");
        }

        SimpleDateFormat formateur = new SimpleDateFormat(DEFAULT_PATTERN);
        return formateur.format(date);
    }
}
