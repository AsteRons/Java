
package klasaobiekt;


public class KlasaObiekt {


    public static void main(String[] args) {
      
        Object a = new Punkt(5, 12); // superklasa wskazuje na klase nizej 
       
        
        
        Punkt p = new Punkt(4, 10); // adres
        Punkt p2 = new Punkt(14, 13); //adres
        
        
        if(p.equals(p2))
            System.out.println("Są sobie równe ");
        
        
        
        
       System.out.println(p.getClass()); // wypisuje nazwe klasy

    }
    
}
