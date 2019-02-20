package part_07;

public class MaszynaProdukujacaButelki implements Runnable{

	private Skrzynka skrzynka;
	private int i = 0;
	
	public MaszynaProdukujacaButelki(Skrzynka skrzynka)
	{
		this.skrzynka = skrzynka;
	}
	
	public void run() {
		
		
		synchronized(skrzynka)
		{
			System.out.println(Thread.currentThread().getName() + " : Zaczynam produkowac butelki");
			while(true)
			{
				while(skrzynka.jestPelna())
				{
					try{
				    System.out.println(Thread.currentThread().getName() + " : Trzeba wymienic skrzynke");
					skrzynka.wait();
					System.out.println(Thread.currentThread().getName() + " : Wracam do produkcji");
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				}
				
				System.out.println(Thread.currentThread().getName() + ": Wyprodukowalem " + (++i) + " butelke");
				skrzynka.dodaj(new Butelka());
				skrzynka.notifyAll();
				
			}
			
		}
		
		
	}

	
	
}
