package Part_3;

import java.util.Scanner;

public class Part_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	// Wczytanie danych
	Scanner in = new Scanner(System.in);
	
	System.out.println("Ile pieniêdzy potrzebujesz, aby przejœæ na emeryturê? ");
	double goal = in.nextDouble();
	
	System.out.println("Ile pieniedzy rocznie bedzie wplacane?");
	double payment = in.nextDouble();
	
	System.out.print("Stopa procentaow w %: ");
	double interestRate = in.nextDouble();
	
	double balance = 0;
	int years = 0;
	while (balance < goal)
	{
		balance += payment;
		double interest = balance * interestRate / 100;
		balance += interest;
		years++;
		
	}
	
	System.out.println("Mo¿esz iœæ na emeryture w wieku " + years + "lat.");
	
	
	
	}

}
