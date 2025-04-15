package jeu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import cartes.*;

public class ZoneDeJeu {
	
    private List<Carte> pileLimites;
    private List<Carte> pileBataille;
    private Collection<Carte> collectionBorne;
	
	public ZoneDeJeu() {
		this.pileBataille = new ArrayList<>();
		this.pileLimites = new ArrayList<>();
		this.collectionBorne = new ArrayList<>();
	}
	
	public void addCarteLimite(Limite carte){
		pileLimites.add(carte);
	}

	public void addCarteBattaille(Bataille carte){
		pileBataille.add(carte);
	}
	
	public void addCarteBorne(Borne carte) {
		collectionBorne.add(carte);
	}
	
	
	// used for all 3 types of stacks
	
	public Carte topCartePile(List<? extends Carte> stack) {
		if (stack.isEmpty()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return stack.get(stack.size()-1);
	}
	
	public List<? extends Carte> popCartePile(List<? extends Carte> stack){
		if (stack.isEmpty()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		stack.remove(stack.size()-1);
		return stack;
	} 
	
	
	public int donnerLimitationVitesse() {
		if (pileLimites.isEmpty()) {
			return 200;
		}
		
        Carte sommet = pileLimites.get(pileLimites.size() - 1);
        
        if (sommet instanceof FinLimite) {
			return 200; // Fin de limitation
		}
		return 50; // limite vitesse à 50
	}
	
	public int donnerKmParcourus() {
		int totalKm = 0;
		for (Carte carte : collectionBorne) {
			if(carte instanceof Borne) {
				Borne borne = (Borne) carte;
				totalKm += borne.getKm();
			}
		}
		return totalKm;
	}
	
	public void deposer(Carte carte) {
	    
        if (carte instanceof Borne) {
            collectionBorne.add(carte);
        } 
        else if (carte instanceof Limite) {
            pileLimites.add(carte);
        }
        else if (carte instanceof Bataille) {
            pileBataille.add(carte);
        }
	    
	}
	
	public boolean peutAvancer() {
		// Vérifie que la pile de bataille n'est pas vide
		    if (pileBataille.isEmpty()) {
		        return false;
		    }

		    // Récupère le sommet de la pile de bataille
		    Carte sommet = pileBataille.get(pileBataille.size() - 1);

		    // Vérifie si le sommet est un Feu Vert en utilisant la constante de l'interface Cartes
		    return sommet.equals(Cartes.FEU_VERT);
	}
	
	 public boolean estDepotFeuVertAutorise() {
	        // Vérifie que la pile de bataille est vide
		  if (pileBataille.isEmpty()) {
		        return true;
		    }

		    // Récupère le sommet de la pile de bataille
		    Carte sommet = pileBataille.get(pileBataille.size() - 1);

		    // Vérifie si le sommet est une Attaque ou une Parade qui n'est pas un Feu Vert
		    if (sommet instanceof Attaque || (sommet instanceof Parade && !sommet.equals(Cartes.FEU_VERT))) {
		        return true;
		    }

		    return false;
	    }
	 
	 public boolean estDepotBorneAutorise(Borne borne) {
		    // Vérifier si le joueur est bloqué (pile de bataille non vide et le sommet n'est pas un feu vert)
		    if (!peutAvancer()) {
		        return false;
		    }

		    // Vérifier que la vitesse de la borne ne dépasse pas la limite actuelle
		    if (borne.getKm() > donnerLimitationVitesse()) {
		        return false;
		    }

		    // Vérifier que la somme des bornes ne dépasse pas 1000 km
		    if (donnerKmParcourus() + borne.getKm() > 1000) {
		        return false;
		    }

		    return true;
		}
	 
	 public boolean estDepotLimiteAutorise(Limite limite) {
		    // Si c'est un début de limite, on vérifie si la pile est vide ou si son sommet est une fin de limite
		    if (limite instanceof DebutLimite) {
		        return pileLimites.isEmpty() || pileLimites.get(pileLimites.size() - 1) instanceof FinLimite;
		    }
		    
		    // Si c'est une fin de limite, on vérifie que le sommet de la pile est un début de limite
		    if (limite instanceof FinLimite) {
		        return !pileLimites.isEmpty() && pileLimites.get(pileLimites.size() - 1) instanceof DebutLimite;
		    }

		    return false;
		}
	 
	 public boolean estDepotBatailleAutorise(Bataille bataille) {
		  // Si c'est une attaque, on vérifie que le joueur n'est pas bloqué
		    if (bataille instanceof Attaque) {
		        return peutAvancer();
		    }

		    // Si c'est une parade
		    if (bataille instanceof Parade) {
		        // Cas 1 : Feu Vert
		        if (bataille.equals(Cartes.FEU_VERT)) {
		            // On peut déposer un Feu Vert si la pile de bataille est vide,
		            // ou si le sommet est un Feu Rouge ou une parade autre que Feu Vert
		            Carte sommet = pileBataille.isEmpty() ? null : pileBataille.get(pileBataille.size() - 1);
		            return pileBataille.isEmpty() || 
		                   (sommet instanceof Attaque && sommet.equals(Cartes.FEU_ROUGE)) ||
		                   (sommet instanceof Parade && !sommet.equals(Cartes.FEU_VERT));
		        }

		        // Cas 2 : Autre parade
		        // On peut déposer si la pile n'est pas vide et que son sommet est une attaque du même type
		        return !pileBataille.isEmpty() && pileBataille.get(pileBataille.size() - 1) instanceof Attaque &&
		        		pileBataille.get(pileBataille.size() - 1).getClass().equals(bataille.getClass());
		    }

		    return false;
		}
	 
	 public boolean estDepotAutorise(Carte carte) {
		    // Si la carte est une borne
		    if (carte instanceof Borne) {
		    	System.out.println("i am Borne !!!!!!!!!!!!!!!!!!!!!!!!!\n");
		        return estDepotBorneAutorise((Borne) carte);
		    }

		    // Si la carte est une limite
		    if (carte instanceof Limite) {
		    	System.out.println("i am limite !!!!!!!!!!!!!!!!!!!!!!!!!\n");
		        return estDepotLimiteAutorise((Limite) carte);
		    }

		    // Si la carte est une bataille
		    if (carte instanceof Bataille) {
		    	System.out.println("i am bataille !!!!!!!!!!!!!!!!!!!!!!!!!\n");
		        return estDepotBatailleAutorise((Bataille) carte);
		    }

		    // Par défaut, renvoie false si la carte ne correspond à aucun type attendu
		    return false;
		}
}
