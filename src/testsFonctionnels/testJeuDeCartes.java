package testsFonctionnels;

import cartes.Carte;
import cartes.Configuration;
import cartes.JeuDeCartes;

public class testJeuDeCartes {
	

	public static void main(String[] args) {
		System.out.println("Hello, World!");
		JeuDeCartes jeu = new JeuDeCartes();
		
		jeu.afficherJeuDeCartes();
		Carte cartes[] = jeu.donnerCartes();
		
		for (int i = 0; i < cartes.length; i++) {
			System.out.println(cartes[i]);
		}
	}

}
