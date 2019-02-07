ETYKIETY, ZEGAREK:

Etykiety - nazwa dla komponentu dodawana do szybki (JLabel)
	+ wygląda jak zwykły tekst na szybce
	+ dodaje sie go podobnie jak button
	
	JLabel - impl;ementuje sie go podobnie jak przycisk dodaje sie do panelu
	
	Zegarek:
	
	Program imituje zegar z wykorzystaniem nasłuchiwacza oraz pakietu event
		
	Wykorzystuje:
	1.  Stworzenie etykiety czas,
	2.  Stworzenie klasy wewnętrznej do nasłuchiwacza zegara
	3.  Wykorzystanie klasy Timer i stworzenie obiektu który się zmienia co 1s
		- wykorzystanie klasy Kalendarza Gragoriańskiego
			+ Program pobiera godzine, minute i sekunde z kalendarza oraz zamienia je na string
			+ program aby można było wyświetlać wartości pojedyńcze z 0 konwertuje wartości String na Int wykorzystując klase Integer oraz sprawdza czy wartość jest < 10
		
		
	4.  Aby przyspieszyć zadanie wykonywujące się w nasłuchiwaczu korzysta z metody stworzonej w klasie zewnętrznej
		+	Ta sama metoda jest wykorzystana w konstruktorze, pozwala to od razu wyświetlicz czas a nie jak do tej pory po 1s gdy wykonał się Nasłuchiwacz
	
	
		