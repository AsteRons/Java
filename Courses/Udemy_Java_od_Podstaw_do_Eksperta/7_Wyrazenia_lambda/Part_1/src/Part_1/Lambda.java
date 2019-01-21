package Part_1;

public class Lambda {

	public static void main(String[] args) {
	
		ZachowaniePoWcisnieciu1 z1 = () -> {
			System.out.println("Wyra¿enie Lambda");
		};

		ZachowaniePoWcisnieciu2 z2 = (a, b) ->{
			
			System.out.println(a + b);
		};
		
		
		
		
		
		Przycisk1 p = new Przycisk1();
		
		p.dodajAkcje(z1);
		
		p.dodajAkcje2(5, 10, z2);
		
		
	}

}

interface ZachowaniePoWcisnieciu1
{
	void akcja();
}


interface ZachowaniePoWcisnieciu2
{
	void akcja2(int a, int b);
}




class Przycisk1
{
	void dodajAkcje(ZachowaniePoWcisnieciu1 z)
	{
		z.akcja();
	}
	
	void dodajAkcje2(int a, int b, ZachowaniePoWcisnieciu2 z)
	{
		z.akcja2(a, b);
	}
	
}