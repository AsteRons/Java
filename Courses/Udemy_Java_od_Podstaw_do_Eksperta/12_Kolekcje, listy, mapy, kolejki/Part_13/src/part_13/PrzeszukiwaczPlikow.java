package part_13;

import java.util.*;
import java.io.*;
import java.util.concurrent.*;

public class PrzeszukiwaczPlikow implements Runnable{

	BlockingQueue<File> kolejka;
	String szukaneSlowo;
	
	PrzeszukiwaczPlikow(BlockingQueue<File> kolejka, String szukaneSlowo)
	{
		
		this.kolejka = kolejka;
		this.szukaneSlowo = szukaneSlowo;
		
	}
	

	public void szukajSlowa(File przeszukiwanyPlik) throws FileNotFoundException
	{
	Scanner reader = new Scanner(new BufferedReader(new FileReader(przeszukiwanyPlik )));
		
	int numerLinii = 0;
	
	while(reader.hasNextLine())
	{
		numerLinii ++;
		if(reader.nextLine().contains(szukaneSlowo))
			System.out.println("Szukane slowo znajduje sie w" + przeszukiwanyPlik.getPath() + " w linii  " + numerLinii);
	}
	
	
	reader.close();
	}

	public void run() {
		
		
		boolean skonczone = false;
		while(!skonczone)
		{

			File przeszukiwanyPlik;
			try {
				przeszukiwanyPlik = kolejka.take();
				if(przeszukiwanyPlik.equals(new File("pusty")))
				{
					kolejka.put(przeszukiwanyPlik);
					skonczone = true;
				}
				else
				szukajSlowa(przeszukiwanyPlik);

				
				
			} catch (Exception  e) {
				
				e.printStackTrace();
			}
			
			
		}
		
	}

}
