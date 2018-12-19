import java.util.Random;

public class Employeee {

private static int nextId;

private int id;
private String name = "";
private double salary;

//Statyczny blok inicjuj�cy
static {
	
	Random generator = new Random();
	
	//Losowanie liczby z przedzi�u 0-999
	nextId = generator.nextInt(1000);
}

//Blok inicjuj�cy obiekty
{
	id = nextId;
	nextId++;
}

//Konstruktory
public Employeee(String n, double s)
{
	name = n;
	salary = s;
}

public Employeee(double s)
{
	this("Employeee #" + nextId,s);
}

//konstruktor domy�lny

public Employeee()
{
	
}


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

}
