package part_07;

public class Part_07 {

	
	public static void main(String[] args)
	{
	Element a = new Element(5);
	Element b = new Element(5);
	Element c = null;
	
	System.out.println(a.equals(b));

	System.out.println(a.hashCode());
	System.out.println(b.hashCode());
	}
	
}
