
package slowo_final;

import java.util.Date;


public class Slowo_final {

    // final - jak const w C++
    //nie ma finalnej abstrakcyjne klasy
    
    public static void main(String[] args) {
      final double PI = 3.14;   //nie mozna zmienic po pierwszym ustawieniu
     
      
      Pracownik p = new Pracownik();
      System.out.println(p.dataZatrudnienia);
    }
    
}



    abstract class Osoba
    {   
    }

class Pracownik extends Osoba
{
    Pracownik()
    {
        this.dataZatrudnienia = new Date();
    }
    
    
        Pracownik(Date data)
    {
        this.dataZatrudnienia = data;
    }
    final Date dataZatrudnienia; // finalną metode nie moge nadpisac
}

//    final class Osoba //!!!
//    {   
//    }

//  class Pracownik extends Osoba // Nie można rozszeżać klasy z final
//      {  

//      }
