Zapis i odczyt plik�w

		File plik = new File("pliknowy.txt"); 	 - tworzenie nowego pliku
		
		
		Korzystanie z wyj�tk�w:

		throws FileNotFoundException - koniecznos� skorzystania z wyj�tku
		
		
		
		
	    PrintWriter zapis = new PrintWriter("pliknowy.txt");		//zapis do pliku
		zapis.println("Ala ma kota, a kot ma Al�");
		zapis.close();
		
		
		
		