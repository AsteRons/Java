package part_08;

import java.util.concurrent.locks.*;

public class MaszynaProdukujacaButelki implements Runnable{

	private Skrzynka skrzynka;
	private int i = 0;
	private Lock lock;
	private Condition oczekiwanie;
	
	public MaszynaProdukujacaButelki(Skrzynka skrzynka, Lock lock, Condition oczekiwanie)
	{
		this.skrzynka = skrzynka;
		this.lock = lock;
		this.oczekiwanie = oczekiwanie;
	}
	


	public void run() {
		
		
		lock.lock();
		try {
			System.out.println(Thread.currentThread().getName() + " : Zaczynam produkowac butelki");
			while(true)
			{
				while(skrzynka.jestPelna())
				{
					try{
				    System.out.println(Thread.currentThread().getName() + " : Trzeba wymienic skrzynke");
				    oczekiwanie.await();
					System.out.println(Thread.currentThread().getName() + " : Wracam do produkcji");
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				}
				
				System.out.println(Thread.currentThread().getName() + ": Wyprodukowalem " + (++i) + " butelke");
				skrzynka.dodaj(new Butelka());
				
				
				oczekiwanie.signalAll();
				
			}
			
		}
		finally
		{
			lock.unlock();
		}
		
		
	}

	
	
}
