package Part_1;

public class KlasyAnonimowe {

	public static void main(String[] args) {
	
		ZachowaniePoWcisnieciu z = new ZachowaniePoWcisnieciu() {

			@Override
			public void akcja() {
				System.out.print("Jestem z klasy anonimowej");
				
			}
			
		};

		

		
	}

}

interface ZachowaniePoWcisnieciu
{
	void akcja();
}


class Przycisk
{
	void dodajAkcje(ZachowaniePoWcisnieciu z)
	{
		z.akcja();
	}
}