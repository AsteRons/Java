LISTY:

Listy - lista przemiotów
Liste tworzymy za pomocą klasy JList

Mozemy dodać do listy Sctoll za pomocą stworzenia konstruktora klasy JScrollPane
z dodaną listą.


Metody:

- setVisibleRowCount()	-	pokazuje ile zmieści sie kolumn w tekście
- setFixedCellHeight()		-	ustawia wielkosć pola z listy wysokosć
- setFixedCellWidth()		-	ustawia wielkosć pola z listy szerokosć
- setBackground()			-	zmiana koloru listy
- setSelectionBackground() - zmiana tła po najechaniu
- setSelectionForeground()  - ustawienie koloru czcionki
- setLayoutOrientation()		- ustawienie orientacji
- setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); - ustawia możliwość zaznaczania w listach

- Object[] wartoscWLiscie = ((JList)lse.getSource()).getSelectedValues();
+ Pobieranie naciśnietych danych do tablicy obiektów
               
			   
Nasłuchiwacz:

- addListSelectionListener() - dodanie nasłuchiwacza do listy
- getValueIsAdjusting () -  prawda gdy przycisk myszki został naciśnięty (komponent z listy wybrany)



Pobieranie do listy i usuwanie z listy:

DefaultListModel - tworzymy domyślny model listy

Metody:
- addElement() 	-	dodajemy element do listy
