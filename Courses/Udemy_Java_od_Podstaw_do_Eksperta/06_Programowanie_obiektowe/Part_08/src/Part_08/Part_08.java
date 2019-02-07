package Part_08;

public class Part_08 {

	public static void main(String[] args) {

		
		Osoba[] osoba = new Osoba[4];
		
		osoba[0] = new Pracownik("Jan", "Nowak", 9000);
		osoba[1] = new Student("Tom", "Kwiatkowski");

		for(int i = 0; i< osoba.length; i++)
		{
			
			
			if(osoba[i] instanceof Osoba)
			{
				if(osoba[i] instanceof Pracownik)	//wybieramy tylko pracowników
				((Pracownik) osoba[i]).pobierzOpis(); //³¹czenie w dó³
			}
				
			
			else
				break;
			
			
		}
		
	
	}

}

