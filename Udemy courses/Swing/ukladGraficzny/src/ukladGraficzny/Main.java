package ukladGraficzny;



import javax.swing.*;
import java.awt.*;


public class Main extends JFrame
{
	
	public Main()
	{
		super("Uk�ad graficzny (Layout)");			// Tytu�
		this.setBounds(300, 320, 300, 200);			// Ustawiamy granice
	
		initComponents();		// wywo�ywanie metody inicjalicacji
		this.pack();			//pakuje elementy do uk�adu (przyciski)
		
		this.setDefaultCloseOperation(3);	//parametr w czasie zamkni�cia
	}
	
	
	public void initComponents()
	{
		//Tworzenie przycisku i nadawanie mu nazwy
		
		centrum = new JButton("Start");		
		gora = new JButton("Gora");
		dol = new JButton("Dol");
		lewa = new JButton("Lewa");
		prawa = new JButton("Prawa");

		
		//Tworzenie konteneru na przycisk
		
		Container kontener = this.getContentPane();
		
		
		/*
		//Wk��danie przyciusku do kontenera i ustalanie pozycji
		// Menad�er jest najwa�niejszy
		
		kontener.add(centrum, BorderLayout.CENTER);
		kontener.add(gora, BorderLayout.PAGE_START);
		kontener.add(dol, BorderLayout.PAGE_END);
		kontener.add(lewa, BorderLayout.LINE_START);
		kontener.add(prawa, BorderLayout.LINE_END);
		*/

		
		// Uk�adanie przycisku centrum
		
		
		centrum.setLocation(100, 20);
		centrum.setSize(centrum.getPreferredSize());	//getPreferredSize() - pobierz preferowan� wielkos�
		kontener.setLayout(null);
		// null	-	usuni�cie menad�era uk��d�w graficznych, 
		// pozycjonowanie absolutne
		kontener.add(centrum);
		
	}
	
	// deklaracja przycisk�w
	
	JButton centrum;
	JButton gora;
	JButton dol;
	JButton lewa;
	JButton prawa;
	
	
	
	public static void main(String[] args) {

		
		//tworzenie nowej klasy i wizualizacja
		new Main().setVisible(true);
		
	}

}