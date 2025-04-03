package cartes;

public class Parade extends Bataille {
	
	private String nom;

	public Parade(String nom, Type type) {
		super(type);
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}

}
