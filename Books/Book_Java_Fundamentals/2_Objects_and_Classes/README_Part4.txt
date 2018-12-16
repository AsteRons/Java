Pola i metody statyczne:

modyfikator static

- mo¿e byæ tylko jeden taki w plasie
- pole dzielone przez wszystkie obiekty danej klasy

stctic - pole wspó³ne dla obiektów danej klasy
  
  - Pola statyczne
  
  *  mo¿e istnieæ tylko jedna w klasie
  
  - Sta³e statyczne
  *  mog¹ byæ kilka w klasie, powinny byæ sta³e i/albo publiczne
  
  - Metody ststyczne
  
  * nie dzia³a na obiekcie
  * ma dostêp do pól statycznych
  * wykorzystuje siê ja kiedy metoda nie wymaga sostêpu do stanu obiektu, poniewa¿ wszystkie parametry s¹ dostarczone w postaci jawnej,
  * kiedy metoda potrzebuje dostêpu tylko do pól statycznych
  * mo¿na je wywo³ywaæ nie majaæ ¿adnych obiektów
  
  Metody fabryczne:
  
  - nie tworz¹ obiektu
  - operacje sa wykonywane na klasie
  
  Metoda main:
  
  - nie dzia³a, na ¿adnym obiekcie
  - jej zadaniem jest tworzenie i uruchamianie obiektów
  - ka¿da klasa mo¿e zawieraæ metodê main;
  - pomocna przy testach jednostkowych
  