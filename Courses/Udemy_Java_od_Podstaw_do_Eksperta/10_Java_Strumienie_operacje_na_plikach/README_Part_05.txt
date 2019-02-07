SWOBODNY DOSTĘP DO PLIKU:

FileOutputStream - zapisuje binarnie, pozwala otwierać pliki

- filtrujemy je do klasy DataOutputStream
			
+ zwiększa liczbe metod i możemy zapisywac więszą możliwość typów liczb

Klasa:

RandomAccessFile - swobodny dostęp do pliku

Metody:
- writeDouble()		-	dodaje typ Double (zakodowany ASCII)
- writeChars()		-	dodaje do pliku String (normalnie każdy znak zajmuje 2 bajty)
- getFilePointer() 	-   pokazuje w którym miejscu aktualnie znajduje się wskażnik
- readDouble()		-   czytanie wartości double z pliku
- seek(0)				-	ustawia nam na dowolny bajt
 
 Jeśli wiemy, ze jeden rekard ma określoną ilość bajtów możemy swobodnie skakać po 
 pliku i pobierać w nim dane.
 

 