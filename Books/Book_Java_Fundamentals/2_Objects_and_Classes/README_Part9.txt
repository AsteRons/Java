Pakiety:

-chęć uniknięcia kolizji nazw klas

Mozna sie dostać:

- pełna nazwa pakietu

java.until.LocalDate today = new java.time.Localdate.now();

-użycie import
* nie można importować wszystkich pakietów na raz np. java.*

Importowanie statyczne:

- zmniejsza przejzystość

Dodawanie klasy do pakietu:

- jesli nic nie ma metoda, kalsa itp. ma zaisęg pakietu
- najlepiej tworzyc w postaci JAR
- mają podobna postac co *.zip
- klasy niepubliczne można importowac z bierzącego pakietu
- kalsy publiczne można importowac z innych pakietów

Komentarze dokumentacyjne:

Komentarze kals:

- tworzenie za pomocą /**
- w tekście komentarza nalezy używać znaczników html

- komentarz klasy musi znajdowac się za instrukcjami import

	Komentarze do metod:
	- musi znajdowac się przed metoda która dotyczny
	
	Dodatkowe znaczniki:
	
	@parm opis zmiennej
	@return opis
	@throws opis klasy(wyjątki)
	
	
	Komentarze do pol:
	- proste zwykłe /**
	
	Komentarze ogólne:
	
 * @author Maciej Rundik - autor
 * @version 1.3			 - aktualna wersja
 * @since version 1.1	 - od której wersji
 * @deprecated Employee  - nie powinna być używana
 * @see 
 
 # - znak rozdzielający klase lub nazwe 
 
 
 Komentarze do pakietów:
  - utowrzyć plik html o nazwie package.html
  - utworzyć plik o nazwie package-info.java
  - utworzyć plik overview.html w katalogu macierzystym
  
  
  Generowanie dokumentacji:
  
  
 
Porady dotyczące projektowania klas:

- dane powinny być prywatne
- dane powinny być zawsze zainicjalizowane 
- nie nalezy stosować zbyt wielu rożnych podstawowych typów danych w jednej klasie
	(klase Customer można zastąpić klasa o nazwie Adress)
- nie wszytskie pola wymagają młasnych metod dostępu i zmian
	( nie np data zatrudnienia)
- klasy o zbyt dużej funkcjonalności powinny być dzielone
- nazwy metod i klas powinny odpowiadac ich przeznaczeniu
- preferuj klasy niezmienne
 (jesli klasa sa niezmienne można je wykorzystywać w wielu wątkach rownolegle)

	