package Part_4;
import java.math.*;
import java.util.*;

public class Part_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		read_ss:
		for( int i=0; i<10; i++)
		{
			
			if(i<1) continue;
			if(i<5) break;
			
			if(i == 10) break read_ss;
		}
	
	
	
	BigInteger a =BigInteger.valueOf(100);
	BigInteger b = a.add(a);		//dodawanie
	BigInteger d = b.multiply(a.add(BigInteger.valueOf(2)));	//s114
	
	
	
	
	}

}
