package Part_14;

public class Part_14 {

	public static void main(String[] args) {
		
		

		
		
		Przycisk p = new Przycisk();
		
		p.dodajAkcje(new ZachowaniePoWcisnieciu()
		{

			
			public void akcja() {	//pojedyncze 
				
				System.out.println("Jestem z anonimowej");
			}
		}
		
				);
		
			
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
