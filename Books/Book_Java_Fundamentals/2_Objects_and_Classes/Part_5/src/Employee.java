
public class Employee {

	//Pola
	
	private static int nextId = 1;
	
	private String name;
	private double salary;
	private int id;
	
	//Konstruktory
	
	public Employee(String n, double s)
	{
		name = n;
		salary = s;
		id = 0;
	}
	
	
	// Metody
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public int getId()
	{
		return id;
	}
	
	//Ustawienie Id na kolejny numer
	public void setId()
	{
		id = nextId;
		nextId++;
	}
	//Zwrócenie pola statycznego
	public static int getNextId()
	{
		return nextId;
	}
	
	
	//Test  jednostkowy
	public static void main(String[] args) {
		Employee e = new Employee("Grzegorz", 5000);
		System.out.println(e.getName() + " " + e.getSalary());
	}

}
