package Part_1;

/**
 * Program demonstruj¹cy dziedziczenie
 * @author Symulator 3D
 * @version 1.21
 *
 */
public class Part_1 {

	public static void main(String[] args) {

		//Tworzenie obiektu klasy Manager
		Manager boss = new Manager("Karol Parol", 8000, 1982, 10, 12);
		boss.setBonus(5000);
		
 Employee[] staff = new  Employee[3];
 
 // Wstawianie obiekty klasy Manager oraz Employee do tablicy pracowników
 
 staff[0] = boss;
 staff[1] = new Employee("Henryk Kwiatek", 4000, 1995, 12, 15);
 staff[2] = new Employee("Artur Smyk", 6000, 1992, 1, 18);
 
 
// Wyœwietlenie informacji o wszytskich pracownikach
 
 for(Employee e: staff)
	 System.out.println("name= " + e.getName() + ",salary= " + e.getSalary());
	}

}

