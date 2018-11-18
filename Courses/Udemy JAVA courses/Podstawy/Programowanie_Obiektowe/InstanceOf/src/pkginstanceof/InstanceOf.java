
package pkginstanceof;


public class InstanceOf {

    public static void main(String[] args) {
       
       Osoba[] osoba = new Osoba[4]; //rezerwacja a nie wywołąnie konstruktorów
       

       osoba[0] = new Pracownik("Arkadiusz", "Włodarczyk", 10000);
       osoba[1] = new Student("Jan", "Nowak");
        
//       for(int i = 0; i< osoba.length; i++)
//       {
//           if(osoba[i] instanceof Osoba) //sprawdza czy osoba[] jest instancja klasy Osoba
//           osoba[i].pobierzOpis();
//    }



//for (Osoba person: osoba)   //lepsza wersja
//  {  if (person instanceof Osoba)
//        person.pobierzOpis();
//           else
//               break;
// }


// RZUTOWANIE W DOL   - rzutuje superklase do klase nizej polozonej np Osoba -> pracownik
   
for (Osoba person: osoba)   //lepsza wersja
{   if ( person instanceof Pracownik )
    {
    ((Pracownik)person).pobierzOpis();  //Rzutowanie w dol - Konwersja Osoba-> Pracownik jak w C++
    }

}
    
}
}
