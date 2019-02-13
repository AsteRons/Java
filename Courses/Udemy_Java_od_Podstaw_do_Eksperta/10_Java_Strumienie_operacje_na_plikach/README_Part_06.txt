 SWOBODNY DOSTĘP DO PLIKU - UPGRADE:
 
 Opis:
 
 + Program tworzy baze danych produktów składających się z nazwy towaru, ceny oraz daty wystawienia
 + Tworzy plik tekstowy txt do ktorego zapisuje produkty w formacie bajtowym
 + Jest możliwosć wczytania tych danych
 + Tworzenie swobodny dostęp do pliku
 + Wyorzystanie stworzenia własnego wyjątku 
 
 
 - zapis pojedynczych rekordow do pliku
 - wykorzystanie StringBuffer 
             
			 StringBuffer - trzyma tymczasowo stringa 
			 1. Dodanie do bufora naszego stringa (nazwe)
			 2. Piszemy algorytm do zapisu danych
			 
			 
			 1. Piszemy program do odczytu danych
			 
			 
Po zapisaniu musimy ustawić pointer w pliku na 0 pozycje.
Powoduje to, że program nie moze czytac plik jak pointer jest ustawiony na końcu.

Skaczemy za pomocą metody: seek(skok);