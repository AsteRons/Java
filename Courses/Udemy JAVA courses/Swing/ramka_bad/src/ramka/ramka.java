package ramka;


import javax.swing.*;
import java.awt.*;



//Tworzenie ramki star� metod� // tak sie nie robi !!!

public class ramka {
	
	
	public ramka()
	{
		JFrame frame = new JFrame();	//tworzenie obiektu okienko
		
		frame.setTitle("Tytu� ramki"); 	//tytu� ranki
		
		
		frame.setSize(1000, 1000);	//rozmiar ramki
		
		
		
		//frame.setLocation(100, 0);	//ustawianie lokalizacji okienka
		frame.setBounds(100, 50, 1000, 1000 );	//Bounds- granica
		
		
		frame.setResizable(false);		//Blokada powi�kszanie ramki
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("settings.jpg")); //pobieranie obraska do ikony
		
	
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //zamykanie aplikacji
		
		frame.setVisible(true);									//wy�wietlanie aplikacji
		
		
		
		
		
	}

	
	
	public static void main(String[] args) {


		new ramka();
		
	}

}
