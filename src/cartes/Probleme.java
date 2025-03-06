package cartes;

public abstract class Probleme extends Carte {

	public Probleme(Type type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return type.toString();
	}

}
