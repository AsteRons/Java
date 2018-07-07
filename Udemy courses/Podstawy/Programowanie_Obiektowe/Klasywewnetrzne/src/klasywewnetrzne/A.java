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
public class A {
  private int test;   // B tez ma do niej dostęp
    
    A()
    {
        System.out.println("Jestem  z klasy zewnetrzbej");

                }
    
    class B
    {
        
     B()
    {
        System.out.println("Jestem  z klasy wewnętrznej");

                }
    
     
     
        private int temp; // nie moge w klasie A
        
        void cos()
        {
            test = 5;
        }

    
    void cos2()
    {
    B obj = new B(); // tak mogę 
    obj.cos();
            }    

}  
}
