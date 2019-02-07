package part_05;

import java.io.*;


public class Part_05 {

	
	
	
	
	public static void main(String[] args) {
		
		
		Towar[] towar = new Towar[3];
		
		towar[0] = new Towar();
		towar[1] = new Towar(29.0, "Video Kurs Java");
		towar[2] = new Towar(39.0, "Video Jurs C++", 2008, 11, 1);
		
		
		try
		{
			PrintWriter writer = new  PrintWriter(new FileWriter("baza.txt")); 
			
			Towar.zapiszDoPliku(towar, writer);
		
			writer.close();
			
			BufferedReader reader = new BufferedReader(new FileReader("baza.txt"));
			
			Towar[] towar2 = Towar.odczytajZPliku(reader);
			
			for(int i = 0; i < towar2.length; i++)
			{
				System.out.println(towar2[i]);
			}
				
			
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
