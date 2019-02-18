package part_04;


public class CounterRunnabe implements Runnable {
	
	
	boolean increase;
	Counter licznik;
	
	public CounterRunnabe( Counter licznik, boolean increase)
	{
		this.licznik = licznik;
		this.increase = increase;
		
	}
	
	
	public void run() {
		
		synchronized(licznik)
		{
			
			for(int i = 0; i < 50; i++)
		{
			
			if( increase)
				licznik.increaseCounter();
			else
				licznik.decreaseCounter();
			
			try {
				
				
				Thread.sleep(10);
			}	
			
			catch(InterruptedException e)
				{
				System.out.println(e.getMessage());	
				
				}

		}
			
			
			
			
		}

	}

}
