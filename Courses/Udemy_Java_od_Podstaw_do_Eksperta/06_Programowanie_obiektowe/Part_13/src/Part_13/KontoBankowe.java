package Part_13;

public class KontoBankowe {

	
	private double stanKonta;
	
	
	
	KontoBankowe(double stanKonta)
	{
		this.stanKonta = stanKonta;
		
	}
	
	double getStanKonta()
	{
		
		return this.stanKonta;
	}
	
	void start(double stopaProcentowa)
	{
		
		Odsetki odsetki = new Odsetki(stopaProcentowa);
		
	}
	
	
	
	
	class Odsetki
	{
		private double stopaProcentowa;
		
		
		public Odsetki(double stopaProcentowa)
		{
			this.stopaProcentowa = stopaProcentowa;
			this.zmienStanKonta(stopaProcentowa);
		}
		
		
		void zmienStanKonta(double stopaProcentowa)
		{
			double odsetki = (stanKonta * stopaProcentowa) / 100;
			stanKonta += odsetki;
	     }
}
}

