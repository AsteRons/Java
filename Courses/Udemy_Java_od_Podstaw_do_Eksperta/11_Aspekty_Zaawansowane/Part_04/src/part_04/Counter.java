package part_04;



public class Counter {

	private int counter = 50;
	
	
	public void increaseCounter()
	{
		counter++;	
		System.out.println(Thread.currentThread().getName() + ": " + counter);
	}
	
	public void decreaseCounter()
	{
		counter--;	
		System.out.println(Thread.currentThread().getName() + ": " + counter);
	}
	
	
}
