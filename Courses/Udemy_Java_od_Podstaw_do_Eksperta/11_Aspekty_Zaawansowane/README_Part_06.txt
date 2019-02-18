BLOKADA - LOCK - REENTRANTLOCK:

- Istnieje interfejs Lock, która może blokować wątek.

- Możemy go pobrac za pomocą klasy ReentrantLock który go implementuje

- służy aby kolejnemu wątku nie pozwoliło wejsć do danej metody
  dopoki ta metoda nie zakończy wykonywania
  
  Metody:
  lock()  - do blokowania
  unlock() - do odblokowywania
  