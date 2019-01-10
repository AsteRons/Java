package Part_5;

/**
 * 
 * @author Maciej Rudnik
 * @version 1.1 25.12.2017
 */
public class Part_5 {

	public static void main(String[] args) {
		
	Employee boy1 = new Employee("Jan Nowak", 7600, 1991, 12, 17);
	Employee boy2 = boy1;
	
	Employee boy3 = new Employee("Jan Nowak", 7600, 1991, 12, 17);
	Employee boy4 = new Employee("Ken Sessor", 9100, 2001, 11, 18);
 
	System.out.println("boy1 == boy2 " + (boy1 == boy2));
	
	System.out.println("boy1 == boy3 " + (boy1 == boy3));
	
	System.out.println("boy1.equals(boy3) " + boy1.equals(boy3));
	
	System.out.println("boy1.equals(boy4) " + boy1.equals(boy4));
	
	System.out.println("boy4.toString() " + boy4);
	
	Manager carl = new Manager ("Karol Krakowski", 8000, 1971, 12, 19);
	Manager boss = new Manager ("Karol Krakowski", 8000, 1971, 12, 19);	
	boss.setBonus(5000);
	System.out.println("boss.toString() " + boss);
	System.out.println("carl.equals(boss " + carl.equals(boss));
	System.out.println("boy1.hashCode() " + boy1.hashCode());
	System.out.println("boy2.hashCode() " + boy2.hashCode());
	System.out.println("boy3.hashCode() " + boy3.hashCode());
	System.out.println("boy4.hashCode() " + boy4.hashCode());
	System.out.println("carl.hashCode() " + carl.hashCode());
	}

}
