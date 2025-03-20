package jeu;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Joueur {

	private String nom;
	private ZoneDeJeu zoneDeJeu;
	
	public Joueur(String nom) {
		this.nom = nom;
		zoneDeJeu = new ZoneDeJeu();
	}
	
	public String getNom() {
		return nom;
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
