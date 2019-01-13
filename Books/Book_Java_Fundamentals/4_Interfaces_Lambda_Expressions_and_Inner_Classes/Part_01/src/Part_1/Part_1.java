package Part_1;


import java.util.Arrays; 


public class Part_1 {

	public static void main(String[] args) {

		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Henryk Kwiatek", 35000);
		staff[1] = new Employee("Karol Kwiatek", 35100);
		staff[2] = new Employee("Tadeusz Nowak", 36000);

		
		Arrays.sort(staff);
		
		for(Employee e : staff)
		{
			System.out.println("name= " + e.getName() + ", salary= " + e.getSalary());
		}
	}

}
