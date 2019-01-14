package Part_06;



public class Butelka {
	
	private double ilelitrow;
	
	
	
	Butelka(double ileLitrow)
	{
		this.ilelitrow = ileLitrow;
	}

	 
	double getIleLitrow()
	{
		return ilelitrow;
	}
	
	void wlej(double ilosc)
	{
		
		this.ilelitrow += ilosc;
		
	}
	
	boolean wylej(double ilosc)
	{
		if(ilosc < ilelitrow)
		this.ilelitrow -= ilosc;
		else
			return false;
		
		return true;
	}
	
	void przelej(double ilosc, Butelka gdziePrzelac)
	{
		if(this.wylej(ilosc))
		{
			
		gdziePrzelac.wlej(ilosc);	
		}
		else
			System.out.println("za ma³o");
		
		
	}
}
