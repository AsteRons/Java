import java.time.LocalDate;
import java.util.*;

public class Part_1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
// Klasa Date() - wyra¿a moment w czasie
		
//Tworzy obiekt za pomoc¹ klasy Data oraz za pomoc¹ metody toString() konwertuje ja to Stringa.
String s = new Date().toString();	
System.out.println(s);
	

//LocalDate()

LocalDate date = LocalDate.now();	// metoda fabryczna
 
int year  = date.getYear();
int month = date.getMonthValue();
int day   = date.getDayOfMonth();

LocalDate aThousandDaysLater = date.plusDays(1000);




System.out.print(aThousandDaysLater.getYear());

	}

}
