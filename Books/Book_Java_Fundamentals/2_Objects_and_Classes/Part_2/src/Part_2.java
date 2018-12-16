import java.time.*;

public class Part_2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate date = LocalDate.now();
		
		int month	=	date.getMonthValue();
		int today	=	date.getDayOfMonth();
		
		date = date.minusDays(today - 1);
		
		DayOfWeek weekday = date.getDayOfWeek();
		int value = weekday.getValue();	// 1 - poniedzi³ek, 7 - niedziela
		
		System.out.println(" Pn  Wt  Œr  Czw  Pt  So  N");
		for(int i = 1 ; i < value; i++)
			System.out.print("    ");
		
		while(date.getMonthValue() == month)
		{
			System.out.printf("%3d", date.getDayOfMonth());
			if( date.getDayOfMonth() == today)
				System.out.print("*");
			else
				System.out.print(" ");
			date = date.plusDays(1);
			if(date.getDayOfWeek().getValue() == 1) System.out.println();
			
		}
		
		if(date.getDayOfWeek().getValue() != 1) System.out.println();
		
	}

}
