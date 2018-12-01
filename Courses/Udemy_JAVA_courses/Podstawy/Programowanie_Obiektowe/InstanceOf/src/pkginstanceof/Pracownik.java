
package pkginstanceof;

public class Pracownik  extends Osoba{
   double wynagrodzenie ; 
   
   
    Pracownik(String imie, String nazwisko, int wynagrodzenie)
    {
       super(imie, nazwisko);
       this.wynagrodzenie = wynagrodzenie;
    }
    void pobierzOpis()
    {
        System.out.println("Pracownik: "+ imie +" "+ nazwisko);
    }
    
    
    void pracuj()
    {
        System.out.println("ja pracuje");
    }
}
