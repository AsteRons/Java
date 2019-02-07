package Part_10;
import java.util.Date;


public class Pracownik extends Osoba{


	final Date	dataZatrudnienia;
	
	Pracownik()
	{
		this.dataZatrudnienia = new Date();
	}
	
	
	Pracownik(Date date)
	{
		this.dataZatrudnienia = date;
	}
	
	
}



