Materia�: 


final - sta�a

Math.round() - zaokr�glanie

 a= (int) b;- rzutowanie

equals - por�wnywanie string�w

equalsIgnoreCase - ignorowanie wielko�ci liczb

!= czy string jest w tym samym miejscu

s.length() - sprawdzanie d�ugo�ci �a�cucha

s.charAt(n) - zwraca znak stringu na n pozycji

 
Sk�adanie �a�cucha z kilku cz�ci
		
StringBuilder  buldier = new StringBuilder();	//Tworzenie nowego obiektu
buldier.append(s) 	- dodanie �a�cucha s
String completedString = buldier.toString() - zwraca string;




		// IN / OUT




Dane wy�wietlanie na konsoli:

System.out.println("Jak sie nazywasz"); - wy�wietla dane na konsoli


SCANNER


Odczyt danych z konsoli

Scanner in = new Scanner(System.in);   - inicjalizowanie klasy Scanner oraz jego konstruktora

String name = in.nextLine();		//Pobieranie linii
int age = in.nextInt();		        //Pobieranie liczb




SCANNER- nie nadaje si� do pobierania hase�.
Lepiej wykorzysta� klase CONSOLE.	s.89

		Console cons = System.console();
		String username = cons.readLine("Nazwa u�ytkownika");
		char[] passwd = cons.readPassword("Has�o: ");
		



// Formatowanie danych wej�ciowych	s.91

		System.out.printf("%3.1f", ag);			- jak w C
