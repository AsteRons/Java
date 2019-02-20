SYNCHRONIZACJA - WARUNEK BLOKOWANIA:


- korzystanie z obiektu blokującego

Program do blokowania wykorzystuje obiekt blokujący lock oraz obiekt do oczekiwania Condition.

1. Program pobiera w konstruktorach klas obiekt skrzynki, blokady oraz oczekiwania.
2. Metoda lock odblowowywujemy
3. Za pomoca blokow try finall wykonywujemy
4. Do oczekiwania ( blokady) wykorzystujemy await
5. Do przerwania blokady wykorzystujemy signalAll.
6. unlock odblokowywujemy obiekt lock
