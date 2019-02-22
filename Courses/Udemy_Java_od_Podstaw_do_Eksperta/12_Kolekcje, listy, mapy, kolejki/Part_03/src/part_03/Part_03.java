
package part_03;

import java.util.*;

public class Part_03 {

	
	
	public static void main(String[] args) {
		
        /*
         * MÓWIÊ, ¯E podk³adam za "E" : "String" we wszystkich deklaracjach/definicjach metod
         * Lista Stringów
         * */
		
       List<String> listaStringow = new ArrayList<String>();
       
       //List<SuperClass> listaClass = new ArrayList<SuperClass>();
       List<SubClass> listaClass = new ArrayList<SubClass>();
      // listaClass.add(new SuperClass());
       listaClass.add(new SubClass());
       
       SuperClass.tester(listaClass);
		
	
		
		
	}

}
