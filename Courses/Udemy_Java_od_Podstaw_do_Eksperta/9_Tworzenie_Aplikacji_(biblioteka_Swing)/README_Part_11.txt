POLA TEKSTOWE, SYSTEM SCHOWEK, POCHŁANIANIE ZDARZEŃ

Opis:
W programie z uzyciem pomoca pola tekstowego mozna wpisywac cyfry;
	
	- program jest zabezpieczony przed wpisywaniem liter oraz kopiowaniem do niego
	elementów poprzez metode kopiuj oraz wpisywanie innych znaków niz cyfry
	

- Tworzenie pola tekstowego

Za pomoca TextField
1. Tworzymy za pomocą konstruktora
2. Dodajemy nasłychiwacz jak w przypadku zwykłego przycisku
3. Piszemy metodę która sprawdza czy liczba mieści się w przedziale 0-9
4. Sprawdzić kiedy osoba wkleja cos do schowka

isControlDown	-	sprawdza czy wciśnięty jest kontrol
e.getKeyCode() == KeyEvent.VK_V) - sprawdza czy wcisniety jest V
e.consume() 	- zabrania wykonywac operacji


	Jak obsługiwac schowek systemowy
	
ClipBoard - tworzymy schowek
1 .Pobieramy systemowy schowek ToolKit
	getSystemClipboard - pobierz systemowy schowek
	DateFlavor - smaczek plików
	DataFlavor.stringFlavor - smaczek, pliki mają byc typu stringFlavor
	
	schowek = (String)clipboard.getData(flawor); - skopiuj pliki ze schowka jesli sa typu string
	
	
2. Pozwoli to nam na kopiowanie stringow
	Aby sprawdzić by każda literka była liczba najezy sprawdzić ją w stringu za pomoca pętli for
	
	Za schowek.charAt(i) sprawdzamy każda litere w stringu
	gdzie i to interacja w pętli for
	jesli nie jest któryś znak literą to konsumuje za pomoca e.consume();
	a nastepnie przerywa trwanie pętli
	