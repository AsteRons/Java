KRAWĘDZIE:

Program tworzy aplikacje z krawędziami:


Ustawienie Layout na siatkowy:

	this.getContentPane().setLayout(new GridLayout(2, 1));
  
Ustawienie krawędzi panelu 
- metoda setBorder do ustawienia


- BorderFactory - wykorzystuje klase  do tworzenia 
- createBevelBorder - metoda do stworzenia krawędzi
- BevelBorder.RAISED - ustawione rosnąco


- createTitledBorder  - tworzenie krawędzi z tytułem
- createEtchedBorder - wryte krawędzie

Compound Border - border do komponowania kilku borderów

* W klasie wewnętrznej nie można używać zmiennych które nie są finalne
