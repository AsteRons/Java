Pola i metody statyczne:

modyfikator static

- mo�e by� tylko jeden taki w plasie
- pole dzielone przez wszystkie obiekty danej klasy

stctic - pole wsp�ne dla obiekt�w danej klasy
  
  - Pola statyczne
  
  *  mo�e istnie� tylko jedna w klasie
  
  - Sta�e statyczne
  *  mog� by� kilka w klasie, powinny by� sta�e i/albo publiczne
  
  - Metody ststyczne
  
  * nie dzia�a na obiekcie
  * ma dost�p do p�l statycznych
  * wykorzystuje si� ja kiedy metoda nie wymaga sost�pu do stanu obiektu, poniewa� wszystkie parametry s� dostarczone w postaci jawnej,
  * kiedy metoda potrzebuje dost�pu tylko do p�l statycznych
  * mo�na je wywo�ywa� nie maja� �adnych obiekt�w
  
  Metody fabryczne:
  
  - nie tworz� obiektu
  - operacje sa wykonywane na klasie
  
  Metoda main:
  
  - nie dzia�a, na �adnym obiekcie
  - jej zadaniem jest tworzenie i uruchamianie obiekt�w
  - ka�da klasa mo�e zawiera� metod� main;
  - pomocna przy testach jednostkowych
  