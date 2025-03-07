package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class GestionCartes {

	public static <T> T extraire(List<T> array){
		if (array.isEmpty()) {
            throw new IllegalArgumentException("Array is empty");
        }
		Random rand = new Random();
		int i = rand.nextInt(array.size());
		return array.remove(i);
	}
	
	public static <T> List<T> melanger(List<T> array) {
		Random rand = new Random();

        for (int i = array.size(); i > 0; i--) {
        	int j = rand.nextInt(i+1);
			T temp = array.get(i);
			array.set(i, array.get(j));
			array.set(j, temp); // swap
		}
        
		return array;
	}
	
	public static <T> boolean verifierMelanger(List<T> array1, List<T> array2) {
		if (array1.size() != array2.size()) {
			return false;
		}
		
		for(T element : array1) {
			if (Collections.frequency(array1,element) != Collections.frequency(array2, element)) {
				return false;
			}
		}
		return true;
	}
	
	public static <T> List<T> rassembler(List<T> array) {		
        List<T> finalArray = new ArrayList<>(); 
        Set<T> seenElements = new HashSet<>(); // Track processed elements
        
        for (T elem : array) {
            if (!seenElements.contains(elem)) { // Process each element only once
                seenElements.add(elem);
                for (T e : array) {
                    if (e.equals(elem)) {
                        finalArray.add(e);
                    }
                }
            }
        }
        return finalArray;
    }
}
