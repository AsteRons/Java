
public class Part_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Tomasz", 4000);
		staff[1] = new Employee("Dariusz", 6000);
		staff[2] = new Employee("Grzegorz", 6500);
		
		//Drukowanie informacji o wszytskich obiektach klasy Employee
		
		for( Employee e: staff)
		{
			e.setId();
			System.out.println("name=" + e.getName() + " id=" + e.getId() + " salary=" + e.getSalary());
		}
		
		// Wykorzystanie metody statycznej
		int n = Employee.getNextId();
		System.out.println("Nastepny dostepny identyfikator= " + n);
		

	}

}
