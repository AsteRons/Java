package Part_13;

public class Part_13 {

	public static void main(String[] args) {
		

		
		KontoBankowe kontoBankowe = new KontoBankowe(1000);

		System.out.println(kontoBankowe.getStanKonta());

		kontoBankowe.start(5);
		
		System.out.println(kontoBankowe.getStanKonta());
		
		
		
	}

}
