package part_08;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class MaszynaZmieniajacaSkrzynki implements Runnable{

	private Skrzynka skrzynka;
	private Lock lock;
	private Condition oczekiwanie;
	
	public MaszynaZmieniajacaSkrzynki(Skrzynka skrzynka, Lock lock, Condition oczekiwanie)
	{
		this.skrzynka = skrzynka;
		this.lock = lock;
		this.oczekiwanie = oczekiwanie;
	}
	
	
	public void run() {
		
		
			lock.lock();
			try {
			System.out.println(Thread.currentThread().getName() + " : Zaczynam sie przygotowywac do zmiany skrzynki");
			while(true)
			{
				while(!skrzynka.jestPelna())
				{
					try {
						System.out.println(Thread.currentThread().getName() + " : Informuje, ¿e skonczy³em zamieniac");
						oczekiwanie.await();
						System.out.println(Thread.currentThread().getName() + " : Powróci³em do zamiany");
						
					} 
					catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
				skrzynka.pobierzIloscButelek();
				skrzynka.zamiana();
				skrzynka.pobierzIloscButelek();
				
				
				oczekiwanie.signalAll();
				

			}
		
			}
			finally
			{
				lock.unlock();
			}
			
			
			
	}

	
	
}

