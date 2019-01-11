package Part_4;

public class Part_4 {

	public static void main(String[] args) {
		
		
		
		int a = 20;
		
		Test x = new Test();	//x nie znajduje sie w zadna wartosc tylko adres
		x.zmienWartosc(a);
		
	}

}


class Test
{
	
	
	void zmienWartosc(int zm)
	{
		zm = zm + 2;	// kopia która przestaje istnieæ
	}
}