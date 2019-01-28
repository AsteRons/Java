package Part_12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Part_12 extends JFrame{

	public Part_12()
	{
		initComponents();
		
	}
	
	private void initComponents() {
		this.setTitle("Przeszukiwacz Tekstu");
		this.setBounds(500, 500, 500, 400);
		
		panelSzukania.add(znajdz);
		panelSzukania.add(szukany);
		
		// obszarTekstowy.selectAll();  			   	//- zaznacza ca³y tekst
		// obszarTekstowy.select(0, 2);	   			     // - zaznacza obszar odk¹d - dok¹d
		// obszarTekstowy.replaceSelection("lala");		 //- zamieniæ obszar, który aktualnie jest zaznaczony
		// obszarTekstowy.replaceRange("Lala", 0, 2);	// - podbieniamy w tekscie o danym zasiêgu na string Lala
		// obszarTekstowy.insert("La", 0);				 //- dodaje tekst w okreslonym miejscu
     	// obszarTekstowy.append("Ja");				//- do³¹cza do koñca obszaru podany tekst
		// obszarTekstowy.select(obszarTekstowy.getText().indexOf("test"), obszarTekstowy.getText().indexOf("test")+ "test".length());
				
		znajdz.addActionListener(new Znajdowanie() );
		
		
		this.getContentPane().add(obszarPrzewijania, BorderLayout.NORTH);	
		this.getContentPane().add(panelSzukania, BorderLayout.CENTER);	
		pack();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	
	private  JTextArea obszarTekstowy = new JTextArea( "To jest testowy tekst, w testowym obszarze", 10, 30);
	private JScrollPane  obszarPrzewijania = new JScrollPane(obszarTekstowy);
	private JPanel panelSzukania = new JPanel();
	private JButton znajdz = new JButton("Szukaj");
	private JTextField szukany = new JTextField(8);
	
	public static void main(String[] args) {
		new Part_12().setVisible(true);

	}
	
	private class Znajdowanie implements ActionListener
	{

		private int poczatekSzukanego = 0;
		
		public void actionPerformed(ActionEvent e) {
			
			// Wypisuje mi numer pocz¹tku wpisanego tekstu
			// Jesli nie znalaz³o wypisuje -1 
			poczatekSzukanego = obszarTekstowy.getText().indexOf(szukany.getText());
			
			System.out.println(poczatekSzukanego );
			
			if(poczatekSzukanego >= 0 && szukany.getText().length() > 0) 
			{
				obszarTekstowy.requestFocus();
				obszarTekstowy.select(poczatekSzukanego, poczatekSzukanego + szukany.getText().length());
			}
			
		}
		
	}
	

}
