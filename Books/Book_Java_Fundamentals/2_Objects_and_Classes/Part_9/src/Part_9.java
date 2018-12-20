/**
 * @author Maciej Rundik
 * @version 1.3
 * @since version 1.1
 * @deprecated Employee 
 * 
 */

import java.util.*;
import java.sql.*;
import java.util.Date;

//Importowanie statyczne
import static java.lang.System.*;


public class Part_9 {

	/**
	 * Zarobki pracownika
	 */
	
  private double salary = 10;
	
 
	public static void main(String[] args) {
		
		// Importowanie statyczne
		out.println("Hello World");
		exit(0);
				
	}
	
	/**
	 * Podnosi pensje pracownika
	 * @param byPercent wartoœæ okreslajace, o ile procent podnieœæ pensje (np. 10 = 10%)
	 * @return kwota podwy¿ki
	 */
	
	
	public double raiseSalary(double byPercent)
	{
		double raise = salary * byPercent / 100;
		salary += raise;
		return raise;
	}
	

}
