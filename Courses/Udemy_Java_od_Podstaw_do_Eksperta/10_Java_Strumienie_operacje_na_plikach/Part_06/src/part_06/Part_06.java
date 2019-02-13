package part_06;

import java.io.*;


public class Part_06 {

	
	
	
	
	public static void main(String[] args) {
		
		
		Towar[] towar = new Towar[3];
		
		towar[0] = new Towar();
		towar[1] = new Towar(29.0, "Video Kurs Java");
		towar[2] = new Towar(39.0, "Video Jurs C++", 2008, 11, 1);
		
		
		try
		{

			RandomAccessFile RAF = new  RandomAccessFile("baza.txt", "rw");
		
			Towar.zapiszDoPliku(towar, RAF);
			
			RAF.seek(0);

			Towar[] towary = Towar.odczytajZPliku(RAF);
			
			
			// Wczytanie ca³ej bazy danych
			for( int i = 0; i < towary.length; i++)
			{
				System.out.println(towary[i].pobierzCene());
				System.out.println(towary[i].pobierzNazwe());
				System.out.println(towary[i].pobierzDate());
				System.out.println("--------------------------");
			}
		
			try {
          Towar b = new Towar();
          b.czytajRekord(RAF, 3);
		  System.out.println(b);	
		  System.out.println("Lalala");	
		  
			}
          catch(BrakRekordu err)
			{
        	  System.out.println(err.getMessage());
			}
			
			RAF.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
