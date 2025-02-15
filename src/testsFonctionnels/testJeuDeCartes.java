package testsFonctionnels;

import cartes.Carte;
import cartes.Configuration;
import cartes.JeuDeCartes;
import cartes.Probleme;

public class testJeuDeCartes {
	

	public void main(String[] args) {
		
		JeuDeCartes jeu = new JeuDeCartes();
		
		jeu.afficherJeuDeCartes();
		jeu.donnerCartes();
	}

}
