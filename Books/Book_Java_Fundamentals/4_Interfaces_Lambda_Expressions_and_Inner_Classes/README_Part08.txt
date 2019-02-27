KLASY POŒREDNIE:

- tworzenie w trakcie dzia³ania programu nowych klas implementujacych okreslone interfejsy

powinny zawieraæ:
- wszystkie metody wymagane przez okreœlone interfejsy
- wszytskie metody zdefiniowane w klasie object(to string, equels, itp)

- kiedy bna rzecz obiektu klasy posredniej wywolywana jest metoda,
nastepuje wywolanie metody invoke


Tworzenie obiektów:
- do tworzenia obiektow klasy posredniczacych sluzy metoda newProxyInstance klasy Proxy

+ przyjmuje parametry:
	- mechanizm ³adowania klasy 
	- tablica obiektow klasy 
	- obiekt obslugujacy wywolanie
	
	Wykorzystanie:
	- przekazywanie wywolan metod do zdalnych serwerow
	- laczenie zdarzen interfejsu uzytkownika z akcjami w programie
	- sledzenie wywolan metod
	
	Program sledzenia wyszukiwania binarnego wykorzystanie klasy poœredniej w
	