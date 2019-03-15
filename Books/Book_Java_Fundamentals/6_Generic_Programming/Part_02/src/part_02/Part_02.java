package part_02;

import java.time.*;

public class Part_02 {

	public static void main(String[] args)
	{
		LocalDate[] birthdays =
			{
				
					LocalDate.of(1906, 12, 9),
					LocalDate.of(1815, 12, 10),
					LocalDate.of(1903, 12, 3),
					LocalDate.of(1910, 6, 22),
			};
	Pair<LocalDate> mm = ArrayAlg.minmax(birthdays);
	System.out.println("min= " + mm.getFirst());
	System.out.println("max= " + mm.getSecond());
	
	}
	
}
