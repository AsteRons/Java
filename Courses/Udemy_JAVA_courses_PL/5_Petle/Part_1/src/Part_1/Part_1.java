package Part_1;

public class Part_1 {

	public static void main(String[] args) {

		

		String[] kursyProgramowania = 
			{
					"Java",
					"Java Aplikacje",
					"C#",
					"C++"
			};
		
		// P�tla: while
		
		int  i = 0;

		while(i < kursyProgramowania.length)
		{
			System.out.println(kursyProgramowania[i]);
			i++;
		}
		
		
		//P�tla do ... while
		
		i = 0;
		do
		{
			System.out.println(kursyProgramowania[i]);
			i++;
			
			
		}while(i < kursyProgramowania.length);
		
		
		//P�tla for
		
		
		for(int t = 0; t < kursyProgramowania.length; t++)
		{
			System.out.println(kursyProgramowania[t]);
		}
		
		
		//P�tla for ... each
		
		for(String myValue : kursyProgramowania)
		{
			System.out.println(myValue);
		}
		
		
		// P�tla w p�tli	-	tabliczka mno�enia
		
		for( int y = 0; y <= 10; y++)
		{
			for( int j = 0; j <= 10; j++)
			{
				System.out.print(y * j + " ");
			}
			System.out.println();
			
		}
		
		
		// Instrukcja Break i continue
		
		for( int i2 = 0; i2 < 10 ; i2++)
		{
			if(i2 == 1) break;
			
			System.out.println(i2);
		}
		
		
	}

}
