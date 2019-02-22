package part_09;

import java.io.*;
import java.util.*;

public class Part_09 {

	
	public static void main(String[] args)
	{

		
		
		
        Set<Element> set = new TreeSet<Element>(
                new Comparator<Element>()
        {

            public int compare(Element o1, Element o2) 
            {
               String opisO1 = o1.pobierzOpis();
               String opisO2 = o2.pobierzOpis();
               
               return opisO1.compareTo(opisO2);
            }
        }
                );
        
        
		
		set.add(new Element(1245, "opis"));
		set.add(new Element(5, "aopis"));
		set.add(new Element(445, "zopis"));
		
		
		Iterator<Element> iter = set.iterator();
		while(iter.hasNext())
			System.out.println(iter.next().pobierzOpis());
		
		
		
		System.out.println("Wielkosc zbioru: " + set.size());
		
	}

	
	
	
}
