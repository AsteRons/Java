package dziedziczenie.potwory;


public class Szkielet extends Potwor
{

	String typBroni;
	public Szkielet()
		{
			System.out.println("Domyœlny konstruktor z klasy Szkielet");
		}

	
	public Szkielet(double predkoscChodzenia, double zywotnosc)
	{
		super(predkoscChodzenia, zywotnosc);

	
		
	}
	
	
	
	public Szkielet(double predkoscChodzenia, double zywotnosc, String typBroni)
	{
		super(predkoscChodzenia, zywotnosc);
		this.typBroni = typBroni;
		System.out.println("Nie domyœlny konstruktor z klasy Szkielet");
		
	}

	
}
