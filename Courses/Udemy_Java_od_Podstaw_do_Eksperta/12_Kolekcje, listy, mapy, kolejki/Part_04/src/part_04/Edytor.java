package part_04;

import java.util.*;

public class Edytor
{

	public static <T extends Figura>  void wypisz(List<T> lista)
	{
		for(T figura : lista)
			System.out.println(figura.pobierzNazwe());
		
		lista.add((T) new Kolo());
		lista.add((T) new Kolo());
		lista.add((T) new Kolo());
		lista.add((T) new Kolo());
		lista.add(null);
		
		System.out.println("----------------------");
		
		for(T figura : lista)
		{
			
		if(figura == null) 
			{
			System.out.println("null");
			break;
			}
		System.out.println(figura.pobierzNazwe());	
		}
		
		
	}
	
	
	public static <Type> void przepiszTabliceDoKolekcji(Type[] tab, Collection<Type> c)
	{
		
		for(Type o: tab)
			c.add(o);
	}
	
}
