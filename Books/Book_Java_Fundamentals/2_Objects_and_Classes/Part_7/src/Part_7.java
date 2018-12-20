
public class Part_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}

class Employe{
	
	//Inicjalizacja pól
	
	private static int nexstId;
	private String name = "";
	private double salary = 0;
	
	
	public Employe(String n, double s)
	{
		name = n;
		salary = s;
	}
	
	public Employe(double salary)
	{
		this("Employe #" + nexstId, salary);
		nexstId++;
	}
	
	public Employe()
	{
		name   = "" ;
		salary = 0;	
	}
}