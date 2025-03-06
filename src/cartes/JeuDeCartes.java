package cartes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JeuDeCartes {
	
	private Configuration configuration;
	private static final int typeDeCartes = 19;
	private static final int maxCartes = 110;
	private Configuration[] cartesInGame;

	
	 public JeuDeCartes() {
		 	cartesInGame = new Configuration[] {
		 			new Configuration(new Borne(25),10),
		 			new Configuration(new Borne(50),10),
		 			new Configuration(new Borne(75),10),
		 			new Configuration(new Borne(100),12),
		 			new Configuration(new Borne(200),4),
		 			new Configuration(new Parade(Type.FEU),14),
		 			new Configuration(new FinLimite(Type.LIMITE),6),
		 			new Configuration(new Parade(Type.ESSENCE),6),
	                new Configuration(new Parade(Type.CREVAISON), 6), // Roue de secours
	                new Configuration(new Parade(Type.ACCIDENT), 6), // Réparation
	                new Configuration(new Attaque(Type.FEU), 5), // Feu Rouge
	                new Configuration(new Attaque(Type.LIMITE), 4), // Limite 50
	                new Configuration(new Attaque(Type.ESSENCE), 3), // Panne d'essence
	                new Configuration(new Attaque(Type.CREVAISON), 3), // Crevaison
	                new Configuration(new Attaque(Type.ACCIDENT), 3), // Accident
	                new Configuration(new Botte(Type.ESSENCE), 1), // Citerne
	                new Configuration(new Botte(Type.CREVAISON), 1), // Increvable
	                new Configuration(new Botte(Type.ACCIDENT), 1), // As du Volant
	                new Configuration(new Botte(Type.VEHICULE_PRIORITAIRE), 1) // Véhicule Prioritaire
	       };
	  }
	 

	public String afficherJeuDeCartes() {		
		StringBuilder sb = new StringBuilder();
        sb.append("JEU :\n");
        for (Configuration config : cartesInGame) {
            sb.append(config.getNbExemplaires())
              .append(" ")
              .append(config.getCarte())
              .append("\n");
        }
        return sb.toString();
	}
	
	public Carte[] donnerCartes() {
		List<Carte> toutesLesCartes = new ArrayList<>();
		
        // Parcourir chaque configuration
		for (Configuration config : cartesInGame) {
            // Répliquer chaque carte selon son nombre d'exemplaires
			for (int j = 0; j < config.getNbExemplaires(); j++) {
				toutesLesCartes.add(config.getCarte());
			}			
		}
		
		// Convertir la liste en tableau et la renvoyer
		return toutesLesCartes.toArray(new Carte[0]);
	}
	
	public boolean checkCount() {
		Carte[] toutesLesCartes = donnerCartes();
		for (Configuration config : cartesInGame) {
			int count = 0;
			for (Carte carte : toutesLesCartes) {
				if (carte.equals(config.getCarte())) {
					count++;
				}
			}
			if (count != config.nbExemplaires) {
                System.out.println("Erreur : " + config.getCarte() + " attendue " + config.nbExemplaires + " fois, trouvée " + count + " fois.");
				return false;
			}
		}
		return true;
		
	}
	
	private static class Configuration extends Carte {
		
		public int nbExemplaires;
		public Carte carte;
		
		public Configuration(Carte carte, int nbExemplaires) {
			this.carte = carte;
			this.nbExemplaires = nbExemplaires;
		}
		
		public Carte getCarte() {
			return carte; 
		}
		
		public int getNbExemplaires() {
			return nbExemplaires;
		}

	}

}
