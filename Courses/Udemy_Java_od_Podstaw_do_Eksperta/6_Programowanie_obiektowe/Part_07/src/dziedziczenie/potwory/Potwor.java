package dziedziczenie.potwory;



 public abstract class Potwor {
	
	private double predkoscChodzenia = 10;
	private double zywotnosc;
	
	public Potwor()
	{
		System.out.println("Domy�lny konstruktor z klasy Potwor");
	}
	
	 public Potwor(double predkoscChodzenia, double zywotnosc)
	{
		
		 this.predkoscChodzenia = predkoscChodzenia;
		 this.zywotnosc = zywotnosc;
		 System.out.println("Nie domy�lny konstruktor z klasy Potwor");
		 
	}
	
	
	 abstract protected void opis();

	 protected void atakuj()
	{

		System.out.println("Metoda ataku z klasu potwor");
	}
	
	

}
