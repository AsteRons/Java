package part_04;

public class WypisanieRunnable implements Runnable{

	

	public String msg[] = {"To", "jest", "synchronicznie", "wypisana", "wiadomosc"};
	private Object lock;
	
	public WypisanieRunnable(Object lock)
	{
		this.lock = lock;
	}
	
	public void run() {
		
		display(Thread.currentThread().getName());
	}
	
	
	
public  void display(String threadName)
{
	
	synchronized(lock)
	{
		for(int i = 0; i < msg.length; i++)
	{
		System.out.println(threadName + " " + msg[i]);
	
	try {
		
		Thread.sleep(100);
		
		
	}
	catch(InterruptedException e)
	{
	System.out.println(e.getMessage());	
	}
	
	}
		
	}
	
	
	
}
	
}
