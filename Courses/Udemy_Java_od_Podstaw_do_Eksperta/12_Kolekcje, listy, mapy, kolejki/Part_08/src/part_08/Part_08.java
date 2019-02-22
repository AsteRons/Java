package part_08;

import java.io.*;
import java.util.*;

public class Part_08 {

	
	public static void main(String[] args)
	{

		long mili = 0;
		long totalMili = 0;
		
		Set<String> set = new HashSet<String>(512);
		set = new TreeSet<String>();
		
		try {
			Scanner reader = new Scanner(new BufferedReader (new FileReader("Informatyka.txt")));
			
			
			while(reader.hasNext())
			{
				mili = System.currentTimeMillis();
	     	
	     		set.add(reader.next());
			
				totalMili += (System.currentTimeMillis() - mili); 
			}
		
			reader.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
		
		
		System.out.println("Czas wykonania: " + totalMili + " ms");
		System.out.println("Wielkosc zbioru: " + set.size());
		
	}
	
}
