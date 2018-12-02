Materia³: 


final - sta³a

Math.round() - zaokr¹glanie

 a= (int) b;- rzutowanie

equals - porównywanie stringów

equalsIgnoreCase - ignorowanie wielkoœci liczb

!= czy string jest w tym samym miejscu

s.length() - sprawdzanie d³ugoœci ³añcucha

s.charAt(n) - zwraca znak stringu na n pozycji

 
Sk³adanie ³añcucha z kilku czêœci
		
StringBuilder  buldier = new StringBuilder();	//Tworzenie nowego obiektu
buldier.append(s) 	- dodanie ³añcucha s
String completedString = buldier.toString() - zwraca string;




		// IN / OUT




Dane wyœwietlanie na konsoli:

System.out.println("Jak sie nazywasz"); - wyœwietla dane na konsoli


SCANNER


Odczyt danych z konsoli

Scanner in = new Scanner(System.in);   - inicjalizowanie klasy Scanner oraz jego konstruktora

String name = in.nextLine();		//Pobieranie linii
int age = in.nextInt();		        //Pobieranie liczb




SCANNER- nie nadaje siê do pobierania hase³.
Lepiej wykorzystaæ klase CONSOLE.	s.89

		Console cons = System.console();
		String username = cons.readLine("Nazwa u¿ytkownika");
		char[] passwd = cons.readPassword("Has³o: ");
		



// Formatowanie danych wejœciowych	s.91

		System.out.printf("%3.1f", ag);			- jak w C
