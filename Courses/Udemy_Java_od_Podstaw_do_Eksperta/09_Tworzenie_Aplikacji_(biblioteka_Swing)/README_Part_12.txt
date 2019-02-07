OBSZAR TEKSTOWY, PRZESZUKIWANIE I PODMIENIANIE TEKSTU:

Opis:
Program znajduje w stringu okreslony tekst następnie może go zamienić
na inny wpisany na przez urzytkownika.
Po próbie zamienienia wyskakuje komunikat o chęci zmiany i zgodzie na nią.




- Tworzenie obszaru tekstowego
- Przeszukuje obszar tekstowy i ewentualnie zamienia tekst

Obszar tekstowy tworzymy za pomoca klasy:
- JTextArea

+ (Wygląda podobnie jak notatnik)

Klasa do tworzenia suwaka do przewijania: 
- JScrollPane

1. Stworzony obszar tekstowy dodajemu do konstruktora klasy JScrollPane
2. Obiekt stworzony przez klase JScrollPane dodajemy do panelu
3. Tak stworzony obszar możemy  na nim pisac o0gra go przewijac

	- w trakcie dodawania do panelu możemy ustawić layout
	- W trakcie tworzenia konstruktora obszaru tekstowego
		możemy ustawić liczbę kolumn i wierszy
		


Ciekawe metody na obszaże tekstowym:
- selectAll() - zaznacza wszytsko na obszarze tekstowym
- select(x, y) - zaznacza fragment tekstu
	x - początek
	y - koniec 
	
- replaceSelection(x) - zamienia zaznaczony fragment na x typu String

- replaceRange(x, y, z) - zamienia tekstod y do z na tekst x (String) 

- insert(x, y) - dodanie Stringa x od miejsca y
- append(x)		- dodaje na końcu obszaru tekst x o typie String

- select(x, y) - wyszukuje z naszego obszaru i zaznacza
	x (obszarTekstowy.getText().indexOf("test") - od początku napisu test pobranego z obszaru tekstowego
	y - do jakiego obszaru np. długośc tego tekstu
	
	Metoda do zaznaczania słówka "test":
- obszarTekstowy.select(obszarTekstowy.getText().indexOf("test"), obszarTekstowy.getText().indexOf("test")+ "test".length());

Tworzymy program do szukania wyrazów
1. Tworzymy przycisk szukaj
2. Tworzymy JTextField oraz ustawiamy jego wielkosć
3. Tworzymy nasłuchiwacz na to pole
4. Tworzymy metodę do wypisuwaniu numeru początku wpisanego tekstu do pola JTextField
5. Sprawdzamy czy w polu cos jest wpisane oraz czy długosć wpisanego tekstu jest większa od 0
6. Ustawienie skupienia na obszaze tekstowym
7. Zaznaczenie tekstu od poczatekSzukanego do poczatekSzukanego + długosć tekstu


indexOf(x, y) - działamy na tekście
x - podłańcuch do wyszukania
y - index od którego rozpoczyna się wyszukiwanie





Podmienia wyszukany tekst:

- do podmieniania tworzymy nowy przycisk, pole tekstowe oraz etykiete
- na przycisk nakładamy nasłuchiwacz
- tworzymy nową klase do nasłuchiwacza
	* w klasie dzieki metodzie replaceRange(x, y, z) zamieniamy zaznaczony tekst na tekst z obszaru tekstowego
	
	x - obszar tekstowy na który chcemy wstawić
	y - początek tekstu który mamy podmienic
	z - koniec tekstu który mamy podmienic
	
Metoda:
- doClick(x) - symyluje kliknięcie
	x - czas trwania kliknięcia
	
- JOptionPane.showConfirmDialog(rootPane, x, y , z);
	
	x - treśc komunikatu
	y - tytuł
	z - wartośc jaka wystąpi po wciśnięciu YES
	
- requestFocus - ustawia fokus


