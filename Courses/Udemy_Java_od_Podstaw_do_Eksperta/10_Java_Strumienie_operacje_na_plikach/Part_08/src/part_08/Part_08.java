package part_08;

import java.io.*;
import java.util.zip.*;


public class Part_08 {

	public static final int BUFFOR = 1024; 
	
	public static void main(String[] args) {

		String[] tab = new String[] {"build.xml", "manifest.mf", "inny.txt", "obrazek.jpg" };
		byte tmpData[] = new byte[BUFFOR];
		try {
			
			ZipOutputStream zOutS = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream("nazwamojegozipa.zip"), BUFFOR));
			
			for(int i = 0; i < tab.length; i++)
			{
						BufferedInputStream inS =  new BufferedInputStream(new FileInputStream(tab[i]), BUFFOR);
			
			
			zOutS.putNextEntry(new ZipEntry(tab[i]));
			int counter;
			
			while((counter = inS.read(tmpData, 0, BUFFOR))  != -1)
			{
				zOutS.write(tmpData, 0, counter);
			}
			
			zOutS.closeEntry();
			inS.close();
			}
			

			zOutS.close();
			
		} catch (IOException e) {
			
			System.out.println(e.getMessage());
			
		}

		
		
	}

}
