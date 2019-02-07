package Part_09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Part_09 extends JFrame {

	/*
	 * Stworzone komponentów
	 */
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	
	JLabel etykieta = new JLabel("jestem piekna");
	
	JCheckBox pogrubiony = new  JCheckBox("Pogrubiony");
	JCheckBox pochylony = new  JCheckBox("Pochylony");	
	
	/*
	 * Konstruktor domyslny
	 */
	
	public Part_09()
	{
		initComponents();
		
	}
	
	/*
	 * Inicjalizacja komponentow
	 */
	
	
	public void initComponents()
	{
		this.setTitle("Pole Wyboru");
		this.setBounds(500, 500 ,500, 400);
		
		etykieta.setFont(new Font("Monospaced", Font.PLAIN, 20));
		
		panel2.add(etykieta);
		
		ActionListener sluchacz = new CheckBoxHandler();
		
		pogrubiony.addActionListener(sluchacz);
		pochylony.addActionListener (sluchacz);
		
		
		panel1.add(pogrubiony);
		panel1.add(pochylony);
		
		this.getContentPane().add(panel1, BorderLayout.NORTH);
		this.getContentPane().add(panel2, BorderLayout.CENTER); //Opis
		
		
		
	}
	
/*
 * Klasa do ³apania klikniêæ w chackboxach	
 */
	
	public class CheckBoxHandler implements ActionListener
	{


		public void actionPerformed(ActionEvent e) {
			
			int style = Font.PLAIN;
			
			
			if(pogrubiony.isSelected()) style += Font.BOLD;
			if(pochylony.isSelected())  style += Font.ITALIC;
			
			
			etykieta.setFont(new Font(etykieta.getFont().getFontName(), style, etykieta.getFont().getSize()));
			
		}
		
	}
	
	
	
	
	/*
	 * Metoda wykonawcza, domyslna
	 */
	public static void main(String[] args) {
		
	new Part_09().setVisible(true);

	}

}
