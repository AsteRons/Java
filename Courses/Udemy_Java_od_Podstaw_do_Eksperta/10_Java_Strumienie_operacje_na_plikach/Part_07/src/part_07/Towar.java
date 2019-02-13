package part_07;

import java.io.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;




public class Towar implements Serializable{
	
	private double cena;
	private String nazwa;
	private Date dataWydania;
	public static final int DLUGOSC_NAZWY = 30;
	public static final int DLUGOSC_REKORDU = (Character.SIZE * DLUGOSC_NAZWY + Double.SIZE + 3 * Integer.SIZE) / 8;
	
	private String haslo = "tajne"; 
	
	public Towar()
	{
		this.cena = 0.0;
		this.nazwa = " ";
		this.dataWydania = new GregorianCalendar().getTime();
		
	}
	
	public Towar ( double cena, String nazwa)
	{
		this();
		this.cena = cena;
		this.nazwa = nazwa;
		
	}
	
	public Towar ( double cena, String nazwa, int rok, int m, int dz)
	{
		this(cena, nazwa);
		GregorianCalendar kalendarz = new GregorianCalendar(rok, m-1, dz);
		this.dataWydania = kalendarz.getTime();
	}
	
	
	
	//Cena
	
	public double pobierzCene()
	{
		
		return this.cena;
	}
	
		public void ustawCene(double cena)
	{
		this.cena = cena;
	}
	
	// Nazwa
		
	public String pobierzNazwe()
	{
		return this.nazwa;
	}
	
	public void ustawNazwe(String nazwa)
	{
		this.nazwa = nazwa;
	}
	
	
	// Data
	
	public Date pobierzDate()
	{
		return dataWydania;
	}

	public void ustawDate( int r, int m, int dz)
	{
		GregorianCalendar kalendarz = new GregorianCalendar(r, m-1, dz);
		this.dataWydania = kalendarz.getTime();
	}

	public void ustawDate(Date data)
	{
		this.dataWydania = data;
	}
	
		public String pobierzHaslo()
	{
		
		return this.haslo;
	}
	
	public String toString()
	{
		GregorianCalendar kalendarz = new GregorianCalendar();
		kalendarz.setTime(this.dataWydania);
		
		return this.cena + " z³  " + this.nazwa + "  " + kalendarz.get(Calendar.YEAR)  + " | " + (kalendarz.get(Calendar.MONTH) + 1) + " | " + kalendarz.get(Calendar.DAY_OF_MONTH);
		
	}


	private void readObject(ObjectInputStream inS) throws IOException, ClassNotFoundException
	{
		inS.defaultReadObject();
		if(!haslo.equals("tajne"))
		System.out.println("Pliki zostaly podmienione");
	}

}
