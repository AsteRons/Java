package part_09;

import java.io.*;
import java.util.zip.*;


public class Part_09 {

	public static int BUFFOR = 1024;

	public static void main(String[] args) {
		
		File katalog = new File(System.getProperty("user.dir") + File.separator + "nazwamojegozipa");
		
		
		ZipEntry wpis = null;
		byte[] tmpData = new byte[1024];
		
		
		try {
			
			if(!katalog.exists())
			katalog.mkdir();
			
			
			ZipInputStream zInS = new ZipInputStream(new BufferedInputStream( new FileInputStream("nazwamojegozipa.zip"), BUFFOR));
			
			
			while((wpis = zInS.getNextEntry()) != null)
			{
				
				BufferedOutputStream  fOut = new BufferedOutputStream(new FileOutputStream(katalog + File.separator + wpis.getName()), BUFFOR);
				
				int counter;
				while((counter = zInS.read(tmpData, 0, BUFFOR)) != -1)
					fOut.write(tmpData, 0, counter);
				
				fOut.close();
				zInS.closeEntry();
			}
			
			
			zInS.close();
			
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
