Parametry wiersza poleceñ:

// Wywo³anie
// java Part_6 -g -okrutny - swiat
		
	Wykorzystanie przychodz¹cych danych w programie
	
	
	
			if(args[0].equals("-h"))
			System.out.println("Witaj");
		else if(args[0].equals("-g"))
			System.out.println("¯egnaj");
		
		for(int i  = 1; i< args.length; i++)
		{
			System.out.print(" " + args[i]);
			
		}
		
		