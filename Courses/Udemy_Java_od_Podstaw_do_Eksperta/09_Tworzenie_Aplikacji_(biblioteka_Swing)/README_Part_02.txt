CENTROWANIE RAMKI:

- w jaki sposób wycentrowac ramkę w zależności od rozdzielczości

1. Stworzenie ramki,
	- Pobranie domyslnej rozdzielczości monitora
	
	Toolkit.getDefaultToolkit().getScreenSize() - zwracana za pomocą obiektu Demonsion
	
	- Ustawienie okna na połowe ekranu
	 + metoda: setSize()	 -	ustawia rozmiar
	 + metoda: setLocation() -	ustawia lokacje punktu
	 
	 
2. Napisanie uniwersalnego programu, który zawsze wyśrodkuje ramkę
	niezależnie od jej wielkości
	
	
