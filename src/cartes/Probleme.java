package cartes;

public abstract class Probleme extends Carte {
	
	private Carte carte;
	private int nbExemplaires;
	Type type;

	public Probleme(Type type) {
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
