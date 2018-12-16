
public class Part_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n = Employee.getNextId();	//Zwraca wartoœæ pola statycznego
		
		
		System.out.println(n);
		
	}

	
	
}


class Employee
{
	//Pola ststyczne
	private static int nextId = 1;
	
	//Sta³e statyczne
	public static final double PI = 3.1415926535;
	private int id;
	
	
	public  void setId()
	{
		id =  nextId;
		nextId++;
	}
	
	//Metoda statyczna
	
	public static int getNextId()
	{
		return nextId; // Zwraca pole statyczne
	}
	

}