OBSŁUGA WYJĄTKOW:

Gdy ktoś zamknał plik a my w bloku chcemy zapisać.

- istnieją wyjątki które moga uszkodzić działanie programu
- wykorzystywany w niebezpiecznych miejscach programu

- instrukcje po instrukcji jak powstał wyjątek nie sa wykonywane


finally - blok który zawsze zostanie wykonany nie zależnie od wystąpienia wyjątku
		+ jest to wywoływane po wystąpieniu wyjatku 
		
	Wszystkie wyjatki dziedziczą z klasy Exception
	+ dzieki temu możemy tworzyc własne wyjatki
	

Jesli wykorzystamy klase Exception możemy obsłużyć kilka wyjatków na raz :))

lub

można robic kilka catch,

try{
...
}
catch()
{
}
catch()
{
}

Mozna wykorzystać też |




Do przykładu butelka:

Jak ktoś przelewa z a do b cos.
Jak jest za mało miejsca mozemy wrzucic wyjątek za mało miejsca
		throw new Exception("za mało miejsca");
		
	void wyjej() throws Exception - opis metod które rzucają wyjątki
		
- tworzymy klasy wyjatków