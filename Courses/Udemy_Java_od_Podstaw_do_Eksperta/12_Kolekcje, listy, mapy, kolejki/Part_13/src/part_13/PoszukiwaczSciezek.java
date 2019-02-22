package part_13;


import java.util.*;
import java.io.*;
import java.util.concurrent.*;

public class PoszukiwaczSciezek implements Runnable{

    BlockingQueue<File> kolejka;
    File sciezkaGlowna;
    public PoszukiwaczSciezek(BlockingQueue<File> kolejka, File sciezkaGlowna)
    {
        this.kolejka = kolejka;
        this.sciezkaGlowna = sciezkaGlowna;
    }
    public void run()
    {
       try
       {
           szukajSciezek(sciezkaGlowna);
           kolejka.put(new File("pusty"));
       }
       catch(Exception ex)
       {
           ex.printStackTrace();
       }
    }
    public void szukajSciezek(File sciezka) throws InterruptedException
    {
        File[] sciezki = sciezka.listFiles();
        
        for (int i = 0; i < sciezki.length; i++)
            if (sciezki[i].isDirectory()) 
                szukajSciezek(sciezki[i]);
            else
                kolejka.put(sciezki[i]);
    }

	
}
