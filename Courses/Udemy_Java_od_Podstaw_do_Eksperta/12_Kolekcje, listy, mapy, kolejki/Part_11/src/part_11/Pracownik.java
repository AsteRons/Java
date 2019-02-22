package part_11;

public class Pracownik {

	public static int i = 0;
	private int ID;
	String imie;
	
	
	public Pracownik()
	{
		i++; 
		ID = i;
	}

	public Pracownik(String imie)
	{
		this();
		this.imie = imie;
	}

	public int getID()
	{
	
		return ID;
	}
	
	public String getImie()
	{
		
		return imie;
	}

	public String toString()
	{
		return imie;
	}
	
}
