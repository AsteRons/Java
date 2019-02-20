package part_07;

public class Part_07 {

	public static void main(String[] args) {
		

		Skrzynka skrzynka = new  Skrzynka();
		MaszynaProdukujacaButelki maszyna1 = new MaszynaProdukujacaButelki(skrzynka);
		MaszynaZmieniajacaSkrzynki maszyna2 = new MaszynaZmieniajacaSkrzynki(skrzynka);
		
		
		Thread produkcja = new Thread(maszyna1, "producent");
		Thread zmieniacz = new Thread(maszyna2, "zmieniacz");

		produkcja.start();
		zmieniacz.start();
		
	}

}
