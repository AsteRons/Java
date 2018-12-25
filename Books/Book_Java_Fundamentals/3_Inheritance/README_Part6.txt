Generyczne listy tablicowe:

- rozmiar tablicy w Javie można zmienić 
 * musi być zmienną ustaloną wcześniej
 
 Arraylist:
 - automatycznie dopasowywyją swoje rozmiary w wyniku + i - elementów
- klasa generyczna z parametrem typu
- aby określić typ nalezy podac nazwe klasy w nawiasach ostrych: ArryList<Employee>


- Tworymy liste tablicową Arraylist
- Jest to skłądnia diamentowa		ArrayList<>();
- nowe elementy sa dodawne do tablicy za pomocą metody add
- zawiera wewnątrz listę referencji do obiektów

- ensureCapacity - metoda recerwuje w tablicy określona ilość miejsca
   ArrayList<Employee> staff = new ArrayList<Employee>(100); - rezerwacja 100 miejsca
- size()- sprawdza wielkosć
- trimToSize - dostosowuje rezerwacje miejsca do aktualnej wielkosc tablicy

Dostęp do elementów listy tablicowej:

Metody
- get - pobiera wartośc tablicy

Employee e = staff.get(i); - pobiera wartość i-tego elementu

- set - ustawia wartosć (harry)i-tego elementu
	staff.set(i, harry);
	Do zapełniania add, do ustawiania set
	