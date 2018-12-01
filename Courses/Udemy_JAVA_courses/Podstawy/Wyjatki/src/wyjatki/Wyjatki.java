
package wyjatki;


public class Wyjatki {


    public static void main(String[] args) {
       int a = 10;
       
       
       try
       {
         if( a == 10)
           throw new NaszWyjatek("a jest rowne 10, grzeszysz" );  
       }
       catch(NaszWyjatek ex)
       {
           System.out.println(ex.getMessage());
       }
        
       
       
       
    try{
        System.out.println(5/0);
        
        // ponizsze instrukcje nie są wykonywane
    }
    catch(Exception ex) // wszystkie wyjatki dziedziczą z Exception
    {
        System.out.println("Powstał wyjątek: " + ex.getMessage()); 
    }
    
    finally
    {
       System.out.println("Zawsze sie wykona"); 
    }
     
    
    
 }
    
}



class NaszWyjatek extends Exception
{

    public NaszWyjatek(String string) {
        super(string);
    }

  

  
    
}




/*
try
{

}
catch(NazwaZwrotnegoWyjątku   nazwazmiennej) //nazwazmiennej - obiekt powstaje gdy wystąpi wyjatek
{
      // instrukcje obsługujące złapany wyjatek
}

    finally
    {
       // zawsze sie wykona
    }

*/



