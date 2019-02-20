package part_09;

public class Part_09 {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getPriority());

		
		Thread  watek1 = new Thread( new Thread1(), "maly");
		Thread  watek2 = new Thread( new Thread2(), "duzy");
		
		
		System.out.println(watek1.getPriority());
		System.out.println(watek2.getPriority());
		
		
		watek1.setPriority(Thread.MIN_PRIORITY);
		watek2.setPriority(Thread.MAX_PRIORITY);
		
		
		watek1.start();
		watek2.start();
		
	}

}

class Thread1 implements Runnable
{

	
	public void run() {
		
		while(true)
		System.out.println(Thread.currentThread().getName());
	}
	
}


class Thread2 implements Runnable
{

	
	public void run() {
		
		while(true)
		System.out.println(Thread.currentThread().getName());
		
	}
	
}