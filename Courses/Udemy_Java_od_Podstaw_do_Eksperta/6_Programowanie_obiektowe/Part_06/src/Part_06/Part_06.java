package Part_06;

public class Part_06 {

	
	
	
	
	public static void main(String[] args) {

		Butelka[] butelka = new Butelka[3];	//na 3 butelki, NULL
		
		for(int i = 0; i < 3; i++)
		butelka[i] = new Butelka(10);
		
		System.out.println(butelka[0].getIleLitrow());
		System.out.println(butelka[1].getIleLitrow());
		
		
		butelka[0].przelej(111, butelka[1]);
		System.out.println(butelka[0].getIleLitrow());
		System.out.println(butelka[1].getIleLitrow());
	}



}
