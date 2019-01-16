package Part_08;

public class Pracownik extends Osoba{

	double wynagrodzenie;
	
	Pracownik(String imie, String nazwisko, double wynagrodzenie)
	{
		super(imie, nazwisko);
		
		this.wynagrodzenie = wynagrodzenie;
		
		
	}

	@Override
	void pobierzOpis() {
		
		System.out.println(imie + " " + nazwisko + " jest pracownikiem i zarabia " + wynagrodzenie);
	}
	
}
