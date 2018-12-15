import java.util.Arrays;
import java.util.Scanner;


public class Part_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ile liczb chcesz wylosowa�?");
		
	    int k = in.nextInt();
	    
	    System.out.println("Jaka jest najwi�ksza liczba?");
	    int n = in.nextInt();
	    
	    //Zape�nienie tablicy liczbami
	    int[] numbers = new int[n];
	    for(int i = 0; i < numbers.length; i++)
	    {
	    	numbers[i] = i + 1;
	    }
	    
	    //Losowanie liczb i zapisanie ich w drugiej tablicy
	    
		int[] result = new int[k];
		for(int i = 0; i < result.length; i++)
		{
			//losowanie liczb z przedzia�u 0 do n-1
			
			int r = (int)(Math.random() *n );
			result[i] = numbers[r];
			
			numbers[r] = numbers[ n - 1];
			n--;
		}
		
		
		Arrays.sort(result);
		System.out.println("Liczby:");
		for(int r: result)
			System.out.println(r);
	}

}
 