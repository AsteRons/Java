/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginstanceof;


public abstract class Osoba {
    String imie;
    String nazwisko;
    
    Osoba(String imie, String nazwisko)
    {
       this.imie = imie;
       this.nazwisko = nazwisko;
    }
    
    abstract void pobierzOpis();
    
}
