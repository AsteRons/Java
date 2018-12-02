package Part_2;

import java.awt.print.Printable;
import java.io.File;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Part_2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		
		File plik = new File("pliknowy.txt"); 		// tworzenie nowego pliku
		
		
		PrintWriter zapis = new PrintWriter("pliknowy.txt");
		zapis.println("Ala ma kota, a kot ma Ala");
		zapis.close();
	}

}
