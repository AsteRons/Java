package Part_3;

/**
 * Program demonstruje klaasy abstrakcyjne
 * @version 1.01
 * @author CMGI-MN-2
 */


public class Part_3 {

	public static void main(String[] args) {
		Person[] people = new Person[2];
		
		people[0] = new Employee("Henryk Kwiatek", 5000, 1981, 10, 1);
		people[1] = new Student("Jan Hers", "Informatyka");
		
		for(Person e : people)
			System.out.println(e.getName() + "," + e.getDescription());

	}

}
