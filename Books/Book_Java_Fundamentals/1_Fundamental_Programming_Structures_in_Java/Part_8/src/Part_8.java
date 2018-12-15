
public class Part_8 {

	public static void main(String[] args) {
		
		final double STARTRATE = 10;
		final int NRATES = 6;
		final int NYEARS = 10;
		
		
		double[] interestRate = new double[NRATES];
		for(int j = 0; j < interestRate.length; j++)
			interestRate[j] = (STARTRATE + j) / 100.0;
			
		
			double[][] balances = new double[NYEARS][NRATES];
			
			//Ustawienie solda pocz¹tkowego na 10 000
			
			for(int j = 0; j < balances[0].length ; j++)
			balances[0][j] = 10000;
			
			// Obliczanie odsetek dla przysz³ych lat
			for( int i = 1; i < balances.length; i++)
			{
				for( int j = 0; j < balances[i].length; j++)
				{
					//Przybrane sald z minionego roku z poprzedniego wiersza
					
					double oldBalance = balances[i -1][j];
					
					//Obliczanie odsetek
					double interest = oldBalance * interestRate[j];
					
					//Obliczanie tegorocznych salda
					balances[i][j] = oldBalance + interest;
					
				}
			}
			
			//Wydruk jendego wiersza stóp oprocentowania
			
			for( int j = 0; j < interestRate.length; j++)
				System.out.printf("%9.0f%%",100 * interestRate[j]);
			
			System.out.println();
			
			//Wydruk tebeli sald
			for( double[] row : balances)
			{
				// Wydruk wiersza tabeli
				
				for( double b: row)
					System.out.printf("%10.2f" , b);
			}
		

	}

}
