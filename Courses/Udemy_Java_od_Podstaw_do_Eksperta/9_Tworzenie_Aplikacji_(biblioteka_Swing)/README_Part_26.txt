WEWNĘTRZNE RAMKI:

- Jest to zwykła ramka, która znajduje się wewnątrz innej ramki

1. Taką szybke wkłąda sie w spencjalny panel zwany JDesktopPane
2. Wewnętrzną ramke tworzymy za pomoca klasy JInternalFrame
	+ dodajemy do panelu dekstop za pomocą add
	+ zachowuje sie jak zwykła ramka więć należy ustawić jej setVisible
	
3. Dodajemy nasłuchiwacz do wewnętrznej ramki.

	Metody:
- internalFrameOpened() 		-	Otwarcie
- internalFrameClosing()			-	Zamykanie
- internalFrameClosed()			-	Zamknięcie
- internalFrameIconified()		-  Minimalizacja
- internalFrameDeiconified()	-  Maksymalizacja
- internalFrameActivated()		-  Aktywacja 
- internalFrameDeactivated()	-  Dezaktywacja

- showInternalInputDialog - mozemy pobierać od użytkownika
