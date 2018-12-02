Zapis i odczyt plików

		File plik = new File("pliknowy.txt"); 	 - tworzenie nowego pliku
		
		
		Korzystanie z wyj¹tków:

		throws FileNotFoundException - koniecznosæ skorzystania z wyj¹tku
		
		
		
		
	    PrintWriter zapis = new PrintWriter("pliknowy.txt");		//zapis do pliku
		zapis.println("Ala ma kota, a kot ma Alê");
		zapis.close();
		
		
		
		