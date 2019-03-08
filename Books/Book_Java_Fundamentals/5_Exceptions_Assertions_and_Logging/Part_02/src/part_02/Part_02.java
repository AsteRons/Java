package part_02;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Part_02 {

	
	public static void main(String[] args) {
		

		final Logger myLogger = Logger.getLogger("com.mycompany.myapp");
		myLogger.setLevel(Level.FINE);
		myLogger.info("To nie zadziala");
	}
}
