package testsFonctionnels;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import cartes.Carte;
import cartes.Configuration;
import cartes.JeuDeCartes;
import utils.GestionCartes;

public class testJeuDeCartes {
	

	public static void main(String[] args) {
		JeuDeCartes jeu = new JeuDeCartes();
		
		List<Carte> listeCarteNonMelangee = new LinkedList<>();
		
		for (Carte carte : jeu.donnerCartes()) {
			listeCarteNonMelangee.add(carte);
		}
		
		List<Carte> listeCartes = new ArrayList<>(listeCarteNonMelangee);
		System.out.println("liste Cartes non melangee : " + listeCartes + "\n");
		
		listeCartes = GestionCartes.melanger(listeCartes);
		System.out.println("liste Cartes melangee : " + listeCartes + "\n");
		
		System.out.println("liste mélangée sans erreur ? "
				+ GestionCartes.verifierMelange(listeCarteNonMelangee, listeCartes));
		
		listeCartes = GestionCartes.rassembler(listeCartes);
		System.out.println("liste Cartes rassembler : " + listeCartes + "\n");
		
		System.out.println("liste rassemblée sans erreur ? "
				+ GestionCartes.verifierRassemblement(listeCartes));

		System.out.println("Compte des cartes afficher sans erreur? " + jeu.checkCount()); // true

		System.out.println(jeu.afficherJeuDeCartes());
		Carte cartes[] = jeu.donnerCartes();
		
		for (int i = 0; i < cartes.length; i++) {
			System.out.println(cartes[i]);
		}
		
	}

}
