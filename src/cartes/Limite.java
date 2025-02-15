package cartes;

public abstract class Limite extends Carte {

	public Limite (Type type) {
		super();
	}
	@Override
	public String toString() {
		return "Limite de type : "+ type;
	}
}
