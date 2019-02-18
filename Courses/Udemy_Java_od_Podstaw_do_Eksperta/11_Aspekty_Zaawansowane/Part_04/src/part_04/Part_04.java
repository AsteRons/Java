package part_04;

public class Part_04 {

	public static void main(String[] args) {
		

		//Runnable wypisanie = new WypisanieRunnable(); 
		
		// zadaniePierwsze();
		
		
		Counter licznik = new Counter();
		Thread watek3 = new Thread(new CounterRunnabe(licznik, false), "Maleje");
		Thread watek4 = new Thread(new CounterRunnabe(licznik, true), "Rosnie");
		
		
		watek3.start();
		watek4.start();
    	}
	
	
	
	void zadaniePierwsze()
	{
		Object lock = new Object();
		
		Thread watek = new Thread(new WypisanieRunnable(lock), "Watek1 ");
		Thread watek2 = new Thread(new WypisanieRunnable(lock), "Watek2 ");
		
		watek.start();
		watek2.start();
		
		
	}

}


