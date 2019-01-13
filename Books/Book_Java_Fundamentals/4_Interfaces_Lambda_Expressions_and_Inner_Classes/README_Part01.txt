KONCEPCJA INTERFEJSÓW

Interfejsy - opisują co klasy powinny robić ale nie w jaki sposób

Wyrażenie Lambda - zwięzła metoda zapisu bloków kodu

INTERFEJSY

- nie mogą zawierać pól obiektowych
- mogą korzystać z klas abstrakcyjnych

słowo kluczowe implements

metoda compareTo - -1 gdy x < y lub 1 gdy x >0

Kod programy sortującego tablice egzemplarzy klasy Employee

Metody:

-compareTo
-sort
-compare

---------------------------------------------------------------------------------


WŁAŚCIWOŚCI INTERFEJSÓW:

- możliwość deklarowania ich zmiennych
- nie można tworzyć obiektów interfejsowych
- za pomocą instanceof można sprawdzić czy dany obiekt implementuje określony interfejs
- można tworzyć hierarchie interfejsów
- mogą być pola stałe 

Metody - publiczne
Pola - statyczne finalne i publiczne

- Klasa moze implementowac kilka interfejsów oddzielonych przecinkiem

INTERFEJSY A KLASY ABSTRAKCYJNE:

Lepsze od abstrakcyjnych

- można  dziedziczyć tylko po  jednej klasie
- pozbawienie wad z kompilacją i efektywnością języka

METODY STATYCZNE:


- możliwość implementowania ich w interfejsach zamiast tworzenie dodatkowych klas pomocnichych

METODY DOMYŚLNE:

- każda opisana w interfejsie metoda może mieć implementacje domyślną , nalezy oznaczyć modifikatorem default
- metoda domyślna może wywoływać inne metody
- możliwosć ewolucji interfejsów

	+ dodanie do interfejsu niedomyślnej metody jest niemożliwe z powodu niezgodności źródła i braku kompoilacji
	

WYBIERANIE MIĘDZY METOODAMI DOMYŚLNYMI

- jesli implementujemy kilka interfejsów o tej samej nazwie metody nalezy ja przykryć w klasie przes odwołanie super
- metody w trakcie konfliktu nazw z klasy sa wazniejsze niż metody z interfejsów
