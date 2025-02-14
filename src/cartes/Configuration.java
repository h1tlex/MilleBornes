package cartes;

// private class?
public class Configuration extends Carte {
	
	public int nbExemplaires;
	public Carte carte;
	public String name;
	
	public Configuration(Carte carte, int nbExemplaires, String name) {
		super(name);
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
