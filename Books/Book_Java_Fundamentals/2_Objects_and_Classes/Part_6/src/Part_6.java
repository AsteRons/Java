
// 
public class Part_6 {

	public static void main(String[] args) {

/*
 * Test 1. Metody nie mog¹ modyfikowaæ parametrow liczbowych
 */
		System.out.println("Testowanie tripleValue: ");
		double percent = 10;
		System.out.println("Przed: precent=" + percent);
		tripleValue(percent);
		System.out.println("Po: precent=" + percent);
		System.out.println();
		/*
		 * Test 2. Metody mog¹ zmieniaæ stan parametrów bêd¹cego obiektami
		 */	
		
		System.out.println("Testowanie tripleValue: ");
		Employee harry = new Employee("Grzegorz", 5000);
		System.out.println("Przed salary= " + harry.getSalary());
		tripleValue(harry);
		System.out.println("Po salary= " + harry.getSalary());
		System.out.println();
		
		/*
		 * Test 3. Metody nie mog¹ zamieniac dwóch obiektów
		 */	
		
		System.out.println("testowanie swap:");
		
		Employee a = new Employee("Alicja", 7000);
		Employee b = new Employee("Jan", 4000);
		
		System.out.println("Przed a= " + a.getName());
		System.out.println("Przed b= " + b.getName());
		
		swap(a,b);
		
		System.out.println("Po a= " + a.getName());
		System.out.println("Po b= " + b.getName());
		
		
	}
	
	//Metody klasy Part_6
	
		public static void tripleValue(double x)
		{
			x = x * 3;
			System.out.println("koniec metody: x =" + x);
		}
		
		public static void  tripleValue(Employee x)
		{
			x.raiseSalary(200);
			System.out.println("koniec metody: salary=" + x.getSalary());
		}
		
		public static void swap(Employee x, Employee y)
		{
			Employee temp = x;
			x = y;
			y = temp;
			System.out.println("Koniec metody: x=" + x.getName());
			System.out.println("Koniec metody: y=" + y.getName());
		}
}
