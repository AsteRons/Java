FOCUSLISTENER,	KEYLISTENER,	VIRTUAL KEYS,	GIRDLAYOUT, 	MENU:

	Menu - tworzymy za pomocą klasy dzidziczącej z klasu Button 
 
	GridLayout (x, y)- menadżer ukłądów siatkowych
	x  - wiersze
	y  - kolumn
	
	- Layout ten wypełnia panel
	- Nadaje się do tworzenia menu
	
	FocusListener - skupia (zaznacza) jak na coś naciśniemy
	- korzystamy z Interfejsu implements
		+ focusGained - focuse wtedy jak naciśniemy
		+ focusLost - wtedy jak utracimy focuse
		
		- Ustawienie  nasłuchiwacza na klawicze
		+ Użycie interfejsu KeyListener oraz klasy anonimowej
		
		Gdy klikne literę a to: keyPressed,  keyTyped, keyReleased
		
		keyPressed - jesli trzymam to byłby wywoływany cały czas
		 
		keyTyped - wywołany dla klawiszy które są wydrukowane na ekranie
		
		keyReleased - puściłem klawisz
		
		Klasa adaptacyjna - klasa wykorzystywana do tworzenia elementów np. z interfejsów
		- wykorzystywana jest gdy niepotrzebujemy wszystkich zaimplementowanych metod w interfejsie
		
		- getKeyCode - kod przysłanego klawiszu
		
		+ KeyEvent.VK_DOWN - kod strzałki w dół
		
		- Wykorzystuje dzielenie modulo 
		
		1. Pobiera wartość komponentów z panelu 
		2. Tworzy zmienną zmienną i = 0;
		
				// 1 % 3 = 1,	2 % 3 = 2,	3 % 3 = 0
		3. Komponenty są ponumerowane w taki sposób jak dodaliśmy je do panelu.
		4. Program za pomocą metody getComponent ustala komponent oraz requestFocus ustawia na nim focuse
		
		
		Wykonujemy klikniecie Enter
		1.  Wykonujemy podobnie jak w przypadku strzałki
		2.	Bierzemy kliknięcie Przycisku e jako KeyEvent  rzutujemy ją na MenuButton oraz bierzemy jego źródło ( )
		3. Ze źródła możemy wykonać akcje doClick() która symyjyje kliknięcie myszką
		
		
		JOptionPane.showMessageDialog(this, "coś"); - powstaje nam panel na tym obiekcie w pojawia nam sie komunikat coś
		
		 ((MenuButton)arg0.getSource()).getText() - pozwala nam pobrać nazwe klawiszu na który klikneliśmy