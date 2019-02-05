ZDARZENIA OKNA:

Program do obsługi okien

1. Wykorzystuje interfejs WindowListener
Tworzy metody:

- windowOpened() - metoda zostanie wywołana wtedy gdy zostaie otwarte okno

- windowClosing() - metoda zostaje wywołana w trakcie zamykania okna

	showConfirmDialog - panel zamykania YES/NO/CANSEL
	YES - 0
	NO - 1
	CANSEL - 2
	
- windowClosed() - metoda ma się wykonać po zamknięciu

- windowIconified() - po zminimalizowaniu

- windowDeiconified() - metoda po zmaksymalizowaniu
	
- windowActivated() - metoda do pracy
	
- windowDeactivatedmetoda() -  gdy idzie w tło



2. Opcje dodatkowe

- showMessageDialog(rootname, "wiadomosć") - pokazuje wiadomosć

- this.dispose() - metoda wyłącz i posprzątaj

3. Windows Adapter

Klasa: WindowAdapter - klasa adaptacyjna dla Window Listener
	- dzięki jej mozemy wybierać te metody, które nas interesują
	

