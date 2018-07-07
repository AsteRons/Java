/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klasaobiekt;

public class Punkt extends Object      
{
    private int x;
    private int y;
    
    Punkt(){   
    }
    
      Punkt(int x, int y)
    {
        this.x= x ;
        this.y = y; 
    }  
      
      int getX()
      {
         return x; 
      }
      
      
      int getY()
      {
         return y; 
      }
      
      
      public boolean equals(Object o)
      {
          if(o == null) // czy jest w zakresie lub rowny 0
              return false;
          if(this == o) // czy to jest obiekt
              return true;
          if(this.getClass() != o.getClass())   // czy obiekt jest tej samej klasy
              return false;
          
          
          Punkt przyslany = (Punkt)o;
          
          
          
          return (this.x == przyslany.x && this.y == przyslany.y);
      }
      
      
      
      
      public String toString(){
          
          return getX() + " " + getY();
      }
}
