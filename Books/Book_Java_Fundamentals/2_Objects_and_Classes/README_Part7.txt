Konstruktory do obiektów:

Domyślna inicjalizacja pól

Wartości domyslne pól:
	-   typy liczbowe = 0;
	-	wartosci logiczne false
	-	referencje do obiektow null

Konstruktor bezargumentowy:

	- niektóre klasy mają damyslne stany początkowe
	- ustawia wszystkie pola na domyslne (zdefiniowane przy tworzeniu pól w klasie)
	- jest dostepny gdy klasa mie ma żadnego konstruktora

Jawna inicjalizacja pól
	- nigdy nie zaszkodzi jesli każda składowa obiektu bedzie miała jakąś sensowna wartość
	- przypisanie występuje przed wywołaniem konstruktora
	- wartośc inicjalizacjanie musi być stała (może być zwróceniem danych z metody 
   wykorzystującej pola stałe)

Nazywanie parametrów ( w konstruktorach):


	- nazwy jednoliterowe 
	public Employee (String n, double s)
	{
	Name = n;
	}
	- nazwy mówiące o przeznaczeniu
	public Employee (String aName, double aSalary)
	{
	Name = aName;
	}
	
	lub
	
		public Employee (String name, double salary)
	{
	this.name = name;
	this.salary = salary;
	}
	
	this.salary - zmienna ta w obiekcie(klasie)
	salary 	-	zmienna przesłana
	


Wysyoływanie konstruktora:

	- jesli pierwszy konstruktor ma postac this(), to konstruktor ten wywołuje 
	onstruktor tej samej klasy

	- wywołanie konstruktora w konstruktorze oraz inicjalizacja parametrów
	

	
Bloki inicjalizujące:


	- poprzez konstruktor
	- poprzez ustawienie wart w inicjalizacji
	- zastosowanie bloku inicjującego
 
blok inicjulizający jest wykonywany na początku
 - lepiej umieścic wewnątrz konstruktora

ststyczny blok inicjujący
 
 static{
 
 ...

 }
	