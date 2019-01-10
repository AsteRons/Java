package Part_1;

public class Part_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Monitor p;
		p = new Monitor();
		
		
		
		
		
	}

}



class Monitor
{
	
	//Pola
	
	
	int szerokosc;
	int wysokosc;
	
	
	//Konstruktor
	Monitor()
	{
		System.out.println("Wywo³ano konstruktor domyslny");
		
		
	}
	
	Monitor(int szerokosca, int wysokosc)
	{
		
		System.out.println("Wywo³ano konstruktor domyslny");
		
		this.szerokosc = szerokosca;
		this.wysokosc  = wysokosc;
		
	}
	
	
	//Metody

	
	void wypisz(String imie)
	{
		System.out.println(imie);
	}
	
	int dodaj(int a, int b)
	{
		int suma = 0;
		
		suma = a + b;
		
		return suma;	
	}

	double dodaj(double a, double b)
	{
		double suma = 0;
		
		suma = a + b;
		
		return suma;	
	}
	
	
	
	
}