package Part_03;

public class Part_03
{

	public static void main(String[] args) 
	{

		try {
			
			Employee orginal = new Employee("Jan W. Kowalski", 50000);
			orginal.setHireDay(2000, 1, 1);
			
			Employee copy = orginal.clone();
			copy.raiseSalary(10);
			copy.setHireDay(2002, 2, 12);
			System.out.println("orginal= " + orginal);
			System.out.println("copy= " + copy);
			}
			catch(CloneNotSupportedException e )
				{
						e.printStackTrace();
				}

	}

}
  