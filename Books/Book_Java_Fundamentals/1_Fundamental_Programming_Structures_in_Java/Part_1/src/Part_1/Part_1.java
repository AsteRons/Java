/**
 * Pierwszy program Java
 * podstawy
 */

package Part_1;

import java.io.Console;
import java.util.*;

public class Part_1 {

	public static void main(String[] args) {
		
		System.out.println("Hi");
		
		final int aTrap = 1;	//inicjalizowanie sta³ych
		
		// Rzutowanie
		
		double x = 9.91;
		int t = (int)  Math.round(x);  ///zaokr¹gla do 10
		
		String s = "Czeœæ";
		String s1 = "Czeœæ";
		
		s.equals(s1);	//Czy oba stringi s¹ równe
		
		s.equalsIgnoreCase(s1); //ignorowanie wielkoœci liczb
		
		s.length(); // D³ugoœæ ³añcucha
		
	//	System.out.println(s.charAt(2));	// zwraca znak stringu na n pozycji

		// Sk³adanie ³añcucha z kilku czêœci
		
		StringBuilder  buldier = new StringBuilder();	//Tworzenie nowego obiektu
		
		buldier.append(s);
		String completedString = buldier.toString();
		
		// IN / OUT
		
		

		
		
		Scanner in = new Scanner(System.in);    //Inicjalizowanie konstruktowa do pobiarania danych
		
		System.out.println("Jak sie nazywasz");
		String name = in.nextLine();		//Pobieranie linii
		int age = in.nextInt();				//Pobieranie liczb
		System.out.println(" "+ name+ " "+ age);
		float ag = 1;

		System.out.printf("%3.1f", ag);
		
		

		
		
	}
}
 