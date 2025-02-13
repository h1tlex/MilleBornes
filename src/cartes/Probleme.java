package cartes;

public abstract class Probleme extends Carte {
	
	private Carte carte;
	private int nbExemplaires;
	Type type;

	public Probleme(Carte carte, int nbExemplaires, Type type) {
		super(carte, nbExemplaires);
		this.type = type;
	}
	
	public Type getType() {
		return type;
	}
	
	@Override
	public String toString() {
		return carte.toString();
	}

}
