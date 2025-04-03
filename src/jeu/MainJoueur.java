package jeu;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import cartes.Carte;

public class MainJoueur implements Iterable<Carte>{
	
	private List<Carte> main;

	public MainJoueur() {
		this.main = new ArrayList<>();
	}
	
	public List<Carte> getMain() {
	    return main;
	}
	
	public void prendre(Carte carte) {
		main.add(carte);
	}
	
	public void jouer(Carte carte) {
		assert main.contains(carte) : "Cette carte n'existe pas dans votre main!";
		main.remove(carte);
	}

	@Override
	public Iterator<Carte> iterator() {
		return main.iterator();
	}
	
	@Override
	public String toString() {
		return "Main du joueur : " + main;
	}

}
