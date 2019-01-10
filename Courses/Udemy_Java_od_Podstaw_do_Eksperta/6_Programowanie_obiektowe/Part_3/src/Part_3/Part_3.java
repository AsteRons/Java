package Part_3;

public class Part_3 {

	public static void main(String[] args) {


		KontoBankowe oszczednosciowe = new KontoBankowe();
		if(oszczednosciowe.wyplac(45))
		{
			System.out.println("wyp³acono");
			
		}
		else
			System.out.println("za malo kasy");
		
		System.out.println(oszczednosciowe.getSaldo());
		
		
		
	}

}


class KontoBankowe
{
	
	private int saldo;
	
	public KontoBankowe()
	{
		saldo = 1000;
		
	}
	
	
	
	int getSaldo()
	{
		return saldo;
		
	}
	
	void setSaldo(int saldo)
	{
		this.saldo = saldo;
	}
	
	
	
	boolean wyplac(int ile)
	{
		if( saldo < ile)
			return false;
		else
			setSaldo(saldo - ile);
			
		return true;

	}
	
	
}