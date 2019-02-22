package part_06;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class Part_06 {

	
	
	public static void main(String[] args)
	{
		
		LinkedList<String> listaPowiazana = new LinkedList();
		listaPowiazana.add("lala1");
		listaPowiazana.add("lala2");
		listaPowiazana.add("lala3");
		listaPowiazana.add("lala4");
		
	/*	Ma³o efektywny
	 * 
		for(int i = 0; i < listaPowiazana.size(); i++)
		{
			System.out.println(listaPowiazana.get(i));
		}	
		
		*/
		Part_06.wypiszElementyListy(listaPowiazana);
		
		
	ListIterator<String> iter = listaPowiazana.listIterator(listaPowiazana.size());

	while(iter.hasPrevious())
	{
		System.out.println(iter.previous());
		iter.set("podmiana");
		
	}
	
	
	iter = listaPowiazana.listIterator();
	iter.add("nowyLala");
	
	
	/*
	iter.next();
	iter.remove();
	*/
	
	
	
	Part_06.wypiszElementyListy(listaPowiazana);
	
	
	
	
	
	}
	
	public static void wypiszElementyListy(LinkedList<?> lista)
	{
		Iterator iteratorListy = lista.iterator();
		
		while(iteratorListy.hasNext())
		System.out.println(iteratorListy.next());
		
		
		System.out.println();
		
		
		
	}
	
	
}
