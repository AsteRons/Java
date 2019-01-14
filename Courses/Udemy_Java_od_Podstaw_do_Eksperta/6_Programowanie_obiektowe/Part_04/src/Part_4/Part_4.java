package Part_4;

public class Part_4 {

	public static void main(String[] args) {
		
		
		
		int a = 20;
		
		Test x = new Test();	//x nie znajduje sie w zadna wartosc tylko adres
		 x.zmienWartosc(a);
		
		 Foo foo = new Foo();
		 x.zmienZawartosc(foo);
		 
		 
		System.out.println(foo.y);
	}

}


class Test
{
	
	
	void zmienWartosc(int zm)
	{
		zm = zm + 2;	// kopia która przestaje istnieæ
	}

	void zmienZawartosc(Foo zm)	
	{
		zm.y= zm.y + 40;	// kopia która przesy³a adres
	}
	
}
class Foo
{
	int y = 20;
}