package part_08;

import java.util.concurrent.locks.*;


public class Part_08 {

	public static void main(String[] args) {
		
		Lock lock = new ReentrantLock();
		Condition oczekiwanie = lock.newCondition();
		Skrzynka skrzynka = new  Skrzynka();
		
		MaszynaProdukujacaButelki maszyna1 = new MaszynaProdukujacaButelki(skrzynka, lock, oczekiwanie);
		MaszynaZmieniajacaSkrzynki maszyna2 = new MaszynaZmieniajacaSkrzynki(skrzynka, lock, oczekiwanie);
		
		
		
		Thread produkcja = new Thread(maszyna1, "producent");
		Thread zmieniacz = new Thread(maszyna2, "zmieniacz");

		produkcja.start();
		zmieniacz.start();
		
	}

}
