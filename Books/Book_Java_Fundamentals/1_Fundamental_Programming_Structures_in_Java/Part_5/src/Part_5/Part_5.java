package Part_5;

import java.util.Arrays;

public class Part_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[100];	//deklaracja tablicy 100 elementowej, d�ugo�� tablicy nie musi by� sta�a
		
		String[] name = new String[10];
		
	int t =a.length;	//wypisauje d�ugo�� tablicy
		
	
	//P�tla typu each
	// Dla ka�dego elementu a
	
	int[] smallPrimes = {1, 4, 5, 3, 1};		// inicjalizowanie tablicy
	
	

	
		for(int element :a)
			System.out.println(element);
		
		//Kopiowanie tablicy
		
		
		int[] copiedTab = Arrays.copyOf(smallPrimes, smallPrimes.length);
		
		
	}

}
