package testsFonctionnels;

import cartes.*;

public class testMethodeEquals {

	public static void main(String[] args) {
		// a
		Borne carte1 = new Borne(50);
		Borne carte2 = new Borne(50);
		Borne carte3 = new Borne(25);
		// b
		Attaque carte4 = new Attaque(null, Type.FEU);
		Attaque carte5 = new Attaque(null, Type.ACCIDENT);
		Attaque carte6 = new Attaque(null, Type.FEU);
		
		Botte carte7 = new Botte(null, Type.LIMITE);
		Botte carte8 = new Botte(null, Type.LIMITE);
		Botte carte9 = new Botte(null, Type.FEU);
		// c
	    Attaque feuRouge = new Attaque(null, Type.FEU);
	    Parade feuVert = new Parade(null, Type.FEU);  // Feu Vert

		System.out.println("Comparing same Borne 50 : " + carte1.equals(carte2)); // true
		System.out.println("Comparing Borne 50 & Borne 25 : " + carte1.equals(carte3)); // false
		
		System.out.println("Comparing attaque type FEU & attaque type ACCIDENT : " + carte4.equals(carte5)); // false
		System.out.println("Comparing same attaque type FEU : " + carte4.equals(carte6)); // true

		System.out.println("Comparing Attaque and Borne : " + carte4.equals(carte1)); // false
		
		System.out.println("Comparing same Botte type LIMITE : " + carte7.equals(carte8)); // true
		System.out.println("Comparing Botte type LIMITE & type FEU : " + carte7.equals(carte9)); // false

	    System.out.println("Comparing Attaque & Parade (same type) : " + feuRouge.equals(feuVert)); // false

	}

}
