package part_08;

import java.util.ArrayList;


public class Skrzynka {
	
	private final int POJEMNOSC = 10;
	private ArrayList listaButelek = new ArrayList(POJEMNOSC);
	
	
	public synchronized boolean jestPelna()
	{
		if(listaButelek.size() == POJEMNOSC) 
			return true;
		
		return false;
	}

	
	public synchronized int pobierzIloscButelek()
	{
		
		System.out.println(Thread.currentThread().getName() + " Aktyalnie w skrzynce jest " + listaButelek.size() + " butelek.");
		return this.listaButelek.size();
	}
	
	public synchronized void dodaj(Butelka butelka)
	{
		listaButelek.add(butelka);
	}
	
	public synchronized void zamiana()
	{
		System.out.println(Thread.currentThread().getName() + " Zamieniam skrzynki ");
		listaButelek.clear();
	}
	
}
