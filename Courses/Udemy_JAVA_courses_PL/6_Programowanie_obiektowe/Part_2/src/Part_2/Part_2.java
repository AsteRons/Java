package Part_2;

public class Part_2 {

	public static void main(String[] args) {

		
	
		double wynik = Matematyka.dodaj(4, 5);
		System.out.println(wynik);
		
		//Statyczne metody
		System.out.println(Matematyka.PI);
		
		
		
	}

}

class Matematyka
{
	static final double PI = 3.14;
	
	static double dodaj(double a, double b)
	{
		
		return a + b;
		
	}
}



class Klient
{
	
	
	String imie;
	int id;
	static int nastepnyId = 0;
	
	Klient(String imie)
	{
		this.imie = imie;
		nastepnyId += 1;
		id = nastepnyId;
	}
}