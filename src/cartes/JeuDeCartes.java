package cartes;

import java.util.Iterator;

public class JeuDeCartes {
	
	private Configuration configuration;
	private static final int typeDeCartes = 19;
	private static final int maxCartes = 110;


	public void afficherJeuDeCartes() {		
		System.out.println("JEU:\n");
		for (int i = 0; i < typeDeCartes; i++) {
			System.out.println(configuration.getNbExemplaires() + " " + configuration.getCarte() + "\n");			
		}
	}
	
	public Carte[] donnerCartes() { // Not sure about this
		int index = 0;
		Carte[] cartes = new Carte[maxCartes];
		
		for (int i = 0; i < typeDeCartes; i++) {
			for (int j = 0; j < configuration.getNbExemplaires(); j++) {
				cartes[index] = configuration.getCarte();
				index++;
			}			
		}
		return cartes;
	}
}
