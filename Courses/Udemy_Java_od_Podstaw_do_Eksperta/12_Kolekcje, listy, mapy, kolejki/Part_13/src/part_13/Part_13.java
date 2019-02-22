package part_13;

import java.util.*;
import java.io.*;
import java.util.concurrent.*;


public class Part_13 {

	final static File sciezkaGlowna = new File(System.getProperty("user.dir"));
	final static private String slowoSzukane = new String("Ÿród³o");
	
	
	
	
	public static void main(String[] args) {
	
		
		BlockingQueue<File> kolejkaBlokujaca = new ArrayBlockingQueue<File>(5);
        
        new Thread(new PoszukiwaczSciezek(kolejkaBlokujaca, sciezkaGlowna)).start();
        
        for (int i = 0; i < 50; i++)
            new Thread(new PrzeszukiwaczPlikow(kolejkaBlokujaca, slowoSzukane)).start();
        
        
    }

}
