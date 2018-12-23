package Part_3;

import java.time.LocalDate;


public class Employee extends Person
{

	private double salary;
	private LocalDate hireDay;
	
	public Employee(String name, double salary, int year, int month, int day)
	{
		super(name);
		this.salary = salary;
		hireDay = LocalDate.of(year, month, day);
	}
	

	public String getDescription() {

		return String .format("pracownik zarabiaj�cy %.2f z�", salary);
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
