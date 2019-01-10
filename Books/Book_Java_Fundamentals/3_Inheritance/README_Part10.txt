Hierarchia dziedziczenia:

- nie dotyczy tylko jednego poziomu klas
- nie obsługuje dziedziczenia wielokrotnego

Polimorfizm:

- każdy obiekt nadklasy jest obiektem podklasy
- zmienne obiektowe sa polimorficzne
- zmienne profektowe sa polimorficzne


Zasada wywoływania metod:

Wyłącznie dziedziczenie - klasy i metody finalne

Klasa finalna:
- aby nie tworzyć podklasy innej klasy
  * są to klasy finalne
  
Metoda finalne:
- nie można jej przysłonić 
 
Pola finalne:
- nie mogą być zmienne po utworzeniu obiektu

Rzutowanie:

	B staff = new B();
	A boss = (A) staff
	
	instanceof - sprawdzxa czy rzutowanie sie powiedzie
	
	
	Uwagi:
	- rzutowanie jest możliwe w obrebie hierarchii dziedziczenia
	- przy rzutowaniu nadklasy na podklase trzeba skorzystac z instanceof
	- nalezy uważac i bardzo ogranicznac rzutowanie

Klasy abstrakcyjne:

- podstw do tworzenia innych klas
- klasa abstrakcyjna
- metody abstrakcyjne pełnią rolę symbolu zastępczego metody, które są implementowane w podklasie
- Obiekt Person tworzona ze studenta
