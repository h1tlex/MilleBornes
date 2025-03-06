package testsFonctionnels;

import cartes.*;
import jeu.Sabot;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class TestSabot {

	public static void main(String[] args) {
		// Créer un tableau de cartes pour initialiser le sabot
        Carte[] cartes = {
            new Borne(25),
            new Borne(50), 
            new Attaque(Type.FEU), 
            new Parade(Type.ESSENCE),
            new Botte(Type.CREVAISON)
        };
        
		Sabot sabot = new Sabot(cartes);
        Iterator<Carte> it = sabot.iterator();
		
		/*
		try {
			while(!sabot.estVide()) {
				Carte carte = sabot.piocher();
				System.out.println("je pioche " + carte);
			}
		} catch (NoSuchElementException e) {
			System.out.println("Le sabot est vide");
		}
		*/
		
		
	    /*
        SabotIterator it = (SabotIterator)sabot.iterator();
        
        while(it.hasNext()) {
        	Carte carte = it.next();
        	System.out.println("Je pioche " + carte);
        	it.remove();
        }
        */
		
		
        
        try {
        	//Carte premierCarte = sabot.piocher(); // piocher avant la boucle
        	//System.out.println("Premier carte : " + premierCarte);
        	
        	while(it.hasNext()) {
        		Carte carte = it.next();
        		System.out.println("Je pioche " + carte);
        		//sabot.ajouterCarte(new Botte(Type.ACCIDENT)); // Tentative d'ajouter As du Volant
        		it.remove();
        	}
        } catch(IllegalStateException e) {
        	System.out.println("Erreur : " + e.getMessage());
        } catch(ConcurrentModificationException e) {
        	System.out.println("Erreur modification concurrente: " + e.getMessage());
        } catch(NoSuchElementException e) {
        	System.out.println("Erreur : Plus de cartes à piocher.");
        }

	}

}
