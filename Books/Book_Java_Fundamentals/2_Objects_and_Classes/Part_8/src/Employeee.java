import java.util.Random;

public class Employeee {

private static int nextId;

private int id;
private String name = "";
private double salary;

//Statyczny blok inicjujący
static {
	
	Random generator = new Random();
	
	//Losowanie liczby z przedziłu 0-999
	nextId = generator.nextInt(1000);
}

//Blok inicjujący obiekty
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

//konstruktor domyślny

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
