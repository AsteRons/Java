ZIPPER INTERFEJSY:


Program:

I - dodaje pliki, foldery do listy
II - program usuwa pliki oraz foldery z listy
III - pakowanie folderow z listy do zipa


1. Tworzymy panel
2. Dodajemy przyciski do panelu
3. Dodajemy liste do panelu
4. Ustawiamy Layout na grupowy
5. Tworzymy menu oraz dodajemy go do panelu 

6. Dodajemy do przyciskow akcje dla nich
7. Tworzymy akcje dodawania, usuwania oraz zipowania
8. Tworzymy klase akcja do obslugi akcji kilkniec
	+ implementujemy interfejs
	+ pobieramy w konstruktorach nazwe, opis, skrot oraz ikonke oraz tworzymy obiekt
	+ po kliknieciu na dowolny przycisk pobieramy nazwe przycisku ktory zostal klikniety
	
9. Tworzymy metode
	
		I - Dodawania
		II - Usuwania
		III - Zipowania
		
		
		
I - Dodawania

1. Ustawia obecny katalog
2. Ustawia możliwosć wyboru plików i folderów
3. Ustawia mozliwość wyboru wielu plikow

4. Wyswietlaokna wyboru plikow
5. Jeśli zostanie wciśnięty akcept to:
	+ zostanie stworzona tablica na sciezki
	+ zostaja do niej wpisane zaznaczone sciezki
	+ zostaje stworzony model listy jako domyślny
      	- zostaje stworzona domyślna 
		- nadpisujemy metody dodania do listy
		- wziecia z listy
		- usuniecia z listy
		
	+ sciezki zostaja dodane do modelu listy
	+ zostaje sprawdzony czy sciezki sie nie powtarzaja 
	

II - Usuwania

1. Pobranie zaznaczonych elementow w liscie
2. Wykorzystanie pętli for i usuniecie plikow za pomoca nadpisanej metody remove


III - Zipowania


1. Ustawienie w wybieraczu aktualnej scieżki 
2. Wybranie zaznaczonych plikow, stworzenie pliku z podana sciezką
3. Stworzenie zostanie zostanie wcisnieci akcept to:
	+ Stworzenie tablicy dla buffora
	+ stworzenie pliku zipowego oraz przekierowanie tam strumien za pomoca buffora
	+ W pętli for:
	     Jeśli nie jest katalogiem:
		- za pomoca metody pakuje pliki do zipu
		Jeśli jest katalogiem:
		- tworzy liste ze sciezkami
		- zipuje ja za pomoca algorytmu do zipowania		
		- usuwa elementy ze sciezki 
		
		
		