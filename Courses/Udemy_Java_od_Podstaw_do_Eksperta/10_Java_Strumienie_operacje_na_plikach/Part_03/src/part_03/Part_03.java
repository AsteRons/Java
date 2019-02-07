package part_03;

import java.io.*;

public class Part_03 {

	public static void main(String[] args) {

		try {
			
			// Zapisywanie do pliku
			
			PrintWriter drukarz = new PrintWriter(new FileWriter("dane.txt"));
			
			
			drukarz.println(1234);
			
			// drukarz.flush();
			
			drukarz.close();
			
			
			drukarz = new PrintWriter(new FileWriter("dane.txt", true));
			drukarz.append("lala");
			
			drukarz.printf("lala %d", 50);
			
			drukarz.close();
			
			// Czytanie w pliku
			
			BufferedReader reader = new BufferedReader (new FileReader("dane.txt"));
			
			// Czytanie po jednym znaku
			
			// System.out.println((char)reader.read());
			
			 // Czytamy po ca³ej linijce
			 
			 // System.out.println(reader.readLine());
			 

			BufferedWriter writer = new  BufferedWriter(new FileWriter("baza.txt"));
			
			
			
			String tresc = "";
			
			// Przepisuje dane z jednego pliku do drugiegi
			while((tresc = reader.readLine()) != null)
				{

				writer.write(tresc);
				writer.newLine();
				
				}
				
			writer.close();
			reader.close();
			
			
			
		}catch(IOException e)
		{
		System.out.println(e.getMessage());	
		}
		
		
	//	Part_03.test(1, 2, 3, 131, "lala", 34);
		
		
		
	}

	static void test(Object ...  a)
	{
		for(int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
	
}
