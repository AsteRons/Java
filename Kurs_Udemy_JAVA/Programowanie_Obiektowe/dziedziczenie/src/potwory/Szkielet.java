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
public class Szkielet extends Potwory
{
    public void atakuj() // nadpisanie Ataku
    {
        super.atakuj();
        System.out.println("ATAK Szkielet ");
    }
    
    
    
    String typBroni  ;
public Szkielet()
{
   
    System.out.println("Domyslny konstruktor z klasy szkielet");
}
 

public Szkielet(double predkoscChodzenia, double zywotnosc)
{
    super(predkoscChodzenia, zywotnosc);
    System.out.println("Nie domyslny konstruktor z klasy szkielet z 2 argumentami");
}

public Szkielet(double predkoscChodzenia, double zywotnosc, String typBroni)
{
    
super(predkoscChodzenia, zywotnosc); // przesłanie wartosci do klasy nadrzędnej do konstruktora
this.typBroni = typBroni;
System.out.println("Nie domyslny konstruktor z klasy szkielet");
}


void opis() // musi byc zaimplementowana abstrakcujna metoda
{
    
}


}
