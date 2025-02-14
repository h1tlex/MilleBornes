package testsFonctionnels;

import cartes.Carte;
import cartes.Configuration;
import cartes.JeuDeCartes;
import cartes.Probleme;

public class testJeuDeCartes {
	

	public void main(String[] args) {
		Carte carte = null;
		Configuration config = new Configuration(carte,5);
		config.	getCarte();
		
		JeuDeCartes jeu = new JeuDeCartes();
		
		jeu.afficherJeuDeCartes();
		jeu.donnerCartes();
	}

}
