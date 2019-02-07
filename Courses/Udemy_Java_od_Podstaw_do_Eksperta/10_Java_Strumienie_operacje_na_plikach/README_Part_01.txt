PLIKI ORAZ KATALOGI:


Program:

- Wypisywanie alfabetycznie wszytskie katalogi wykonujemy za pomocą 
metody list, która zwraca tabele Stringów oraz przy wykorzystaniu instrukcji for.

-  Jeśli trafi na katalog to skorzysta z rekurencji, wejdzie do niego i wypisze ścieżki




File - klasa pliku pochodzi z biblioteki java.io.

- stworzenie obiektu pliku za pomocą metody 
Metody:

+ createNewFile()	-	tworzy nowy plik

+ canWrite()			-	sprawdza czy można czytać
+ canExecute()		-	czy mogę odpalić
+ canRead()			-	czy mogę czytać
+ isHidden()			-	czy jest ukryty
+ isFile()				-	sprawdza czy jest plikiem	
+length()				-	dlugosc pliku w bajtach

+ delete() 			-	usuwanie pliku

+ Date(plik.lastModified()) - ostatnia modyfikacja

Tworzenie katalogów:

1. Katalogi tworzymy za pomocą klasy File.
2. Tworzymy  grupe katalogów i podkatalaogów
Metody:

- mkdir()		-	metoda do tworzenia katalogu
- mkdirs()		-	tworzenie zestawu katalogów

- getPath()	-	pobierz scierzke (nazwe)
- getAbsolutePath() - pobierz absolutną sieżkę
- getCanonicPath()  - sciezka kanoniczna, zawsze proawdziwa

- list - zwraca nazwe plików


- getProperty() - tworzymy na klasie System, może pobierać np. obecną sieżke do folderu
	+ user.dir - aktualny folderu
	+ user.home - katalog domowy
	
	

File(x, y)

x - nazwa folderu, pliku, ścieżki
y - nazwa szykanego pliku

Program:

- Wypisywanie alfabetycznie wszytskie katalogi wykonujemy za pomocą 
metody list, która zwraca tabele Stringów oraz przy wykorzystaniu instrukcji for.

-  jeśli trafi na katalog to skorzysta z rekurencji, wejdzie do niego i wypisze ścieżki