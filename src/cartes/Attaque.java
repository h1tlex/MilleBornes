package cartes;

public class Attaque extends Bataille {
	
	private String nom;
	
	public Attaque(String nom, Type type) {
		super(type);
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

}
