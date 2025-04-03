package jeu;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import cartes.Carte;

public class Joueur {

	private String nom;
	private ZoneDeJeu zoneDeJeu;
	private MainJoueur mainJoueur;
	
	public Joueur(String nom) {
		this.nom = nom;
		this.zoneDeJeu = new ZoneDeJeu();
		this.mainJoueur = new MainJoueur();
	}
	
	public String getNom() {
		return nom;
	}
	
	public ZoneDeJeu getZoneDeJeu() {
		return zoneDeJeu;
	}
	
	public MainJoueur getMainJoueur() {
		return mainJoueur;
	}
	
	public void donner(Carte carte) {
		mainJoueur.prendre(carte);
	}
	
	public Carte prendreCarte(Sabot sabot) {
		if (sabot == null || sabot.estVide()) {
			return null;
		}
		
		Carte carte = sabot.piocher();
		mainJoueur.prendre(carte);
		return carte;
	}
	
	public void deposer(Carte carte) {
        zoneDeJeu.deposer(carte); // Appelle la méthode deposer de ZoneDeJeu
    }
	
	public int donnerKmParcourus() {
        return zoneDeJeu.donnerKmParcourus();
    }
	
	// Players are identical if they have the same name
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Same reference
        
        if (o == null || getClass() != o.getClass()) return false; // Diff reference
        
        Joueur joueur = (Joueur) o;           // Typecast
        return Objects.equals(nom, joueur.nom); // Compare names
    }
	
	@Override
	public String toString() {
		return "Joueur : " + nom;
	}
	
 

}
