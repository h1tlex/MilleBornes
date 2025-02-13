package cartes;

public abstract class Carte extends Configuration {
	
	private Carte carte;
	private int nbExemplaires;
	
	public Carte(Carte carte, int nbExemplaires) {
		super(carte, nbExemplaires);
	}
	

	
}