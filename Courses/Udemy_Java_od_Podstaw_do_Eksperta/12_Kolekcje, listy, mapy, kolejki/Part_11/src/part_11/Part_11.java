package part_11;


import java.util.*;
import java.util.Map.Entry;




public class Part_11 {

	public static void main(String[] args) {
		
    LinkedHashMap<Integer, Pracownik> mapa = new LinkedHashMap(); //TreeMap
        
        Pracownik[] pracownicy =
        {
          new Pracownik("Agnieszka"),  
          new Pracownik("Bart³omiej"),
          new Pracownik("Aleksander"),
          new Pracownik("Arkadiusz"),
          new Pracownik("Agnieszka"),  
          new Pracownik("Bart³omiej"),
          new Pracownik("Aleksander"),
          new Pracownik("Arkadiusz"),
          new Pracownik("Agnieszka"),  
          new Pracownik("Bart³omiej"),
          new Pracownik("Aleksander"),
          new Pracownik("Arkadiusz"),
          new Pracownik("Agnieszka"),  
          new Pracownik("Bart³omiej"),
          new Pracownik("Aleksander"),
          new Pracownik("Arkadiusz"),
          new Pracownik("Agnieszka"),  
          new Pracownik("Bart³omiej"),
          new Pracownik("Aleksander"),
          new Pracownik("Arkadiusz"),
          new Pracownik("Agnieszka"),  
          new Pracownik("Bart³omiej"),
          new Pracownik("Aleksander"),
          new Pracownik("Arkadiusz"),
          new Pracownik("Agnieszka"),  
          new Pracownik("Bart³omiej"),
          new Pracownik("Aleksander"),
          new Pracownik("Arkadiusz"),
          
        };
        
        for (Pracownik pracownik : pracownicy)
            mapa.put(pracownik.getID(), pracownik);
        
        System.out.println(mapa);
        
        mapa.remove(3);
        
        System.out.println(mapa);    
        
        mapa.put(4, new Pracownik("Asia"));
        
        System.out.println(mapa);   
        
        mapa.put(3, new Pracownik("Kacper"));    
        
        System.out.println(mapa);   
        
        for(Entry<Integer, Pracownik> wpis: mapa.entrySet())
        {
            System.out.println("ID pracownika: "+wpis.getKey());
            System.out.println("Imiê pracownika: "+wpis.getValue().getImie());     
        }
        
        /*
         * A = {4,5,6,7,8}
         * B = {5,6}
         * */
       
        TreeMap<Integer, Pracownik> mapaPosortowana = new TreeMap<Integer, Pracownik>(mapa);		// sortowanie mapy
        
        
        Map<Integer, Pracownik> subMapa = mapaPosortowana.subMap(0, 11); // x nalezy <1,10> (0,11) I x nalezy do liczb naturalnych
        
        if (subMapa.isEmpty())
            System.out.println("PUSTO");
        else
         for(Entry<Integer, Pracownik> wpis: subMapa.entrySet())
         {
            System.out.println("ID pracownika: "+wpis.getKey());
            System.out.println("Imiê pracownika: "+wpis.getValue().getImie());     
         } 
		
        
        
		
	}

}
