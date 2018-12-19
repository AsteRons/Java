
public class Part_8 {

	public static void main(String[] args) {
		
		Employeee[] staff = new Employeee[3];
		
		staff[0]	=	new Employeee("Hubert", 4000);
		staff[1]	=	new Employeee(6000);
		staff[2]	=	new Employeee();
		
		for(Employeee e : staff)
			System.out.println("name=" + e.getName()  + " salary= "+ e.getSalary());
	}

}
