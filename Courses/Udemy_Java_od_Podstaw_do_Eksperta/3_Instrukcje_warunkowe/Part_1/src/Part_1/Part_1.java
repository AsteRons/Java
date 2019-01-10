package Part_1;

public class Part_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * if(Wyra¿enie)
		 * 
		 */
	
		int a = 5,
			b = 7,
			c = 50;
		//if, if else
		if(a == b)
			System.out.print("Test");
		else
			System.out.print("Test2");	
		
		// Swich
		switch(a)
		{
		case 50:
			System.out.print("50");
		break;
		
		case 150:
			System.out.print("50");	
		}
		
		//Wytra¿enia warunkowe
		String czyParzysta = a % 2 == 0 ? "parzysta" : "nieparzysta";
		
		System.out.println(czyParzysta);
		
		
	}

}
