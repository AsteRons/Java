package part_05;

public class Part_05 {

	public static void main(String[] args) throws InterruptedException {


		Object lock = new Object();
		
		Thread watek = new Thread(new WypisanieRunnable(lock), "Watek1 ");
		Thread watek2 = new Thread(new WypisanieRunnable(lock), "Watek2 ");
		
		watek.start();
		watek.join();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("po watku 1 przez watkiem 2");
		watek2.start();
	
		
		
		
	}

}

