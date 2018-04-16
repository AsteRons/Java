// imimplementacja czegos - jest dla danego czegos jednorazowa to używamy klasy anonimowej


package klasyanonimowe;


public class Klasyanonimowe {

   
    public static void main(String[] args) {
      ZachowaniePoWcisnieciu z = new ZachowaniePoWcisnieciu() {

          public void akcja() // klasa anonimowa
          {
             System.out.println("Klasa Anonimowa");
          }
      };
       
      Przycisk p = new Przycisk();
      
      p.dodajAkcje(z);
      
    }
    
}



interface ZachowaniePoWcisnieciu
{
    void akcja();
}
        

class Przycisk // "implements ZachowaniePoWcisnieciu" tak to sie robi
{

  void dodajAkcje(ZachowaniePoWcisnieciu z)
  {
      z.akcja(); // bierzemy z klasy anonimowej
  }
    
}

//      ALBO TAK "


class Przycisk2  // implements ZachowaniePoWcisnieciu
{


    public void akcja() {
            System.out.println("Przycisk 2");
    }
    
}