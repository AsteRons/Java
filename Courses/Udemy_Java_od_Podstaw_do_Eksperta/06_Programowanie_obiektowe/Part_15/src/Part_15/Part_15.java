package Part_15;

public class Part_15 {

	public static void main(String[] args) {
		
		
	Pracownik p = new Pracownik("Arek",new Address("Stoka", 164) );
		
	System.out.println(p);
	}

}


class Pracownik
{
	String imie;
	Address adres;
	
	public Pracownik(String imie, Address adres) {
		
		this.imie = imie;
		this.adres = adres;
	}
	
	public String toString()
	{
		return this.imie + " " + adres.ulica + " " + adres.nrDomu;
	}
	
	
}





class Address
{
	String ulica;
	int nrDomu;

public Address( String ulica, int nrDomu) {
	this.ulica = ulica;
	this.nrDomu = nrDomu;
}


}
	
