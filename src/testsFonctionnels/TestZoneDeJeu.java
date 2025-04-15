package testsFonctionnels;

import cartes.*;
import jeu.Joueur;
import jeu.ZoneDeJeu;

public class TestZoneDeJeu {

	public static void main(String[] args) {
	        // Créer un nouveau joueur
        Joueur joueur = new Joueur("Alice");

        // Déposer des cartes de bornes
        System.out.println("Deposer carte 25 km");
        joueur.deposer(new Borne(25));

        System.out.println("Deposer carte 50 km");
        joueur.deposer(new Borne(50));

        System.out.println("Deposer carte 75 km");
        joueur.deposer(new Borne(75));

        // Calculer le total des bornes déposées
        int totalBornes = joueur.donnerKmParcourus();
        System.out.println("Total des bornes : " + totalBornes); // Doit afficher 150

        // Vérifier la limite de vitesse avec une pile vide (par défaut 200)
        System.out.println("Limite : " + joueur.getZoneDeJeu().donnerLimitationVitesse()); // Doit afficher 200

        // Déposer une carte Limite de vitesse (limite à 50 km/h)
        System.out.println("Deposer Limite de vitesse");
        joueur.deposer(new Limite(null));
        System.out.println("Limite : " + joueur.getZoneDeJeu().donnerLimitationVitesse()); // Doit afficher 50
 
        // Déposer une carte Fin de Limite de vitesse (retour à 200 km/h)
        System.out.println("Deposer Fin de limite de vitesse");
        joueur.deposer(new FinLimite(null));
        System.out.println("Limite : " + joueur.getZoneDeJeu().donnerLimitationVitesse()); // Doit afficher 200
		
        
		// TP3 PARTIE 3
		boolean depotOK = false;
		ZoneDeJeu zoneDeJeu = new ZoneDeJeu();
		// Feu rouge
		System.out.println("Deposer carte Feu rouge");
		depotOK = zoneDeJeu.estDepotAutorise(Cartes.FEU_ROUGE);
		System.out.println("d�p�t ok ? " + depotOK);
		if (depotOK) {
			zoneDeJeu.deposer(Cartes.FEU_ROUGE);
		}
		System.out.println("peut avancer ? " + zoneDeJeu.peutAvancer());
		// accident
		System.out.println("Deposer carte attaque - accident");
		depotOK = zoneDeJeu.estDepotAutorise(new Attaque(Type.ACCIDENT));
		System.out.println("d�p�t ok ? " + depotOK);
		if (depotOK) {
			zoneDeJeu.deposer(new Attaque(Type.ACCIDENT));
		}
		System.out.println("peut avancer ? " + zoneDeJeu.peutAvancer());
		// Feu vert
		System.out.println("Deposer carte Feu vert");
		depotOK = zoneDeJeu.estDepotAutorise(Cartes.FEU_VERT);
		System.out.println("d�p�t ok ? " + depotOK);
		if (depotOK) {
			zoneDeJeu.deposer(Cartes.FEU_VERT);
		}
		System.out.println("peut avancer ? " + zoneDeJeu.peutAvancer());
		// panne d'essence
		System.out.println("Deposer carte attaque - essence");
		depotOK = zoneDeJeu.estDepotAutorise(new Attaque(Type.ESSENCE));
		System.out.println("d�p�t ok ? " + depotOK);
		if (depotOK) {
			zoneDeJeu.deposer(new Attaque(Type.ESSENCE));
		}
		System.out.println("peut avancer ? " + zoneDeJeu.peutAvancer());
		// roue de secours
		System.out.println("Deposer carte parade - roue de secours");
		depotOK = zoneDeJeu.estDepotAutorise(new Parade(Type.CREVAISON));
		if (depotOK) {
			zoneDeJeu.deposer(new Parade(Type.CREVAISON));
		}
		System.out.println("d�p�t ok ? " + depotOK);
		System.out.println("peut avancer ? " + zoneDeJeu.peutAvancer());
		// bidon d'essence
		System.out.println("Deposer carte parade - essence");
		depotOK = zoneDeJeu.estDepotAutorise(new Parade(Type.ESSENCE));
		if (depotOK) {
			zoneDeJeu.deposer(new Parade(Type.ESSENCE));
		}
		System.out.println("d�p�t ok ? " + depotOK);
		System.out.println("peut avancer ? " + zoneDeJeu.peutAvancer());
		// Feu vert
		System.out.println("Deposer carte Feu vert");
		depotOK = zoneDeJeu.estDepotAutorise(Cartes.FEU_VERT);
		System.out.println("d�p�t ok ? " + depotOK);
		if (depotOK) {
			zoneDeJeu.deposer(Cartes.FEU_VERT);
		}
		System.out.println("peut avancer ? " + zoneDeJeu.peutAvancer());
		// D�pot 100 bornes
		System.out.println("Deposer carte borne - 100");
		depotOK = zoneDeJeu.estDepotAutorise(new Borne(100));
		System.out.println("d�p�t ok ? " + depotOK);
		if (depotOK) {
			zoneDeJeu.deposer(new Borne(100));
		}
		System.out.println("peut avancer ? " + zoneDeJeu.peutAvancer());
		// D�pot limitation de vitesse 50 bornes
		System.out.println("Deposer carte limite - 50");
		depotOK = zoneDeJeu.estDepotAutorise(new DebutLimite(null));
		System.out.println("d�p�t ok ? " + depotOK);
		if (depotOK) {
			zoneDeJeu.deposer(new DebutLimite(null));
		}
		System.out.println("peut avancer ? " + zoneDeJeu.peutAvancer());
		// D�pot 100 bornes
		System.out.println("Deposer carte borne - 100");
		depotOK = zoneDeJeu.estDepotAutorise(new Borne(100));
		System.out.println("d�p�t ok ? " + depotOK);
		if (depotOK) {
			zoneDeJeu.deposer(new Borne(100));
		}
		System.out.println("peut avancer ? " + zoneDeJeu.peutAvancer());
		// Depot 25 bornes
		System.out.println("Deposer carte borne - 25");
		depotOK = zoneDeJeu.estDepotAutorise(new Borne(25));
		System.out.println("d�p�t ok ? " + depotOK);
		if (depotOK) {
			zoneDeJeu.deposer(new Borne(25));
		}
		System.out.println("peut avancer ? " + zoneDeJeu.peutAvancer());
		// D�pot fin limitation
		System.out.println("Deposer carte fin limite - 50");
		depotOK = zoneDeJeu.estDepotAutorise(new FinLimite(null));
		System.out.println("d�p�t ok ? " + depotOK);
		if (depotOK) {
			zoneDeJeu.deposer(new FinLimite(null));
		}
		System.out.println("peut avancer ? " + zoneDeJeu.peutAvancer());
		// D�pot 100 bornes
		System.out.println("Deposer carte borne - 100");
		depotOK = zoneDeJeu.estDepotAutorise(new Borne(100));
		System.out.println("d�p�t ok ? " + depotOK);
		if (depotOK) {
			zoneDeJeu.deposer(new Borne(100));
		}
		System.out.println("peut avancer ? " + zoneDeJeu.peutAvancer());

// RESULTAT ATTENDU POUR LA PARTIE 3 (ne pas d�commenter)
// 			Deposer carte Feu rouge
//			d�p�t ok ? false
//			peut avancer ? false
		
//			Deposer carte attaque - accident
//			d�p�t ok ? false
//			peut avancer ? false
		
//			Deposer carte Feu vert
//			d�p�t ok ? true
//			peut avancer ? true
		
														//			Deposer carte attaque - essence 
														//			d�p�t ok ? true 
														//			peut avancer ? false 
		
														//			Deposer carte parade - roue de secours
														//			d�p�t ok ? false 
														//			peut avancer ? false 
		
														//			Deposer carte parade - essence
														//			d�p�t ok ? true  
														//			peut avancer ? false 
		
														//			Deposer carte Feu vert
														//			d�p�t ok ? true 
														//			peut avancer ? true
		
//			Deposer carte borne - 100
//			d�p�t ok ? true
//			peut avancer ? true
		
//			Deposer carte limite - 50
//			d�p�t ok ? true
//			peut avancer ? true
		
//			Deposer carte borne - 100
//			d�p�t ok ? false
//			peut avancer ? true
		
//			Deposer carte borne - 25
//			d�p�t ok ? true
//			peut avancer ? true
		
//			Deposer carte fin limite - 50
//			d�p�t ok ? true
//			peut avancer ? true
		
//			Deposer carte borne - 100
//			d�p�t ok ? true
//			peut avancer ? true
        
        
	}

}
