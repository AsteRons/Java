ZAPIS I ODCZYT - SFORMATOWANY TEKST:

- w jaki sposób zapisać oraz odczytać coś z pliku

Klasa do pisania plików:

+ PrintWriter  - drukuje reprezentacje obiektu 
 - do zapisywania czegoś na obiekcie, możemy wykorzystać metodę print();
 
 
 new FileWriter(x , y)

x - nazwa pliku String
y - true/flase - czy do pliku można dopisywać czy tworzyć go jeszcze raz 
 
 + Po wykonaniu jezcze raz programu plik zostanie zresetowany ( usunięte zostaną elementy)
 
 - close()  - strumień należy zamykać ponieważ, mozę z buforu nie wszystko zostanie zapisane
 - flush() - opróżnia i zapisuje bufor ( np. dobre jak wystąpi błąd)
 
 Możemy zakmknąć a następnie ponownie otworzyć plik i napisać coś.
 
 - append()    - dodanie stringa do łańcucha znaków
 - printf()   	- 	dodawanie do pliku elementów podobnie jak w C
				   + 
				   
				   
	Odczyt z pliku:
	
	BufferedReader - wykorzystujemy klase ( tworzymy w nim obiekt)
	
	Metody:
	
	- read()        - czytanie po jednym znaku ( należy zrzutować na char)
	- readLine()  - czytanie po całej linijce, gdy dojdzie do końca wysyła null
	
	- program wczytuje i zapisuje na ekran dane z pliku tekstowego
	