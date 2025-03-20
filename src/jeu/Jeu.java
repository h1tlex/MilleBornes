package jeu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cartes.Carte;
import cartes.JeuDeCartes;
import utils.GestionCartes;

public class Jeu {
	
	private Sabot sabot;
	
	public Jeu() {
		JeuDeCartes jeuDeCartes = new JeuDeCartes();
        // Récupérer le tableau de cartes depuis JeuDeCartes
        Carte[] cartes = jeuDeCartes.donnerCartes();

        // Transformer le tableau en liste
        List<Carte> listeCartes = new ArrayList<>();
        Collections.addAll(listeCartes, cartes);

        // Mélanger les cartes
        GestionCartes.melanger(listeCartes);

        // Créer le sabot avec le tableau des cartes mélangées
        this.sabot = new Sabot(listeCartes.toArray(new Carte[0]));
    }
	
	public Sabot getSabot() {
	    return this.sabot;
	}
	


}
