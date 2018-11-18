/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package referencja;


public class Referencja {


    public static void main(String[] args) {
       
        //PART 1        35
        
        /*
        int a = 40;
        System.out.println(a);
        Test x = new Test(); // pod x nie znajduje sie zadna wartosc zwykla tylko adres 
        Test y = x;
        y.a = 30;
        System.out.println(x.a); // zmienia BO REFERENCJA (ADRES)
        String imie = "Arkadiusz";
        String imie2 = imie; // String imie2 = new String(imie);
        imie2 = "asd";
        
        System.out.println(imie); // Arkadiusz
      */
        
       // PART 2        36
        
        /*
       int a = 5;
       TestReferencja x = new TestReferencja();
       a =  x.zmiennaWartosc(a);
       
       System.out.println(a);
       
       Foo foo = new Foo();
       
       x.zmienZawartosc(foo);
       
       System.out.println(foo.y);
       */
        
        //Part 3  Porównywanie String
        
        String imie= "Arkadius";
        String imie2= "Arkadius"; // przypisuje do jednego adresu
        if(imie == imie2) // porownuje adresy nie stringi
            System.out.println("sa rowne");
        if(imie.equals(imie2))      //tak sie porownuje
            System.out.println("sa rowne");
        
    }
    
}
