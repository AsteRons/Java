
package part_03;

import java.util.*;

public class Part_03 {

	
	
	public static void main(String[] args) {
		
        /*
         * M�WI�, �E podk�adam za "E" : "String" we wszystkich deklaracjach/definicjach metod
         * Lista String�w
         * */
		
       List<String> listaStringow = new ArrayList<String>();
       
       //List<SuperClass> listaClass = new ArrayList<SuperClass>();
       List<SubClass> listaClass = new ArrayList<SubClass>();
      // listaClass.add(new SuperClass());
       listaClass.add(new SubClass());
       
       SuperClass.tester(listaClass);
		
	
		
		
	}

}
