package dziedziczenie.potwory;


public class Szkielet extends Potwor
{

	String typBroni;
	public Szkielet()
		{
			System.out.println("Domy�lny konstruktor z klasy Szkielet");
		}

	
	public Szkielet(double predkoscChodzenia, double zywotnosc)
	{
		super(predkoscChodzenia, zywotnosc);

	
		
	}
	
	
	
	public Szkielet(double predkoscChodzenia, double zywotnosc, String typBroni)
	{
		super(predkoscChodzenia, zywotnosc);
		this.typBroni = typBroni;
		System.out.println("Nie domy�lny konstruktor z klasy Szkielet");
		
	}

	
}
