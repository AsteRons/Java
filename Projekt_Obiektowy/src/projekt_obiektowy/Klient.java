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
public class Klient {
    Klient(String imie)
    {
    this.imie = imie;
    
    id = nastepnieId; 
    nastepnieId++;
      }
    String imie;
    int id;
    static int nastepnieId = 0;
}
