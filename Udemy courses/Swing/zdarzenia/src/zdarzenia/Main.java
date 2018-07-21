package zdarzenia;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;	//Obs³uga zdarzenia. Np. klikniêcie przycisku


public class Main extends JFrame
{

	public Main()
	{
	
		super("Zdarzenia");		//nadanie tytu³u 
		this.setBounds(300, 300, 300, 200);
		
		
		initComponents();
	
		
		this.setDefaultCloseOperation(3);
	}
	
	
	
	
	public void initComponents()
	{
	
		kolorCzerwony = new JButton("Czerwony"); // stworzenie przycisku czerwony (data sourse)
		kolorCzarny = new JButton("Czarny");	// stworzenie przycisku czarnego (data sourse)
		
		kolorCzerwony.addActionListener(new sluchaczKolorow(Color.RED)); 	//dodanie s³uchacza do pczycisku czerwny
		kolorCzarny.addActionListener(new sluchaczKolorow(Color.BLACK)); 
		
		
		panel.add(kolorCzarny);
		panel.add(kolorCzerwony);					//dodanie do panelu przycisku czerwonego
		
		
		budujButton("Zielony", Color.GREEN);
		this.getContentPane().add(panel);			//dodanie do kontenera  panel
		
		
	}
	
	
	
	
	JPanel panel = new JPanel();		//stworzenie panelu
	JButton kolorCzerwony;				//stworzenie przycisku czerwony
	JButton kolorCzarny;
	
	
	public void budujButton(String nazwa,final Color k)
	{
		
		
	JButton przycisk = new JButton(nazwa);
	
	przycisk.addActionListener(new ActionListener()
			{
		public void actionPerformed(ActionEvent e)
		{
			panel.setBackground(k);
		}
		
			}
	
	);
	
	
	
	
	// przycisk.addActionListener(new sluchaczKolorow(k));
	panel.add(przycisk);
		
	}
	
	
	
	private class sluchaczKolorow implements ActionListener		// implementacja s³uchacza dla przyciksu czerwonego
	{

		public sluchaczKolorow(Color k)				// dodanie kontruktora z podanie jednego argumentu
		{
			this.kolor = k;							//dodanie do obiektu przys³anego koloru
		}
		public void actionPerformed(ActionEvent e) {	//stworzenie obslugi zdarzenia dla s³uchacza
			
			panel.setBackground(kolor);					//zmiana t³a panelu na przys³any kolor
			
		}


		Color kolor;									// Deklaracja obiektu kolor
		
	}
	
	public static void main(String[] args) {			// funkcja Main

		new Main().setVisible(true);					//

	}

}

