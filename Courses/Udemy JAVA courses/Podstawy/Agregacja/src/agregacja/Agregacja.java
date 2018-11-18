//agregacja - łączenie w całość
// kompozycja = agregacja która nie moze istnieć bez ( silnik nie istnieje bez samochodu)

package agregacja;


public class Agregacja {

    
    public static void main(String[] args) {
      Pracownik p = new Pracownik("Arek", new Adress("Proszowska", 94) );
       
      System.out.println(p);
    }
    
}



class Pracownik
{
    String imie;
    Adress adres;   // agregacja

    
    //Praca praca;  // kompozycja
    public Pracownik(String imie, Adress adres) {
        this.imie = imie;
        this.adres = adres;
    }

    
    public String toString() {
        return this.imie + ": " + adres.ulica + " " + adres.nrDomu;
    }
   
    
    
}



class Adress
{
 
String ulica;
int nrDomu;

    public Adress(String ulica, int nrDomu) {
        this.ulica = ulica;
        this.nrDomu = nrDomu;
    }

    
    

}