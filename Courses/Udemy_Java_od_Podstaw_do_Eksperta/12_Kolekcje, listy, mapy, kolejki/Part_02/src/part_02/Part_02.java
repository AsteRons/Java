package part_02;

import java.util.ArrayList;

public class Part_02 {

	
	
	public static void main(String[] args) {
		
		
		ArrayList<String> a = new ArrayList();
		
		a.add(new String("Lalala"));
	//	a.addAll(new Integer(3));

		for(String stringg : a )
			System.out.println(stringg);
		
		Zwykla<String> nazwaZmiennej = new Zwykla();
		nazwaZmiennej.nadajWartosc("cosik");
		
		System.out.println(nazwaZmiennej.zwroc());
	}

}


