
package projekt_obiektowy;
import enkapsulacja.KontoBankowe;


public class Projekt_Obiektowy {

    public static void main(String[] args) {
      
        /*
        Monitor p = new Monitor();
             
       p.wypisz("Arek", "Włodarczyk");
      int wynik =  p.dodaj(10,30);
       System.out.println(wynik);
       
       */
       /*
       Matematyka test = new Matematyka();
       double wynik = test.dodaj(10,20);
       System.out.println(wynik);
       
       
       
       double wynik1 = Matematyka.dodaj(14, 11);    //nie musze robic instancji klasy dzieki static
       Klient a = new Klient("Jan");
       Klient b = new Klient("Anna");

      */
       
        
        KontoBankowe oszczednosci = new KontoBankowe();
       
        System.out.println(oszczednosci.getSaldo());
    }
  
}
//STATIC - nie moze operowac na zmiennych lokalnych ! 
//(nie moge sie do czegos co nie istnieje )






