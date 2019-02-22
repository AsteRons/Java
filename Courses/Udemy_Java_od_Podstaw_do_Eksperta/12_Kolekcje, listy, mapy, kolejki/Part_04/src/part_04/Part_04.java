package part_04;

import java.util.*;

public class Part_04 {

	
	
	public static  void main(String[] args) {

		Figura figura1 = new Kolo();
		Figura figura2 = new Kwadrat();
		
		Figura[] figura = new Figura[50];
		

		List<Figura> listaFigur = new ArrayList<Figura>();
		listaFigur.add(figura1);
		listaFigur.add(figura2);
		
		
		Edytor.wypisz(listaFigur);
		
		
		Float  [] fl = new Float[50];
		Integer[] in = new Integer[50];
		Number[] ny  = new Number[50];
		
		
		Collection<Number> cn = new ArrayList<Number>();
		
		Edytor.przepiszTabliceDoKolekcji(fl, cn);
		Edytor.przepiszTabliceDoKolekcji(in, cn);
		Edytor.przepiszTabliceDoKolekcji(ny, cn);
	}

}
