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
	
- remove - metoda do usuwania i przesuwania w dół wszystkich elementów

Zgodnosć między typowymi a suowymi listami

- korzystać z metod w klasie
- powoduje ostrzeżenia, przyglądac sie ale nie zawiele można z nimi zrobić

Opakowania obiektów i automatyczne pakowanie

- klasa okapowywująca Integer (int na obiekt) 
- klasy te są finalne i niezmienne (nie można zmieniac ich oraz tworzyc podklas)
- klasa Integer (ArrayList<Integer>) mniej wydajna niż int[]
- nie można przekazać przez metodę public  static void x(Integral xy)
	można za to skożystać z pakietu org.omg.CORBA (IntHolder)
	
	Przydatne metody w Integer:
	
	int intValue() - Zwraca obiekt Integer jako liczbe int
	static String toString(int i, int radix) - Zwraca reprezentacje liczy i w okreslonymystemie
	static String parseInt(String s ,...) - Zwraca liczbe całkowit utworzobną z cyfr z łańcycha s
	