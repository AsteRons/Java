/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodydomyslne;

/**
 * Obiekt <code>Pracownik</code> reprezentuje pracownika. jest to klasa
 * @author Maciek
 * @version 1.0.1
 */
public class MetodyDomyslne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}



interface Formula
{
    double calculate(int a);
    
    default double sqrt(int a)
    {
        return Math.sqrt(a);
    }
    
}

class A implements Formula
{

    @Override
    public double calculate(int a) {
      return   this.sqrt(a*4);
    }
    
}
