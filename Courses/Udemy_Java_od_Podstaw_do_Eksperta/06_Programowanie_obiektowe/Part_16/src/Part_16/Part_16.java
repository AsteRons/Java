package Part_16;
import java.lang.*;

public class Part_16 {

	public static void main(String[] args) {
		
		int a = 10;
		try {
			
		if(a == 10)
		throw new NaszWyjatek("a == 10, wyrzuca wyjatek");
		
		}catch(Exception wyjatek)
		{
			System.out.println("nasz wyjatek; : " +  wyjatek.getMessage());
		}
		
		
		
		
		try {
			
			System.out.println(5/0);
	
		    }
		catch(Exception  ex)
		{
			System.out.println("Powstal wyjatek: " + ex.getMessage());
		}
		
	 	finally{
	 		
	 			System.out.println("To si� wykona zawsze");
	 	}
	 	
	 
	
		
		
		
/*
 try{
 
 	//instrukcje kt�re mog� spowodowac wyj�tek	
 }
  catch(nazwa_zwr�conego_wyj�tku  zmienna) {
  
  	//obs�uga z�apanego wyj�tku
  }

 */
	
	}
	

}
