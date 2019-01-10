package Part_11;

import java.lang.reflect.*;
import java.util.*;

public class Part_11 {

	public static void main(String[] args) {

	/*	
		
		int[] a = {1, 2, 3};
		a = (int[])goodCopyOf(a);
		System.out.println(Array.toString(a));
		
		String[] b = { "Tomek", "Daniel", "Henryk" };
		b = (String[])goodCopyOf(b);
		System.out.println(Array.toString(b));
		*/

	}

	
	/**
	 * Metoda powi�ksza tablice, tworz�c now� tablice tego samego typu
	 * i kopiujac wszystkie elementy
	 * @param a tablica, kt�ra ma by� powi�kszona
	 * @return  wi�ksza tablica zawieraj�ca wszystkie elementy tablicy a
	 */
	
	public static Object goodCopyOf(Object a, int newLenght)
	{
		Class cl = a.getClass();
		if(!cl.isArray()) return null;
		
		Class componentType = cl.getComponentType();
		int length = Array.getLength(a);
		
		Object newArray = Array.newInstance(componentType, newLenght);
		System.arraycopy(a, 0, newArray, 0, Math.min(length, newLenght));
		return newArray;
	}
}
