/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potwory;

/**
 *
 * @author Maciek
 */
public abstract class Potwory {
  protected  double predkoscChodzenia = 10;
  protected  double zywotnosc;
    
  
 abstract  void opis(); // abstrakcyjna metoda nie moze mieć ciała 

   protected void atakuj()
    {
        System.out.println("ATAK Potwor! ");
    }
    
   public Potwory()
   {
      
       System.out.println("Domyslny konstruktor z klasy potwor");
   }
   
   
      public Potwory(double predkoscChodzenia, double zywotnosc)
   {
      this.zywotnosc = zywotnosc;
      this.predkoscChodzenia = predkoscChodzenia;
       System.out.println("NIE domyslny konstruktor z klasy potwor");
   }
                
    
}
