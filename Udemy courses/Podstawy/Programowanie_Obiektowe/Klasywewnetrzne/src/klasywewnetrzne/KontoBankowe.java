/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klasywewnetrzne;

/**
 *
 * @author Maciek
 */
public class KontoBankowe {

    public KontoBankowe(double stanKonta) {
        this.stanKonta = stanKonta;
    }
    
    
    private double stanKonta;
    double getStanKonta()
    {
        return this.stanKonta;
    }
    
    
    
    void start(double stopa)
    {
        Odsetki odsetki =  new Odsetki(stopa);  // stworzenie instancji klasy / start -> inicjacja
    }
            
    
    class Odsetki
    {
        public Odsetki(double stopaProcentowa )
        {
          this.stopaProcentowa = stopaProcentowa; 
          this.zmienStanKonta(stopaProcentowa);
        }
        
        void zmienStanKonta(double stopa)
        {
         double odsetki =  (stanKonta * stopa) / 100;
         stanKonta += odsetki;
         
        }
        
        private double stopaProcentowa;
    }
           
}
