SERIALIZACJA DANYCH:

Program zapisuje dane do pliku w formie calych obiektow.
Jest to dobra metoda do odzyskiwania danych ale zla ze wzgledu na mozliwosc odtworzenia.


- pozwala na zapis calego drzewka obiektow i odwolan (kazdy obiekt dostaje nr. seryjny)

 ObjectOutputStream - klasa, ktora pozwala serializowac dane 

 - dodajemy do klasy ktora bedzie serializowana interfejs Serializable
 - zale obiekty są zamieniane na postac bajtowa
 - bardzo latwo mozna je odczytac
 
 
  + writeObject - zapisuje objekt do strumienia
 
transient - dane ktore nie zostaną zserializowane
 - serializowac mozna rowniez cala tablice danych
 - dane te moga byc podmienione
 
 
 Nie mozna serializowac hasel poniewaz mozna je odtworzyc oraz sa narazone na atak hakerski
 