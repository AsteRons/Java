
package klasywewnetrzne;



public class Klasywewnetrzne {


    public static void main(String[] args) {
     
      KontoBankowe kontoBankowe = new KontoBankowe(1000);
      
      System.out.println(kontoBankowe.getStanKonta());
      kontoBankowe.start(5);    
      System.out.println(kontoBankowe.getStanKonta());
      
      
      
    }
    
}



