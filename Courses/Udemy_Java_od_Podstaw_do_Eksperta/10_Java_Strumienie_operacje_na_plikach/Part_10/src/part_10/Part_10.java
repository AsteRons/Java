package part_10;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;


public class Part_10 {

	
	
	
	
	public static void main(String[] args)  {
		
		
		Towar[] towar = new Towar[3];
		
		towar[0] = new Towar();
		towar[1] = new Towar(29.0, "Video Kurs Java");
		towar[2] = new Towar(39.0, "Video Jurs C++", 2008, 11, 1);
		
		
		try
		{

	    ObjectOutputStream outS = new ObjectOutputStream(new GZIPOutputStream (new FileOutputStream("baza.txt")));
	    
	    outS.writeObject(towar);
	    
	    outS.close();
	    
	    
	    
	    
	    ObjectInputStream inS = new ObjectInputStream(new GZIPInputStream (new FileInputStream("baza.txt")));
	    
	    Towar[] a = (Towar[])inS.readObject();
	    
	    for(int i = 0; i < a.length; i++)
	    System.out.println(a[i].pobierzNazwe());
	    
		inS.close();	
		
		
		
		
		
		
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
		catch (ClassNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}

}