package cartes;

public class Botte extends Probleme {
	
	private String nom;

	public Botte(String nom, Type type) {
		super(type);
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}
	
	@Override
	public String toString() {
		return "Carte Botte: " + type.getBotte();
	}

}
