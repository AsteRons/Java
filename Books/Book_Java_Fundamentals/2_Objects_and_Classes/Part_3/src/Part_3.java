import java.time.*;

public class Part_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Tworze tablice (Zmienna klasowa)
		Employee[] staff = new 	Employee[3];	
		
		//Tworzenie obiektów konstruktowrem pierwszego pracownika
		
		staff[0] = new Employee("Robert Siwiak", 7500, 1981, 12, 15);	
		staff[1] = new Employee("Jan Nowak", 3500, 1959, 11, 11);
		staff[2] = new Employee("Jacek Swies", 5100, 1992, 2, 21);
		
		// Zwiêkszenie pensji wszystkich pracowników o 5%;
		 for( Employee e : staff)
			e.raiseSalary(5);
		 
		 // Wydrukowanie informacji o wszystkich pracownikach
		 
		 for(Employee e :  staff)
			 System.out.println("name = " + e.getName() + " salary = " + e.getSalary() + " Date = " + e.getHireDay());
		
		
	}

}





// Implementacja klasy;

class Employee
{
	// pola
	
	private String name;
	private double salary;
	private LocalDate hireDay;
	
	//konstruktory
	
	public Employee(String n, double s, int years, int mounth, int day)
	{
		name    =  n;
		salary  =  s;
		hireDay =  LocalDate.of(years, mounth, day);
	}
	
	//metody
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public LocalDate getHireDay()
	{
		return hireDay;
	}
	
	
	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent / 100;
		salary += raise;
	}
}
