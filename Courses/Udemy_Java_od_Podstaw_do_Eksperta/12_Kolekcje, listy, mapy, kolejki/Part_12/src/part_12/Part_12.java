package part_12;

import java.util.*;

public class Part_12 {

	public static void main(String[] args) {
		

		Stack<String> stos = new Stack<String>();
	
		stos.push("Lala1");
		stos.push("Lala2");
		stos.push("Lala3");
		stos.push("Lala4");
	
	
	System.out.println(stos.pop());
	System.out.println(stos.pop());
	System.out.println(stos.pop());

	
	String nazwa = stos.peek();
	
	if(nazwa.equals(nazwa))
		stos.pop();
	else
		System.out.println("Nie ma takiego");
	}
	
	
	Vector<String> stos = new Vector<String>();
}
