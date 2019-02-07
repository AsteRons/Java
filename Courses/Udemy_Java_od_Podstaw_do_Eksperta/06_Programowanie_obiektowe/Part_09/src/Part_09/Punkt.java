package Part_09;

public class Punkt {

	private int x;
	private int y;
	
	
	Punkt()
	{
		
	}
	Punkt(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	
	
	int getX()
	{
		return x;
	}
	
	int getY()
	{
		return y;
	}
	
	
	public boolean equals(Object o)
	{
		// test 1 wysy³amy null
		if (o == null) return false;
		
		// test 2 ten sam adres
		if (this == o)
			return true;
		
		// test 3 ta sama klasa
		if(this.getClass() != o.getClass())
			return false;
		
		// test 4
		Punkt przyslany = (Punkt)o;
		if(this.x == przyslany.x && this.y == przyslany.y)
		return true;
		else
			return false;
	}
	
	public String toString()
	{
		return getX() + " " + getY();
	}
	
	
	
}
