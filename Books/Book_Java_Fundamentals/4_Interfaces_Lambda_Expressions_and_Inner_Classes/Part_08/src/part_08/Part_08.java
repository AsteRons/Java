package part_08;

import java.lang.reflect.*;
import java.util.*;

public class Part_08 {

	
	
	public static void main(String[] args) {
	Object[] elements = new Object[1000];
	
	//Wstawienie do tablicy obiekt�w po�rednicz�cych liczb ca�kowitych z przedia�u 1 -1000 

	for(int i = 0; i < elements.length; i++)
	{
		Integer value = i + 1;
		InvocationHandler handler = new TraceHandler(value);
		
		Object proxy = Proxy.newProxyInstance(null, new Class[] { Comparable.class}, handler );
		elements[i] = proxy;
		
	}
	
	// Tworzenie losowej liczby ca�kowitej
	
	Integer key = new Random().nextInt(elements.length) + 1;
	
	//Szukanie liczby
	int result = Arrays.binarySearch(elements, key);
	
	//Drukowanie dopasowanej wartosci, jesli zostanie znaleziona
	
	if(result >= 0) System.out.println(elements[result]);
	
	}

}
