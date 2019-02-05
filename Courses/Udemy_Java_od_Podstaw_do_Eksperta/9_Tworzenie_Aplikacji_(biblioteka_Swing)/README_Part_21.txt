OBSŁUGA ZDARZEŃ MYSZKI ORAZ MENU KONTEKSTOWE:

Menu kontekstowe - pokazuje się do konkretnego kontekstu

1. Tworzenie słuchacza myszki (addMouseListener) - mogę dodawać do wszystkiego

- buttona
- obszaru tekstowego
- all

Metody:

- mouseClicked() 		- kilknięcie
- mousePressed() 		- nacisk
- mouseReleased() 	- zwolnienie
- mouseEntered() 		- wyszedłem
- mouseExited()		 	- wyszedłem

Inne:
- getClickCount liczy kilknięcia

Klasa adaptacyjna MouseAdapter:

- JPopupMenu - tworzymy menu kontekstowe

+ Menu pojawia się w menu gdzie zostało wywołane i na obiekcie którym został wywołany
