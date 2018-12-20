package Part_1;

import java.time.*;

public class Employee {

	private String name;
	private double salary;
	private LocalDate hireDay;
	
	
	public Employee(String name, double salary, int years, int month, int day)
	{
		this.name = name;
		this.salary = salary;
		hireDay = LocalDate.of(years, month, day);
		
	}
	
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
