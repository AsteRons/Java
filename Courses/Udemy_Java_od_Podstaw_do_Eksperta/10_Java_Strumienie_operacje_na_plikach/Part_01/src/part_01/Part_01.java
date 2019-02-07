package part_01;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Part_01 {

	public static void main(String[] args) {
		
		File plik = new File("test.txt");
		File katalog = new File("katalog");
		
		File katalogi = new File ("video kursy" + File.separator + "php" + File.separator + "msql");
		
		
		
		
		
		
		katalog.mkdir();
		katalogi.mkdirs();
		
		if(!plik.exists())
			try {
		
				
				File plik2 = new File ( "video kursy" + File.separator + "php" + File.separator + "msql" , "Lekcja1.txt");
				
				if(!plik2.exists())
					plik2.createNewFile();
				
				
				plik.createNewFile();
				
			} catch (IOException e) {
				
				System.out.println(e.getMessage());
				
				
			}
			
		System.out.println(System.getProperty("user.dir"));
		
		System.out.println(plik.getAbsolutePath());
		
		
			System.out.println("Czy moge pisac? : " + plik.canWrite());
			System.out.println("Czy moge odpaliæ? : " + plik.canExecute());
			System.out.println("Czy moge czytac? : " + plik.canRead());
			System.out.println("Czy jest ukryty? : " + plik.isHidden());
			System.out.println("Ostatnia modyfikacja: " + new Date(plik.lastModified()));
			System.out.println("D³ugoœæ pliku w bitach (il. znaków): " + plik.length() );
			
			
			
			Part_01.wypiszSciezki(new File( System.getProperty("user.dir")));
			// plik.delete();
			
			
	}
	
	
	public static void wypiszSciezki(File nazwaSciezki)
	{
		
	String[] nazwyPlikowIKatalogow =	nazwaSciezki.list();
	System.out.println(nazwaSciezki.getPath());	
	
	for(int i = 0; i < nazwyPlikowIKatalogow.length; i++)
	{
		File p = new File(nazwaSciezki.getPath(), nazwyPlikowIKatalogow[i]);
		
		
		if(p.isFile())
		System.out.println(p.getPath());
	
		if(p.isDirectory())
			wypiszSciezki(new File(p.getPath()));
	
	}
	
	}

}
