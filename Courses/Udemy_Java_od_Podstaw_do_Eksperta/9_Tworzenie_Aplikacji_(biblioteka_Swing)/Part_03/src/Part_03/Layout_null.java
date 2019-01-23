package Part_03;

import javax.swing.*;
import java.awt.*;


public class Main extends JFrame{

	JButton przyciskCenter;	// odwo³anie do obiektu przycisk
	JButton przyciskTop;
	JButton przyciskBot;
	JButton przyciskLewa;
	JButton przyciskPrawa;
	
	
	public Main()
	{
		
	super("Uk³ad graficzny (Layout)");
	this.setBounds(300, 320, 300, 200);
	
	initComponents();
	
    this.pack();
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	

	}
	
	
	public void initComponents()
	{
		
		przyciskCenter =  new JButton("Srodek");				// inicjalizacja przycisku Heja - nazwa przycisku
		przyciskTop    =  new JButton("Góra");	
		przyciskBot    =  new JButton("Dó³");	
		przyciskLewa   =  new JButton("Lewa");	
		przyciskPrawa  =  new JButton("Prawa");	
		
		Container kontener = this.getContentPane();			//pobieranie szybki
		
		
		przyciskCenter.setLocation(100, 50);	// Ustawiam lokalizacje
		przyciskCenter.setSize(100, 50);		// Ustawiam rozmiar przycisku
		
		przyciskCenter.setLayout(null);				//ustawianie na przycisku Layout na null
		kontener.add(przyciskCenter);
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		
	new Main().setVisible(true);

	
	}

}
