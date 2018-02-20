
package butelka_cwiczenie;


public class Butelka_Cwiczenie {
    
    private double ileLitrow;
    private final double pojemnosc = 50;
    
            Butelka_Cwiczenie()
                {
                        
                }
                   
           Butelka_Cwiczenie(double ileLitrow)
           {
               this.ileLitrow = ileLitrow;
           }
           double getIleLitrow()
                   {
                       return ileLitrow;
                   }
                  
           void wlej(double ilosc)
           {
               if(this.pojemnosc  > ilosc)
               this.ileLitrow += ilosc;
               else
                   this.ileLitrow = this.pojemnosc;
               
               
           }
   
           boolean wylej( double ilosc)
           {
               if(ilosc < ileLitrow)
                  this.ileLitrow -=ilosc;
               else
                   return false;
               
               return true;
           }
           
           
           void przelej(double ilosc, Butelka_Cwiczenie gdzie)
           {
              if(this.wylej(ilosc)) 
              {
                  gdzie.wlej(ilosc);
              }
              else
                  System.out.println("Za mało");
           }
           
           
    public static void main(String[] args) {
        
       Butelka_Cwiczenie[] Butelka_Cwiczenie = new Butelka_Cwiczenie[3]; //NULL
       
       for(int t = 0; t < 3; t++)
       {
           Butelka_Cwiczenie[t] = new Butelka_Cwiczenie(t+10);
       }
       
       Butelka_Cwiczenie[0].wlej(150);
       Butelka_Cwiczenie[0].przelej(4, Butelka_Cwiczenie[1]);
       
       for(int t = 0; t < 3; t++)
       {
           System.out.println( Butelka_Cwiczenie[t].ileLitrow);
       }
        
        
    }
    
}
