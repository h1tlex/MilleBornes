package utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GestionCartes {

	public static <T> T extraire(T[] array){
		if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
		
		Random rand = new Random();
		int i = rand.nextInt(array.length);
        T removedElement = array[i]; // Store element to return
        
        // Create a new array excluding the removed element
        T[] newArray = Arrays.copyOf(array, array.length - 1);

        for (int j = i; j < newArray.length; j++) {
            newArray[j] = array[j + 1]; // Shift elements left
        }
        
		return removedElement;
	}
	
	public static <T> T[] melanger(T[] array) {
		Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
        	int j = rand.nextInt(i+1);
			T temp = array[j];
			array[j] = array[i];
			array[i] = temp; // swap
		}
        
		return array;
	}
	
	//TODO FIX COLLECTIONS IMPORT
	public static <T> boolean verifierMelanger(T[] array1, T[] array2) {
		if (array1.length != array2.length) {
			return false;
		}
		
		List<T> list1 = Arrays.asList(array1);
        List<T> list2 = Arrays.asList(array2);
		
		for(T element : list1) {
			if (Collections.frequency(list1,element) != Collections.frequency(list2, element)) {
				return false;
			}
		}
		return true;
	}

}
