package cartes;

import java.util.Iterator;

public class JeuDeCartes {
	
	private Configuration configuration;
	private Carte carte;
	private static final int typeDeCartes = 19;

	public void afficherJeuDeCartes() {		
		System.out.println("JEU:\n");
		for (int i = 0; i < typeDeCartes; i++) {
			System.out.println(configuration.getNbExemplaires() + " " + configuration.getCarte() + "\n");			
		}
	}
	
	public Carte[][] donnerCartes() { // Not sure about this
		Carte[][] cartes = new Carte[typeDeCartes][configuration.getNbExemplaires()];
		for (int i = 0; i < typeDeCartes; i++) {
			for (int j = 0; j < configuration.getNbExemplaires(); j++) {
				cartes[i][j] = carte;
			}			
		}
		return cartes;
	}
}
