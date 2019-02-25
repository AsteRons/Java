package part_04;

import java.util.*;
import javax.swing.*;
import javax.swing.Timer;
public class Part_04 {

	public static void main(String[] args) {
		
		
		String[] planets = new String[] {"Merkury", "Wenus", "Ziemia", "Mars", "Jowisz", "Saturn", "Uran", "Neptun"};
		
		System.out.println(Arrays.toString(planets));
		System.out.println("Sortowanie alfabetycznie");
		Arrays.sort(planets);
		System.out.println(Arrays.toString(planets));
		System.out.println("Sortowanie po dlugosci");
		Arrays.sort(planets, (first, second) -> first.length() - second.length());
		System.out.println(Arrays.toString(planets));
		
		Timer t = new Timer(1000, event -> 
		System.out.print("Jest godzina " + new Date()));
		t.start();
		
	}

}
