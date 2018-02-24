
// INTERFEJSY - klasa które może przechowywać 
//metody ( publiczne i abstrakcyjne) 
//właściwośći ( publiczne , finalne , statyczne )

//jeden Interfejs moze być publiczny na 1 klasę 

// implementować mogę wiele interfejsów ale tylko 1 klasę 

package interfejsy;

import java.util.Arrays;    //do sortowania
import java.util.Collections;

public class Interfejsy {

    public static void main(String[] args) {
        
                
       //  nazwaInterfejsu a = new nazwaInterfejsu();  //nie mogę 
       // nazwaInterfejsu a = new  Pracownik();       //moge
       // ((Pracownik)a).getWynagrodzenie();

        System.out.println(nazwaInterfejsu.PI);
        
        
        int[] tab = new int[3];
        tab[0] = 3;
        tab[1] = -10;
        tab[2] = 5;
        
        Arrays.sort(tab);     
        Pracownik[] pracownik = new Pracownik[3];

        pracownik[0] = new Pracownik(10000);
        pracownik[1] = new Pracownik(1000);
        pracownik[2] = new Pracownik(23000);
                        

  
           //przed sortowaniu      
    for(Pracownik p : pracownik )
    {
        System.out.println(p.getWynagrodzenie());
    }
    
    
      Arrays.sort(pracownik, Collections.reverseOrder()); // sortowanie
      
        System.out.println(tab[0]);
        System.out.println(pracownik[0].compareTo(pracownik[1]));    
 
        //po sortowaniu
           for(Pracownik p : pracownik )
    {
        System.out.println(p.getWynagrodzenie());
    }
     
         
        
    }    
}

interface nazwaInterfejsu
{
    double PI = 3.14; // public, static, finalna
    
    
    void cos(); // public, abstrakcyjna
              
}

class Pracownik implements nazwaInterfejsu ,Comparable //może być wiele interfejsów 
{


    
    public void cos() {
     
    } 
    
    Pracownik(double wynagrodzenie)
    {
        this.wynagrodzenie = wynagrodzenie;
    }
    

    public double getWynagrodzenie()
    {
        return this.wynagrodzenie;
    }
    
   private  double wynagrodzenie;

    public int compareTo(Object t) 
    {
        Pracownik przyslany = (Pracownik)t; //rzutowanie
       if (this.wynagrodzenie < przyslany.wynagrodzenie) 
       {
           return -1;
       }
       
       else if (this.wynagrodzenie > przyslany.wynagrodzenie) 
           return 1;
       
    return 0; 
    }
    
    
}

