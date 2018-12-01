/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dziedziczenie;
import potwory.Potwory;
import potwory.Szkielet;
import potwory.Zombie;

public class Dziedziczenie {

    public static void main(String[] args) {

        
//      DZIEDZICZENIE


        // super() - przesłanie wartosci do klasy nadrzędnej do konstruktora
 /* 
        Potwory p = new Potwory(10, 100);
        
        System.out.println(p.predkoscChodzenia);
        
        
        Szkielet s = new Szkielet(10, 50, "Łuk");
        System.out.println(s.predkoscChodzenia);
        System.out.println(s.zywotnosc);
        Zombie z = new Zombie();
        s.atakuj();
*/
 
//       POLIMORFIZM 

 /*
       //Polimorfizm - wieleform przy pomocy nazwy odwołujemy sie do wielu nazw
       Potwory p = new Szkielet(10, 100);   // tworzymy instancje szkieleta i potwora
       Potwory p2 = new Zombie(); // polimorfizm tworzymy zombie w potworze 
       p.atakuj();
*/
 
 // PRETECTED - dziedziczy ale nic więcej 
 
 //KLASA ABSTRAKCYJNA  - np. Potwory
 
 
 // Potwory p = new Potwory(10, 100); - Błąd klasa abstrakcyjna
 // Potwory p = new Szkielet() - można !!!
    
    }
    
    
    
    
    void Lokacja(Potwory potwory)
    {
        // Moge tutaj przesłać i Szkieleta i Zombie dzięki poliforfizmie 
        
    }
}
