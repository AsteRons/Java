Klasa Object
- klasa Object jest podstawą wszystkich klas w javie
- typy podstawowe nie są obiektmi
- typy tablicowe są obiektaami
- każdy obiekt klasy jest obiektem klasy Object

Metoda equals
- porównuje dwa obiekty
- sprwdza czy referencje do obiektu są identyczne
- metoda getClass zwraca nazwy klasy obiektu

Metoda equals:
- zwrotność 
- symetria
- przemienność
- niezmienność


Porównanie a dziedziczenie

Pisanie idealnej metody equals:
1. Nadaj parametrowi jawnemuu nazwe otherObject
2. Sprawdz czy this i otherObject są identyczne
3. Sprawdz czy otherObject jest równy null
4. Porównaj obie klasy getClass lub instanceof
5. Wykonaj rzutowanie otherObject na zmienna typu swojej klasy
6. Porównaj pola zgodnie z własnymi wymaganiami 

Metoda hashCode

metoda hashCode() - służy w javie do zwrócenia unikalnej wartosci liczbowej dla kazdego unikalnego 
                    obiektu.
					
int hashCode() - zwraac wartosc skrotu do obiektu
int hasy(Object ...) -skrót będący kompilacją wszytskich skrutów obiektów

Metoda toString

- zwraca obiekt reprezentujący wartość obiektu
- getClass().getName(); - pobiera nazwe klasy