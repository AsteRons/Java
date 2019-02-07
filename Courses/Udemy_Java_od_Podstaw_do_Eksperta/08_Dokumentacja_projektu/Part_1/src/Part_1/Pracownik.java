package Part_1;

/**
 * Obiekt <code>Pracownik</code> reprezentuje Pracownika, jest to nadklasa dla:
 * 
 * @author Maciej
 * @version 1.0 10/11/2018
 * @see Part_1.Pracownik#getWynagrodzenie()
 */

public class Pracownik {

	/**
	 * Imie pracownika
	 */
	
	private String imie;
	
	/**
	 * Nazwisko pracownika
	 */
	
	
	private String nazwisko;
	/**
	 * Wynagrodzenie pracownika
	 */
	
	private double wynagrodzenie;
	
	/**
	 * Konstruktor domyslny
	 */
	public Pracownik() {	}
	
	
	/**
	 * Konstruktor tworz¹cy obiekt pracownik z imieniem i nazwiskiem
	 * @param imie - ustawia imie Pracownika
	 * @param nazwisko - ustawia nazwisko pracownika
	 * 
	 */
	
	public Pracownik(String imie, String nazwisko)
	{
		this.imie = imie;
		this.nazwisko = nazwisko;
	}
	
	/**
	 * Konstruktor tworz¹cy obiekt pracownik z imieniem, nazwiskiem i wynagrodzeniem
	 * @param imie - ustawia imie Pracownika
	 * @param nazwisko - ustawia nazwisko pracownika
	 * @param wynagrodzenie - ustawia wynagrodzenie pracownika
	 */
	
	public Pracownik(String imie, String nazwisko, double wynagrodzenie)
	{
		
		this(imie, nazwisko);
		this.wynagrodzenie = wynagrodzenie;
		
	}
	
	/**
	 * <pre>
	 * Jak u¿ywaæ:
	 * Pracownik p = new Pracownik()
	 * p.setWynagrodzenie(1000);
	 * </pre>
	 * 
	 * @param noweWynagrodzenie - ustawia pracownikowi nowe wynagrodzenie
	 */
	public void setWynagrodzenie(double noweWynagrodzenie)
	{
		this.wynagrodzenie = noweWynagrodzenie;
	}
	
	/**
	 * @since 1.0.0
	 * @return  zwraca pensje typu double w z³
	 */
	
	public double getWynagrodzenie()
	{
		return this.wynagrodzenie;
	}
	
}
