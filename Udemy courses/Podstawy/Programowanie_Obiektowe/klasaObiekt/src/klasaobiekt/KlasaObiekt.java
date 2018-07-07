
package klasaobiekt;

//Dziedziczenie po uniwersalnej klasie OBJECT
//użycie przeładnowanej klasy toString do pokazania wartosci
//użycie rzutowania w dol


public class KlasaObiekt {


    public static void main(String[] args) {
      
        Object a = new Punkt(5, 12); // superklasa wskazuje na klase nizej 
        Object[] punkty = new Punkt[4];
        
         punkty[0] = new Punkt(2, 5);
         punkty[1] = new Punkt(4, 2);
         punkty[2] = new Punkt(1, 7);
         punkty[3] = new Punkt(5, 5);
         
         for( int i = 0; i <punkty.length; i++ )
         {
             System.out.println(punkty[i]);
         }
         
         
         
        Punkt p = new Punkt(4, 10); // adres
        Punkt p2 = new Punkt(4, 10); //adres
        
        
        if(p.equals(p2))
          System.out.println("Są sobie równe ");
        
        
        
        
       System.out.println(p.getClass()); // wypisuje nazwe klasy

    }
    
}
