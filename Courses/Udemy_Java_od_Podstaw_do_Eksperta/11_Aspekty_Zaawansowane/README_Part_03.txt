ANIMACJA WIELOWATKOWA KROPELKI:

Program animuje poruszającą się kropelka
Animacja wykonuje sie w watkach, po nacisnieciu usun wszystkie kropelki zostaja usuniete
W każdej chwilki można wyjsc
W kazdej chwili można dodac nowa kropelke

1. Nowe wątki tworzymy za pomocą nowej klasy Thread
2. Dodajemy do stworzonego obiektu Interfejs Runnable a następnie implementulemy metode run
	+ W metodzie tej korzystamy z wyjatkow
	- Po wystąpieniu wyjątku(zatrzymanie grupy) 
		+ Zostaje czyszczona lista kropelek
		+ Następuje ponowne odrysowanie
	
3. Do metody run dodajemy proces tworzenia kropelek
4. Animacje kropelek wykonujemy w pętli while why byla nieskonczona a następnie 
	+ ponownie odrywowywujemy z pomocą metody repaint()
5. Dodajemy grupe wyjatkow za pomoca klasy ThreadGroup
6. Każdy stworzony wątek dodajemy do grupy
7. Ustwiamy metode list aby wyswietlac informacje o watku (przydatne do debugowania)
8. Tworzymy przycisk Usun
9. Implementujemy mu metode stop
10. Wykonujemy metode stop z panelu animacji
11. W metodzie tej zatrzymyjemy grupe wątkow

