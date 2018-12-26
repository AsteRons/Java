package Part_6;

import java.util.*;

public class Part_6 {

	public static void main(String[] args) {
	//Tworzymy liste tablicow¹ 
	ArrayList<Employee> staff = new ArrayList<Employee>();
	staff.ensureCapacity(100);
	
	staff.add(new Employee("Jan nowak", 12000, 1981, 12, 17));
	
	staff.size(); // sprawdza wielkosæ 
	staff.trimToSize();
	
	ArrayList<Integer> list = new ArrayList<>();
	}

	
}
