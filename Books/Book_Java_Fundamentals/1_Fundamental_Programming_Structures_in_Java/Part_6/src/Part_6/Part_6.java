package Part_6;

public class Part_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Wywo³anie
// java Part_6 -g -okrutny - swiat
		
		if(args[0].equals("-h"))
			System.out.println("Witaj");
		else if(args[0].equals("-g"))
			System.out.println("¯egnaj");
		
		for(int i  = 1; i< args.length; i++)
		{
			System.out.print(" " + args[i]);
			
		}
		
	}

}
