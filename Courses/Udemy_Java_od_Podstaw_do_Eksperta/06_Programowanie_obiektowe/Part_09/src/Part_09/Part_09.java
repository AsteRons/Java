package Part_09;

public class Part_09 {

	public static void main(String[] args) {
		
		//metode equals
		Punkt p = new Punkt(4, 100);
		Punkt p1 = new Punkt(4, 1100);
		
		if(p.equals(p1))
		System.out.println("równe");

		//metoda toString
		Object[] punkty = new Punkt[4];
		
		punkty[0] = new Punkt(3, 5);
		punkty[1] = new Punkt(4, 1);
		punkty[2] = new Punkt(7, 8);
		punkty[3] = new Punkt(2, 88);

		
		for(int i = 0; i < punkty.length; i++)
		{
			System.out.println(punkty[i]);
		}
	}

}
