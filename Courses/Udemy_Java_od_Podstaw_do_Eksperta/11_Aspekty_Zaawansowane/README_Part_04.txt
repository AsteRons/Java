SYNCHRONIZACJA WĄTKÓW:

Klasa:

Counter:

- Jest to klasa licznika
	+ Implementuje dwie metody zwiekszania, oraz pomniejszania o jeden
	+ ustawia poczatkowy licznik na 0
	

CounterRunnabe - jest to klasa z zimplementowaną klasa Runnable do pracy watkow

- tworzy konstruktor
- przyjmuje stale licznika oraz flage czy ma wystapiz zwiekszanie czy pomniejszanie
- program wykonuje sie 50 razy
- po kazdej iteracji odpoczywa 10ms
- jesli wystepuje prawda to dodaje, falsz odejmuje
- zadania wykonuja sie jako zsynchronizowane po liczniku

WypisanieRunnable:

- obrazuje pojedyńcze wykonanie synchronizacji licznika
- tworzemy oddzielny obiekt blokujacy i wpisujemy go do licznika

main

- tworzymy dwa watki a nastepnie wykonujemy zadanie

