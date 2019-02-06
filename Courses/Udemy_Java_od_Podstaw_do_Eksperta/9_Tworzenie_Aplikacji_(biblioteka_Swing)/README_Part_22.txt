PASEK NARZĘDZI I KURSORY:

Program tworzy aplikacje podobną do painta.
Dzięki temu programowi można zmieniać tło aplikacji.
Program używa równiez przycisków.


Program uczy:

I. Jak zmienić pasek narzędzi
	
	- JToolBar - klasa do tworzenia paska narzędzi
     	+ Zachowuje się odpowiednio do Layoutu
		+ Możemy dodawać przyciski za pomocą add
	
	1. Tworzymy klase do obsługi kliknięcia z 
		- opisem
		- ikonami
		- kolorem
		
	2. Tworzymy klase do tworzenia przycisków	
		- tworzymy konstruktor z nadklasy
		- tworzymy zdażenie które po wciśnięciu zmienia tło danego przycisku na kolor.
		
	3. Tworzymy metodę do ustawiania flagi
	
	- getComponent - pobiera komponent np. z paska narzędzi
	- getComponentCount - liczy komponenty np. na pasku narzędzi
	-  X instanceof Y - czy obiekt X nalezy do instancji klasy Y
	
	
II. Jak zmienić kursor na własny

- setCursor - ustawia kursor 


Tworzenie własnego kursora:

 panel.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(x, y, z)
 
 x - ikonka kursora
 y - punkt gdzie kilkamy
 z - nazwa kursorka