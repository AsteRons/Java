/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulacja;

/**
 *
 * @author Maciek
 */
public class KontoBankowe {
    
    public KontoBankowe()
    {
        
    saldo = 1000;    
        
    }
    
    private int saldo;
    
    public int getSaldo()
    {
        return saldo;
    }
    
    
   public void setSaldo(int saldo)
    {
        this.saldo = saldo;
    }
   
   public boolean wyplac(int ile)
   {
       if(saldo < ile)
           return false;
                   else
           setSaldo(saldo - ile);

                   return true;
   }
   
   
   
 
}
