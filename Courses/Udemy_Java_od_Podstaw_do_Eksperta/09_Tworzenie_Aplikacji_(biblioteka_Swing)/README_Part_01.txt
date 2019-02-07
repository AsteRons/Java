STWORZENIE RAMKI (JFRAME):

Plik Main.java - pokazane jak kiedys sie tworzyło ramki
					+ podejście niepoprawne ale pokazuje zasade działania


- pakiet javax.Swing.*; - pakiet do tworzenia ramek itp.
- pakiet awt -abstract java toolkit / abstrakcyjne narzedzia do tworzenia aplikacji


1. Tworzymy okiekt ramki
	+ JFrame
	
2. Uwidocznienie ramki (domyslnie najmniejszego rozmiaru)

	 Metoda:
	+ setVisible - ustaw na true to pokarze
	
3. Operacja zamknięcia ramki - do głównej ramki dajemy 3


	EXIT_ON_CLOSE = 3 			- zamyka po zamknięciu (najszybsze)
	DISPOSE_ON_CLOSE = 2 		- sprząta po zamknięciu
	HIDE_ON_CLOSE = 1 			- ukrywa ramke
	DO_NOTHING_ON_CLOSE = 0 	- nic nie robi podczas zamykania (domyslnie)
	
4. Nadanie tytułu ramce

	Metoda:
	+ setTitle
	
	- Możemy nadac przez konstruktor JFrame
	
Ustawianie ramki:
	
5. Ustawienie wielkosci ramki
	Metoda:
		
    + setSize(a, b) - za pomocą metody
	
	+ setSize(new Demension(a, b)) - za pomoca obiektu Wymiar
	
6. Ustawienie lokacji

	Metoda:
	
	+ setLocation(x, y)
	
	x - tak jak normalnie
	y - + w dół, - w górę
	
	
	+ setLocation(new Point(100, 50)) - za pomocą obiektu Punkt
	
7. Ustawianie od razu ramki we właścimym miejscu
	(ustaw granice naszej ramki)
	
	Metoda:
	+ setBounds
	
8. Ustawienie aby nie dało się ruszać ramki
	Metody:
	
	+ setResizable	// true - da rade ruszać, false - nie można ruszać
	
9. Ustawianie ikonki 
	Metody:
	+ setIconImage(Toolkit.getDefaultToolkit().getImage("ikonka.jpg"))
	
	- wykorzystuje womyslny zestaw narzedzi toolkit i wstawia obrazek
	
	
	
Plik Ramka.java

+ pokazuje jak sie powinno tworzyc ramki
	
1.	Tworzenie ramki jako dziedziczenie po klasach i działanie na konkretnym obiekcie

2.	Pozwala komponentom aby zostały szybciej spakowane w czasie kompilacji(program działa szybciej).
	Metoda:
 
	pack()
	

	