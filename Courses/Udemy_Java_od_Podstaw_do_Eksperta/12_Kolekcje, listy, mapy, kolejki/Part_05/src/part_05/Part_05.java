package part_05;

import java.util.ArrayList;
import java.util.LinkedList;

public class Part_05 {

	public static void main (String[] args)
	{
		
		ArrayList listaTablicowa = new ArrayList();
		listaTablicowa.add(new Object());

		ListaPolaczona listaPolaczona = new ListaPolaczona();
		
		listaPolaczona.wartosc = 10;
		
		listaPolaczona.nastepna = new ListaPolaczona();
		listaPolaczona.nastepna.wartosc = 20;
		
		listaPolaczona.nastepna.nastepna= new ListaPolaczona();
		listaPolaczona.nastepna.nastepna.wartosc = 20;
		
		
		
	}
	
}
