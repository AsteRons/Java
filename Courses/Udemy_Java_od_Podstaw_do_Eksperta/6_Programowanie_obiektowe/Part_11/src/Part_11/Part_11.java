package Part_11;

import java.util.Arrays;
import java.util.Collections;
import java.lang.*;

public class Part_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Interfejsy
		
		nazwaInterfejsu a = new Pracownik();
				
		((Pracownik)a).getWynagrodzenie();
		
		// Sortowanie
		
		int[] tab = new int[3];
		
		tab[0] = 5;
		tab[1] = 1;
		tab[2] = 4;
		
		
		
		Arrays.sort(tab);			//sortowanie rosn¹co
			
		
		
		Pracownik[] pracownik = new Pracownik[3];
		pracownik[0] = new Pracownik(1000);
		pracownik[1] = new Pracownik(500);
		pracownik[2] = new Pracownik(2000);
		
		System.out.println("Przed sortowaniem: ");
		for(Pracownik p : pracownik)
		{
			System.out.println(p.getWynagrodzenie());
		}
		
		Arrays.sort(pracownik);
		
		
		System.out.println("Po sortowaniem rosn¹co: ");
		for(Pracownik p : pracownik)
		{
			System.out.println(p.getWynagrodzenie());
		}
		
		Arrays.sort(pracownik, Collections.reverseOrder());
		
		
		System.out.println("Po sortowaniem malej¹co: ");
		for(Pracownik p : pracownik)
		{
			System.out.println(p.getWynagrodzenie());
		}
		
	}

}





interface nazwaInterfejsu
{
	double PI = 3.14;  // public static final
	
	void cos();	       //public abstract

	
	
}




class Pracownik implements nazwaInterfejsu, Comparable<Object>
{
	
	
	private double wynagrodzenie;
	
	
	
	Pracownik()
	{
		
	}
	
	Pracownik(double wynagrodzenie)
	{
		this.wynagrodzenie = wynagrodzenie;
	}
	

	public double getWynagrodzenie()
	{
		return this.wynagrodzenie;
	}


	public void cos() {
		
		
	}

	
	public int compareTo(Object o) {
		
		
		Pracownik przyslany = (Pracownik)o;
		
		if(this.wynagrodzenie < przyslany.wynagrodzenie)
		
			return -1;
			
		
		if (this.wynagrodzenie > przyslany.wynagrodzenie)
			return 1;
		
		
		return 0;
		
	}

	

}