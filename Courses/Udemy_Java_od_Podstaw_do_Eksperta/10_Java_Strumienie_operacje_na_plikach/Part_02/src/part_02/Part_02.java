package part_02;

import java.io.*;

public class Part_02 {

	public static void main(String[] args) throws IOException {
		
	
		File plik = new File("nazwaPliku.txt");
	
		InputStream inS;
		OutputStream outS;
		
		Reader reader;
		/*
		 * 
		 * 
		 */
		Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(plik)));
		
	
		
		((BufferedWriter)writer).write("lala");
		
	    ((BufferedWriter)writer).newLine();
	    
	    ((BufferedWriter)writer).write("Nastêpna linia.");
	    ((BufferedWriter)writer).close();
		
		}
	
	void nazwaF (InputStream inS)
	{
		
	}

}
