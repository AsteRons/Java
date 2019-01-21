package Part_02;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{

	
	public Main()
	{
		
		int szerokosc  = Toolkit.getDefaultToolkit().getScreenSize().width;
		int wysokosc   = Toolkit.getDefaultToolkit().getScreenSize().height;
		
		this.setSize(szerokosc / 2, wysokosc / 2);
		
		/*
		// Ustawienie okna na po³owe ekranu
		
		
		// Ustawienie lokalizacji
		
		this.setLocation(szerokosc / 4, wysokosc / 4);
		
		*/
		
		//Ustawianie lokacji uniwersalnej
		
		
		int szerRamki  = this.getSize().width;
		int wysRamki   = this.getSize().height;
		
		this.setLocation((szerokosc - szerRamki) / 2 , (wysokosc - wysRamki) / 2);
		
	}
	
	public static void main(String[] args) {

		new Main().setVisible(true);
		
	}



}
