package jeu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import cartes.*;

public class ZoneDeJeu {
	
    private List<Limite> pileLimites;
    private List<Limite> pileFinLimites;
    private List<Bataille> pileBataille;
    private Collection<Borne> collectionBorne;
	
	public ZoneDeJeu() {
		this.pileBataille = new ArrayList<>();
		this.pileLimites = new ArrayList<>();
		this.pileFinLimites = new ArrayList<>();
	}
	
	public void addCarteLimite(Limite carte){
		pileLimites.add(carte);
	}
	
	public void addCarteFinLimite(Limite carte){
		pileFinLimites.add(carte);
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
		return stack.get(stack.size());
	}
	
	public List<? extends Carte> popCartePile(List<? extends Carte> stack){
		if (stack.isEmpty()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		stack.remove(stack.size());
		return stack;
	} 
	
}
