package Part_12;

public class Part_12 {

	public static void main(String[] args) {

		
		A zewnetrzna = new A();
		
		A.B wew= zewnetrzna.new B();

	}

}


class A
{
	
	A()
	{
		System.out.println("Jestem z kalsy A");
	}
	
	class B
	{
		B()
		{
			System.out.println("Jestem z kalsy B");
		}
		
		void coœ()
		{
			test = 5;
		}
		
		private int tmp;
	}
	
	
	private int test;
	
	
	void coœ2()
	{
		//tmp = 5;     - nie ma do tego dostepu
	}
	
}