package ramka_good;


import javax.swing.*;
import java.awt.*;



public class ramka extends JFrame
{
	
	
	
	
	public ramka()	//konstruktor
	{
	
		
		
	super("Tytu� ramki");	
	this.setBounds(100, 50, 100, 100);			// granice ramki
	this.setDefaultCloseOperation(3);	// co sie stanie po wy��czeniu
	//this.pack();			// przyciski g�rne, komponenty
	
	}

	public static void main(String[] args) {

				
		new ramka().setVisible(true);;
		
	}

}