/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package referencja;

/**
 *
 * @author Maciek
 */
public class TestReferencja {
    
    int zmiennaWartosc( int zm)
    {
        zm = zm + 2;
        return zm;
    }
 
    void zmienZawartosc(Foo zm) // PRZESŁALIŚMY ADRES PAMIĘCI 
    {
     zm.y = zm.y + 40;   
    }
    
}



class Foo
{
    int y = 20;
    
    
}