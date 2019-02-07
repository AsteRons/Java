APLIKACJA Z WIELOMA RAMKAMI:

Program tworzy nowe ramki.

Aby stworzyć nową  ramke należy:
1. Stworzyć rakę w paku
2. Stworzyć przycisk do wywołania
3. Po wciśnięciu ustawić widocznosć ramki


- w ustawieniu ramki należy zmienić domyślną operacje zamykania na DISPOSE - zamknij i posprzątaj

- parent.getBounds().x - centrowanie o lokacje rodzica


Metoda:
- dispose() -  zamyka okienko
- System.exit(0) - zamyka program
- getBounds - pobiera rozmiary ramki


Java Dialog:

- tworzymy podobnie jak JFrame
- wykorzystuje klase JDialog
- nie ma minimalizacji
- nie ma maksymalizacji


 super(parent, true) - po wybraniu ramki nie mogę przejsć niżej, musze np kliknąć krzyżyk
 + np. java option  jak chcemy
 