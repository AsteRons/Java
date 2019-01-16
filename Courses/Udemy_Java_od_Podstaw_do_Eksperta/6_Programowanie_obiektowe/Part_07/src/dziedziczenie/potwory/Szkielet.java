package dziedziczenie.potwory;


public class Szkielet extends Potwor
{

	private String typBroni;
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
	
	
	protected void atakuj()
	{

		System.out.println("Metoda ataku z klasu szkielet");
	}


	@Override
	
	protected void opis() {
		
		
	}
	
}
