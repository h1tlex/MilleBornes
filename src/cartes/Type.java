package cartes;

public enum Type {
	FEU("Feu rouge", "Feu vert", "Prioritaire"),
	ESSENCE("Panne d'essence", "Réservoir plein", "Citerne d'essence"),
	CREVAISON("Crevaison", "Roue de secours", "Increvable"),
	ACCIDENT("Accident", "Répartitions", "As du volant"),
	LIMITE("Limite de Vitesse", "Fin de Limite", null), // pas de botte
	VEHICULE_PRIORITAIRE(null, null, "Véhicule Prioritaire"); // Botte spécifique

	
	
	private String attaque;
	private String parade;
	private String botte;
	
	private Type(String attaque, String parade, String botte) {
		this.attaque = attaque;
		this.parade = parade;
		this.botte = botte;
	}
	
	public String getAttaque() {
		return attaque;
	}
	
	public String getParade() {
		return parade;
	}
	
	public String getBotte() {
		return botte;
	}
	

}
