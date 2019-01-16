package Part_08;

public class Student extends Osoba{

	Student(String imie, String nazwisko)
	{
		super(imie, nazwisko);
		
	}

	@Override
	void pobierzOpis() {
		System.out.println(imie + " " + nazwisko + " jest studentem");
	}
	
}
