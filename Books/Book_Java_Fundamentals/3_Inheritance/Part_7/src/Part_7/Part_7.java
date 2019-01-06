package Part_7;

import java.util.*;
public class Part_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new  Scanner(System.in);
		System.out.print("Podaj rozmiar: (SMALL, MEDIUM, LARGE, EXTRA_LARGE) ");
		String input = in.next().toUpperCase();
		Size size = Enum.valueOf(Size.class, input);	//Tworzenie obiektu klasy wyliczeniowej
		
		System.out.println("rozmiar= " + size);
		System.out.println("skrót= " + size.getAbbreviation());
		
		if(size == Size.EXTRA_LARGE)
		{
			System.out.println("Dobra robota");
		}
		
		
	}

}
