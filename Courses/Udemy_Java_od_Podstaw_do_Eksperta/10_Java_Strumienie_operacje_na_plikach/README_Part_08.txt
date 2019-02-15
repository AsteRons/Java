ARCHIWIZACJA DANYCH, KOMPRESJA ZIP:

Program pobiera dane oraz pakuje je do pliku za pomoca zipa.


- jak stworzyc wlasny plik zip i do niego cos wrzucic
- kompletne dane ktore sie porzadkuje w jednym miejscu

1. Aby stworzyć plik zip musimy użyć klasy ZipOutputStream.
	+ Tworzy ona plik zip z wykorzystaniem bufora
	+ Pobieramy strumien pliku, ktory chcemy wrzucić do archiwum do bufora

	-	FileOutputStream - otwieramy plik, przy pomocy binarnej
	-	BufferedOutputStream - dzieje sie szybciej 
	-	ZipOutputStream - strumien typu 
	
	
	Tworzymy strumien danych ktosy bedziemy zapisywac
	-	BufferedInputStream
	-	FileInputStream - strumien do czytania danych ktore bedziemy zapisywac
	- podajemy wielkosc bufera
	
2. Dodajemy dokument do pliku Zpi za pomocą putNextEntry i  klasy ZpiEntry

	-	putNextEntry - wpisujemy plik do pliku zipowego
	
	- counter - liczy ile bitow do nastepnego bufora