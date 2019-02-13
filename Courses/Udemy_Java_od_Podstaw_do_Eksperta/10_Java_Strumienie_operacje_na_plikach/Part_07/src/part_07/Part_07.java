package part_07;

import java.io.*;


public class Part_07 {

	
	
	
	
	public static void main(String[] args)  {
		
		
		Towar[] towar = new Towar[3];
		
		towar[0] = new Towar();
		towar[1] = new Towar(29.0, "Video Kurs Java");
		towar[2] = new Towar(39.0, "Video Jurs C++", 2008, 11, 1);
		
		
		try
		{

	    ObjectOutputStream outS = new ObjectOutputStream(new FileOutputStream("baza.txt"));
	    
	    outS.writeObject(towar);
	    
	    outS.close();
	    
	    ObjectInputStream inS = new ObjectInputStream(new FileInputStream("baza.txt"));
	    
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
