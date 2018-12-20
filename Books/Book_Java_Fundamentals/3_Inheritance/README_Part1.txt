Dziedziczenie:

- definiowanie podklas
     class A extends B
	 
	 * tworzona jest nowa klasa na podstawie istniejącej
- przy tworzeniu dokumentacji nalezy podac tylko różnice między klasami

- przesłaniamy metody nadklasy pisząć nową metode o tej samej nazwie
- klasy potomne nie mają dostepu do pól prywatnych klasy macierzystej
  słowo kluczowe super
  
  super.getSalary() - wywołuje metode klasy macierzystej.
					nakazuje wywołanie metody z nadklasy
  
- dziedziczenie nie umozliwia pozycie sie, żadnych metod ani pól 

Konstruktory podklasy:

	super(n, s, year. month, day);
	
- mówi o wywołaniu konstruktora nadklasy z podanymi parametrami
