package part_01;


public class Part_01 {

	
	public static void main(String[] args) {
		
		String[] ab = {"Ala", "ma", "kota", "i", "psa"};
		Pair<String> mm = ArrayAlg.minmax(ab);
		System.out.println("min= " + mm.getFirst());
		System.out.println("max= " + mm.getSecond());

	}

}
