package cartes;

import java.util.Iterator;

public class JeuDeCartes {
	
	private Configuration configuration;
	private int typeDeCartes = 19;
	private Carte carte;

	public void afficherJeuDeCartes() {		
		System.out.println("JEU:\n");
		for (int i = 0; i < typeDeCartes; i++) {
			System.out.println(carte.getNbExemplaires() + " " + carte.getCarte() + "\n");			
		}
	}
}
