package cartes;

public class JeuDeCartes {
	
	private Configuration configuration;
	private static final int typeDeCartes = 19;
	private static final int maxCartes = 110;
	
	 public JeuDeCartes() {
	        this.configuration = new Configuration(new Carte() {}, 5);  // Example values
	  }
	

	public void afficherJeuDeCartes() {		
		System.out.println("JEU:\n");
		for (int i = 0; i < typeDeCartes; i++) {
			System.out.println(configuration.getNbExemplaires() + " " + configuration.getCarte() + "\n");			
		}
	}
	
	public Carte[] donnerCartes() {
		int index = 0;
		Carte[] cartes = new Carte[maxCartes];
		
		for (int i = 0; i < typeDeCartes; i++) {
			for (int j = 0; j < configuration.getNbExemplaires(); j++) {
				cartes[index] = configuration.getCarte();
				index++;
			}			
		}
		return cartes;
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
