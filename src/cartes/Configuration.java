package cartes;

// private class?
public class Configuration extends JeuDeCartes {
	
	public int nbExemplaires;
	public Carte carte;

	public Configuration(Carte carte, int nbExemplaires) {
		this.carte = carte;
		this.nbExemplaires = nbExemplaires;
	}
	
	public Carte getCarte() {
		return carte; 
	}
	
	public int getNbExemplaires() {
		return nbExemplaires;
	}

}
