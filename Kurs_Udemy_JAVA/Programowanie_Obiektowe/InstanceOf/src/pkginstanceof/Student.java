
package pkginstanceof;

public class Student extends Osoba
{
    
    
    
      Student(String imie, String nazwisko)
    {
       super(imie, nazwisko);
    }  
          void pobierzOpis()
    {
        System.out.println("Student: "+ imie +" "+ nazwisko);
    }
}
