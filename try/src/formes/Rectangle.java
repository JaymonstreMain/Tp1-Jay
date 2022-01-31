package formes;

import exceptions.FormeException;

public class Rectangle {

    //Attributs constants (toujours publics)
    public static final int MIN_VAL = 1;
    public static final int MAX_VAL = 30;
    public static final String[] LES_COULEURS = {"rouge", "vert", "bleu", "jaune", "noir", "orange"};
    public static final String COULEUR_DEFAUT = "rouge";

    //Atributs (toujours privés)
    private int hauteur;
    private int largeur;
    private static String nom;
    private String couleur;

    //Constructeurs
    public Rectangle(int hauteur, int largeur) throws FormeException {
        if (validerHauteur(hauteur) && validerLargeur(largeur)) {
            setHauteur(hauteur);
            setLargeur(largeur);
        } else {
            throw new FormeException("erreur! Un paramètre est invalide!!!");
        }

        Rectangle.nom = "Rectangle";

        setCouleur(COULEUR_DEFAUT);
    }

    //Méthodes publiques
    public int calculerPerimetre() {
        return ((2 * this.hauteur) + (2 * this.largeur));
    }

    public int calculerSurface() {
        return (this.hauteur * this.largeur);
    }

    public boolean equals(Object pObjet) {
        Rectangle rectObjet = (Rectangle) pObjet;

        boolean estEgal;

        if (rectObjet.calculerSurface() == calculerSurface() && rectObjet.getCouleur().equals(getCouleur())) {
            estEgal = true;
        } else {
            estEgal = false;
        }

        return estEgal;
    }

    //Accesseurs
    public String getCouleur() {
        return this.couleur;
    }

    public int getHauteur() {
        return this.hauteur;
    }

    public int getLargeur() {
        return this.largeur;
    }

    public static String getNom() {
        return Rectangle.nom;
    }

    //Mutateurs
    public void setCouleur(String couleur) {
        if (validerCouleur(couleur)) {
            this.couleur = couleur;
        } else {
            this.couleur = COULEUR_DEFAUT;
        }
    }

    public void setHauteur(int hauteur) {
        if (validerHauteur(hauteur)) {
            this.hauteur = hauteur;
        }
    }

    public void setLargeur(int largeur) {
        if (validerLargeur(largeur)) {
            this.largeur = largeur;
        }
    }

    //Méthodes privées
    private static boolean validerCouleur(String couleur) {
        boolean estCouleurValide = false;

        for (int i = 0; i < LES_COULEURS.length; i++) {
            if (LES_COULEURS[i].equals(couleur.trim().toLowerCase())) {
                estCouleurValide = true;
                break;
            }
        }

        return estCouleurValide;
    }

    private static boolean validerHauteur(int hauteur) {
        boolean estHauteurValide;

        if (hauteur >= MIN_VAL && hauteur <= MAX_VAL) {
            estHauteurValide = true;
        } else {
            estHauteurValide = false;
        }

        return estHauteurValide;
    }

    private static boolean validerLargeur(int pLargeur) {
        boolean estLargeurValide;

        if (pLargeur >= MIN_VAL && pLargeur <= MAX_VAL) {
            estLargeurValide = true;
        } else {
            estLargeurValide = false;
        }

        return estLargeurValide;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "couleur=" + couleur +
                ", hauteur=" + hauteur +
                ", largeur='" + largeur + '\'' +
                '}';

    }
}

