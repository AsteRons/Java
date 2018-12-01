/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt_obiektowy;

/**
 *
 * @author Maciek
 */
public class Monitor {
    
    
    
    int szerokosc;
    int wysokosc;
    
   Monitor()
   {
   System.out.println("Wywolano konstruktor");
   szerokosc = 20;
   wysokosc  = 30;
   }
   
   
   Monitor(int szerokosc, int wysokosc )
   {
       this.szerokosc = szerokosc ; // odnosi sie do szerokosc jakiegoś konkretnego obiektu
       this.wysokosc = wysokosc;
       
   }
 

   void wypisz(String imie, String nazwisko)
   {
       System.out.println(imie + " " + nazwisko);
   }   

   int dodaj(int a, int b)      //funkcja zwraca wartosc int
   {
       return a + b ;   //zwracanie jak w C++
       // jesli tutaj bylaby jakas kod to nie wykona sie  
   }
   
      int dzielenie(int a, int b)      //funkcja zwraca wartosc int
   {
       if( b == 0) 
           return 0;
       
       else 
           return a / b;
   }
      
      
      // przeciążenie metody dzielenie 
      
    float dzielenie(float a, float b)      //funkcja zwraca wartosc float

         {
         if( b == 0) 
            return 0;
       
        else 
           return a / b;
        }
}
