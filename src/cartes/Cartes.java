package cartes;

public interface Cartes {
	Carte PRIORITAIRE = new Botte("Prioritaire", Type.FEU);
	Carte FEU_ROUGE = new Attaque("Feu rouge", Type.FEU);
	Carte FEU_VERT = new Parade("Feu vert", Type.FEU);
}
