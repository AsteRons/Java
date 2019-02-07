TOKENIZACJA STRINGÓW:

Zapis danych do pliku oraz ich odczyt

	- klasa reprezentująca towar
	- zapis i odczyt z pliku 
	
Token - żeton ( dzielimy na elementy)
 
 Ustawiamy zapis do pliku:
 
 - PrintWriter 	-	tworzymy klase do otwierania pliku
 
 1. Ustawiamy pierwszą linijke ile jest obiektów.
	+	dodajemy za pomocą metody: zapiszDoPliku
	
 2. Ustawienie tokenizacji czyli znaczników np. |


	Ustawiamy odczyt z pliku:
	- odczytujemy przez BufferedReader
	
 
 Wybranie StringTokenizer:
 
 - tokeny działa na określonym rekordzie danych
 - StringTokenizer(x, y)
	x 	-	linia
	y - ustawiamy token np. |
	
	+ pobiera dane za pomocą token.nextToken();
	+ tokeny po pobraniu należy przekonwertować na liczne np. Integer albo Double
	