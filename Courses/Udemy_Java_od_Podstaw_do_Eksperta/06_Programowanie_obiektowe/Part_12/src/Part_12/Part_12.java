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
		
		void co�()
		{
			test = 5;
		}
		
		private int tmp;
	}
	
	
	private int test;
	
	
	void co�2()
	{
		//tmp = 5;     - nie ma do tego dostepu
	}
	
}