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
		
			
			
			
			
			RAF.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
