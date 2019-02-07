package Part_06;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Part_06 extends JFrame implements ActionListener{

	//Przyciski
	
	JButton kolorCzerwony;
	JButton kolorCzarny;
	JButton kolorNiebieski;
	//Panele
	
	JPanel panel = new JPanel();
	
	
	
	 public Part_06()
	 {
		 super("Zdarzenia");
		 this.setBounds(300, 300, 300, 200);
		 
		 initComponents();
		 
		 this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		 
	 }
	
	// Szybka 
	public void initComponents()
	 { 
		kolorCzerwony = new JButton("Czerwony"); //zr�d�o moze dodwa� s�uchacza
		kolorCzarny   = new JButton("Czarny"); //zr�d�o moze dodwa� s�uchacza
		kolorNiebieski = new JButton("Niebieski"); // 
		
		
		
		kolorCzerwony.addActionListener(new sluchaczKolorow(Color.RED));	//dodaj s�uchacza akcji 
		kolorCzarny.addActionListener(new sluchaczKolorow(Color.BLACK));	//dodaj s�uchacza akcji 
		kolorNiebieski.addActionListener(this); //wywo�any przez zdarzenie g��wne
		
		
		
		panel.add(kolorCzerwony);
		panel.add(kolorCzarny);
		panel.add(kolorNiebieski);
		
		 this.getContentPane().add(panel);
		
		 budujButton("Zielony", Color.GREEN);
	 }
	 
	 
	
	// Wykorzystanie klas anonimowych
	
	
	public void budujButton(String nazwa,final Color k)
	{
	
		JButton przycisk1 = new JButton(nazwa);
		przycisk1.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				panel.setBackground(k);
			}
			
		});
		
		
		
		
		
		
		panel.add(przycisk1);
		
		
		
	}
	
	// Klasa wewn�trzna w przypadku braku klasy anonimowej
	class sluchaczKolorow implements ActionListener
	{
		public sluchaczKolorow(Color k)
		{
			this.kolor = k;
		}

		
		//Wykonuje sie w czasie przys�ania obiektu akcji
		public void actionPerformed(ActionEvent e) {
			
			panel.setBackground(kolor);
			
		}
		
		Color kolor;
		
		
	}
	
	
	
	public static void main(String[] args) {
	
		new Part_06().setVisible(true);
		
		
	}


	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource() == kolorNiebieski)
		panel.setBackground(Color.BLUE);
	}

}
