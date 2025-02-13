package cartes;

public abstract class Probleme extends Carte {
	
	private static String name;
	Type type;

	public Probleme(Type type) {
		super(name);
		this.type = type;
	}
	
	public Type getType() {
		return type;
	}
	
	@Override
	public String toString() {
		return name;
	}

}
