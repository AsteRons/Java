MENADŻER UKŁADÓW, KOMPONENTY, SZYBKA, PRZYCISKI:

Plik Main.java

Layout - układ graficzny

Dodanie Przycisku:
- komponent dodajemy do szybki

Dodawanie komponenty do szybki:

- stworzenie przycisku
- dodanie przycisku do szybki
 + pobieranie szybki
 + ( przycisk jest na cały obszar panelu)

 Ustawienie menadżerów układu:
 - na początku układ BorderLayout - krawędzowy domyslny:
	BorderLayout.CENTER)

 - uzywamy menadżera skrajnego z odpowiednimi Bstronami
 
 this.pack() - okienka zostana dostosowane do wielkości naszych napisaów w buttonach
 
 

 
Pozycjonowanie apsolutne, poprzez własnoręczne ustawianie pozycji:
- ustawianie na przycisku Layout na null
  + Ustawienie przycisku o okreslonym wymiarze w podanym miejscu
  
  Menadżer układow ma większy priorytet niż ustawianie absolutne
  