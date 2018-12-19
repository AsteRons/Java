
public class Employee {
	
//pola
	
private String name;
private double salary;

//konstruktor

public Employee(String n, double s)
{
	name = n;
	salary = s;
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

public void raiseSalary(double byPercent)
{
	double raise = salary * byPercent / 100;
	salary += raise;
}


}
