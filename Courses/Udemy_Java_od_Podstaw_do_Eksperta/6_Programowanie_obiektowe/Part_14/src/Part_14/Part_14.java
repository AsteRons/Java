package Part_14;

public class Part_14 {

	public static void main(String[] args) {
		
		
		ZachowaniePoWcisnieciu z = new ZachowaniePoWcisnieciu() {

			
			public void akcja() {	//pojedyncze 
				
				System.out.println("Jestem z anonimowej");
			}
		};
		
		
		Przycisk p = new Przycisk();
		
		p.dodajAkcje(z);
		
			
	}

}


interface ZachowaniePoWcisnieciu{
	
	void akcja();
	
	
	}

class Przycisk
{
	void dodajAkcje(ZachowaniePoWcisnieciu z)
	{
		z.akcja();
	}

}



//Nie trzeba tego juz implementowaæ
/*

class Przycisk implements ZachowaniePoWcisnieciu
{

	
	@Override
	public void akcja() {
		
		System.out.println("Jestem z przycisku 1");
	}
	
}

class Przycisk2 implements ZachowaniePoWcisnieciu
{

	
	@Override
	public void akcja() {
		System.out.println("Jestem z przycisku 2");
		
		
	}
	
}

*/
