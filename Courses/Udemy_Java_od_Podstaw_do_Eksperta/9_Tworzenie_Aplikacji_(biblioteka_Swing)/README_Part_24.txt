SPINNERY:

Program jest przypomina program ustawiania godziny w Windowsie.
Mozemy ustawić godzine oraz wyjaśnia zasadę działania Spinnerów.


Spinner - komponent np. do zmieniania godziny

Tworzymy Spinner za pomocą klasy JSpinner.
- Możemy stworzyć Spinner w listach za pomocą klasy SpinnerListModel.


Tworzymy Stringa z miesiącami ->  SpinnerListModel -> JSpinner

Tworzymy prosty kalendarz:

- Tworzymy klase łańcuchową String
- Dodajemy do niej liste miesięcy za pomocą:
	+ klasy DateFormatSymbols() oraz metody getMonths()
	
SpinnerNumberModel(x, y, z, a) - klasa do Spinnera liczb

	x - od jakiej zaczyna
	y - min
	z - max
	a - co ile ma skakać
	
	spinner.setEditor(new JTextArea("Tekst")); 
	
	- tworzy obszar tekstowy oraz wpisuje tam  "Tekst"


	SpinnerDateModel()	-	tworzy obiekt spinera z datą
	
	Możemy go następnie dodać do Spinnera.
	
	
	Tworzymy kalendarz podobny jak jest w pasku zadań.
	
	1. Tworzymy metode do własnej listy Spinnerów
		+ tworzymy metody do przesuwania w :
		 - getNextValue - Przód
		 - getPreviousValue - w tył