package Part_07;

import dziedziczenie.potwory.*;


public class Part_07 {

	public static void main(String[] args) {

	
		Potwor p = new Potwor(100, 100);
		System.out.println(p.predkoscChodzenia);
		
		Szkielet s = new Szkielet(20, 400, "£uk");
		System.out.println(s.predkoscChodzenia);
		Zombie z = new Zombie();
		
	}

}
