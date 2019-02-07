DZIAŁANIA:

Program przypomina działanie notatnik.
Można w nim wpisywac oraz zapisywać tekst.
Pokazuje on jak wstawiać ikony, skróty klawiszowe.
Działa tylko do odczytu. Jedno działanie i kilka przycisków.


Przydatne metody:
- setToolTipText () - ustawienie podpowiedzi 
- setMnemonic(char) - ustawia skrót Alt + char
- setAccelerator() - ustawienie akceleratoru (czyli skrótu koło panelu)



1. Tworzymy obszar tekstowy 
2. Tworzymy elementy menu
3. Tworzymy mechanizm do zapisu
	+ Gdy jest puste nie da rady zapisać
	+ Nie da rady zapisać dwa razy tego samego elementu
	+ Wyspiuje na konsoli działąnie jak by się zapisywał
	+ Tworzymy przycisk zapisz działający tak jak ten w Menu

4. Tworzymy podpowiedzi
5. Tworzymy skrót dla zapisu (Ctrl + S)
6. Tworzymy akcelerator do przycisku Zapisz
7. Tworzy klase do obsługi interfejsu naciśnięcia przycisku
	+ Klasa ta jest podpięta do przycisku jak i do Menu
	+ Po naciśnięciu stan zmienia się w przycisku jak i w Menu
			
			W klasie ważna jest funkcja:
			this.putValue(Action.NAME, nazwa); - pobiera ona elementy i przypisuje im działanie powiązane z kluczem 

			Action.NAME - CIĄG IDENTYFIKUJĄCY PRZECHOWYWANY KLUCZ
			NAME - obiekt do przechowywania
			
			Moze przechowywać mp. Nazwy, podpowiedzi dla obiektów
			
8. Dodanie  do klasy zapisz ikony działającej na każdy przycisk
9. Dodanie do do klasy podpowiedzi
