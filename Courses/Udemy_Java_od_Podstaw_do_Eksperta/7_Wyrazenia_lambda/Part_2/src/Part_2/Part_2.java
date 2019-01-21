package Part_2;

public class Part_2 {

	public static void main(String[] args) {
		
	}

}


interface Formula
{
	double calculate(int a);

	default double sqrt(int a)
	{
		return Math.sqrt(a);
	}
	
}



class A implements Formula
{


	public double calculate(int a) {

		return this.sqrt(a * 5);
	}
	
}