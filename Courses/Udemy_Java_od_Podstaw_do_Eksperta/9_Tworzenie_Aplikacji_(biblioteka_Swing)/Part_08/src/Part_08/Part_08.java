package Part_08;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class Part_08 extends JFrame{

/*
 * Tworzenie panelu, etykiery, grupy	
 */
	JPanel panel  = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JLabel etykieta = new JLabel("Cos");
	ButtonGroup  groupSize = new ButtonGroup();
	ButtonGroup  groupColor = new ButtonGroup();
	
	/*
	 *G³ówny konstruktor klasy g³ównej 
	 */
	
	public Part_08()
	{
	
		
		initComponents();
	}
	
	
	/*
	 * Metoda do inicjalizacji komponentów 
	 */
	
	public void initComponents()
	{
		this.setTitle("Grupy przelacznikow ratio");
		this.setBounds(500, 500, 500, 400);
		
		panel2.add(etykieta);
		
		/*
		 * Tworzenie przycisków za pomoc¹ metody
		 */
		
		
		zbudujPrzelacznikRozmiar("Ma³y"  , 15);
		zbudujPrzelacznikRozmiar("Sredni", 25);
		zbudujPrzelacznikRozmiar("Duzy"  , 35);
		
		zbudujPrzelacznikKolor("Zielony", Color.GREEN);
		zbudujPrzelacznikKolor("Czerwony", Color.RED);
		zbudujPrzelacznikKolor("Niebieski", Color.BLUE);
		/*
		 * Tworzenie przycisków radio rêcznie
		 * 
		
	    JRadioButton malyprzelacznik = new JRadioButton("Maly");
	    JRadioButton sredniprzelacznik = new JRadioButton("Sredni");	
		
		malyprzelacznik.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				etykieta.setFont(new Font("TimesRoman", Font.BOLD, 25));
			}
		});

		groupSize.add(malyprzelacznik);
		groupSize.add(sredniprzelacznik);
		
		panel.add(malyprzelacznik);
		panel.add(sredniprzelacznik);		
	*/
		
		
		
		this.getContentPane().add(panel, BorderLayout.NORTH);
		this.getContentPane().add(panel2, BorderLayout.SOUTH);
		this.getContentPane().add(panel3, BorderLayout.CENTER);
		
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	

	
	/*
	 * Metoda do tworzenia prze³¹czników ustawiaj¹cy rozmiar
	 */
	
	public void zbudujPrzelacznikRozmiar(String nazwa, final int rozmiar)
	{
		JRadioButton przelacznik = new JRadioButton(nazwa);
		przelacznik.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				etykieta.setFont(new Font("TimesRoman", Font.PLAIN, rozmiar));
				
			}
		}
			);
		
		
		groupColor.add(przelacznik);
		panel.add(przelacznik);
	}
	

	/*
	 * Metoda do tworzenia prze³¹czników ustawiaj¹cy Kolor
	 */
	
	
	public void zbudujPrzelacznikKolor(String nazwa, final Color kolor)
	{
		JRadioButton przelacznik = new JRadioButton(nazwa);
		
		przelacznik.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				etykieta.setForeground(kolor);
				
			}
		}
			);
		
		
		groupSize.add(przelacznik);
		panel3.add(przelacznik);
	}
	
	
	/*
	 * Metoda g³ówna
	 */
	
	public static void main(String[] args) {
			
		new  Part_08().setVisible(true);
		
	}

}
