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
		
		panelSzukania.add(etykietaI);
		panelSzukania.add(zamien);
		panelSzukania.add(etykietaNa);
		panelSzukania.add(nowyTekst);

		
		// obszarTekstowy.selectAll();  			   	//- zaznacza ca³y tekst
		// obszarTekstowy.select(0, 2);	   			     // - zaznacza obszar odk¹d - dok¹d
		// obszarTekstowy.replaceSelection("lala");		 //- zamieniæ obszar, który aktualnie jest zaznaczony
		// obszarTekstowy.replaceRange("Lala", 0, 2);	// - podbieniamy w tekscie o danym zasiêgu na string Lala
		// obszarTekstowy.insert("La", 0);				 //- dodaje tekst w okreslonym miejscu
     	// obszarTekstowy.append("Ja");				//- do³¹cza do koñca obszaru podany tekst
		// obszarTekstowy.select(obszarTekstowy.getText().indexOf("test"), obszarTekstowy.getText().indexOf("test")+ "test".length());
				
		znajdz.addActionListener(new Znajdowanie());
		
		zamien.addActionListener(new Zamienianie());
		
		
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
	
	private JLabel etykietaI = new JLabel("i");
	private JButton zamien = new JButton("Zamieñ");
	private JLabel etykietaNa = new JLabel("na");
	private JTextField nowyTekst = new JTextField(8);
	
	
	public static void main(String[] args) {
		new Part_12().setVisible(true);

	}
	
	
	private class Znajdowanie implements ActionListener
	{

		private int poczatekSzukanego = 0;
		
		public void actionPerformed(ActionEvent e) {
			
			// Wypisuje mi numer pocz¹tku wpisanego tekstu
			// Jesli nie znalaz³o wypisuje -1 
			poczatekSzukanego = obszarTekstowy.getText().indexOf(szukany.getText(), poczatekSzukanego + szukany.getText().length());
			
			System.out.println(poczatekSzukanego );
			if(poczatekSzukanego == -1)
			poczatekSzukanego = obszarTekstowy.getText().indexOf(szukany.getText());
				
			
			
			
			if(poczatekSzukanego >= 0 && szukany.getText().length() > 0) 
			{
				obszarTekstowy.requestFocus();
				obszarTekstowy.select(poczatekSzukanego, poczatekSzukanego + szukany.getText().length());
			}
			
		}
		
	}
	
	
	
	private class Zamienianie implements ActionListener
	{

		public void actionPerformed(ActionEvent e) {
			
			if(obszarTekstowy.getSelectionStart() != obszarTekstowy.getSelectionEnd())
			{
				
				zamienTekst();
			
			}
			else
			{
				znajdz.doClick(0);
				if(obszarTekstowy.getSelectionStart() != obszarTekstowy.getSelectionEnd())
				zamienTekst();
			}
		}
		
		private void zamienTekst()
		{
			obszarTekstowy.requestFocus();
			int opcja = JOptionPane.showConfirmDialog(rootPane, "Czy chcesz zamieniæ \" " + szukany.getText() + " \" na : " + nowyTekst.getText(), "Uwaga nast¹pi zmiana", JOptionPane.YES_NO_CANCEL_OPTION);
			
			if(opcja == 0)
			obszarTekstowy.replaceRange(nowyTekst.getText(), obszarTekstowy.getSelectionStart() , obszarTekstowy.getSelectionEnd());	
		}
		
		
	}

}
