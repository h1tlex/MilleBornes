package cartes;

// private class?
public class Configuration extends JeuDeCartes {
	
	public int nbExemplaires;
	public Carte carte;

	private Configuration(Carte carte, int nbExmplaires) {
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
