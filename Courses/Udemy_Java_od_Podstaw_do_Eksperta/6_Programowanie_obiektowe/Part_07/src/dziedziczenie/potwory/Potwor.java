package dziedziczenie.potwory;



public class Potwor {
	
	public double predkoscChodzenia = 10;
	public double zywotnosc;
	
	public Potwor()
	{
		System.out.println("Domyœlny konstruktor z klasy Potwor");
	}
	
	 public Potwor(double predkoscChodzenia, double zywotnosc)
	{
		
		 this.predkoscChodzenia = predkoscChodzenia;
		 this.zywotnosc = zywotnosc;
		 System.out.println("Nie domyœlny konstruktor z klasy Potwor");
		 
	}
	
	
	public void atakuj()
	{

		System.out.println("Metoda ataku z klasu potwor");
	}
	
	

}
