package part_07;

public class MaszynaZmieniajacaSkrzynki implements Runnable{

	private Skrzynka skrzynka;
	
	
	public MaszynaZmieniajacaSkrzynki(Skrzynka skrzynka)
	{
		this.skrzynka = skrzynka;
	}
	
	public void run() {
		
		synchronized(skrzynka)
		{
			
			System.out.println(Thread.currentThread().getName() + " : Zaczynam sie przygotowywac do zmiany skrzynki");
			while(true)
			{
				while(!skrzynka.jestPelna())
				{
					try {
						System.out.println(Thread.currentThread().getName() + " : Informuje, ¿e skonczy³em zamieniac");
						skrzynka.wait();
						System.out.println(Thread.currentThread().getName() + " : Powróci³em do zamiany");
						
					} 
					catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
				skrzynka.pobierzIloscButelek();
				skrzynka.zamiana();
				skrzynka.pobierzIloscButelek();
				
				
				skrzynka.notifyAll();
				

			}
		}
	}

	
	
}

