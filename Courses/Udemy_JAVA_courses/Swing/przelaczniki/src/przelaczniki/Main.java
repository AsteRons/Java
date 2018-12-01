package przelaczniki;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Main extends JFrame
{
	public Main()
	{
		initComponents();
	}

	public void initComponents()
	{
	
		this.setTitle("Grupy Prze³¹czników Radio");
		this.setBounds(300, 300, 300, 200);
		panel2.add(etykieta);
		
		
		zbudujPrzelacznikRozmiar("Maly",15);
		zbudujPrzelacznikRozmiar("Sredni",25);
		zbudujPrzelacznikRozmiar("Duzy",35);
		
		zbudujPrzelacznikKolor("Zielony", Color.GREEN);
		zbudujPrzelacznikKolor("Czerwony", Color.RED);		
		zbudujPrzelacznikKolor("Niebieski", Color.BLUE);	
		
		
		
		this.getContentPane().add(panel, BorderLayout.NORTH);			//dodanie panelu o nazwie 
		this.getContentPane().add(panel2, BorderLayout.SOUTH);
		this.getContentPane().add(panel3, BorderLayout.CENTER);
		this.setDefaultCloseOperation(3);
	}
	
	
	
	
	
	
	
	public void zbudujPrzelacznikRozmiar(String nazwa,final int rozmiar)
	{
		JRadioButton przelacznik = new JRadioButton(nazwa);
		
		przelacznik.addActionListener(new ActionListener(){				//implementacja nas³uchiwacza
			
			public void actionPerformed(ActionEvent e)		
			{
				etykieta.setFont(new Font("Monospaced", Font.BOLD, rozmiar));	//Ustawianie czcionki 
			}
			
			
			
		});
		groupSize.add(przelacznik);
		panel.add(przelacznik);
		
	}
	
	
	public void zbudujPrzelacznikKolor(String nazwa,final Color kolor)
	{
		JRadioButton przelacznik = new JRadioButton(nazwa);
		
		przelacznik.addActionListener(new ActionListener(){				//implementacja nas³uchiwacza
			
			public void actionPerformed(ActionEvent e)		
			{
				etykieta.setForeground(kolor);
			}
			
			
			
		});
		groupColor.add(przelacznik);
		panel3.add(przelacznik);
		
	}
	
	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JLabel etykieta = new JLabel("Coœ");
	
	ButtonGroup groupSize = new ButtonGroup();		//implementacja grupy  groupSize
	ButtonGroup groupColor = new ButtonGroup();		//implementacja grupy  groupSize
	
	public static void main(String[] args)
	{

			new Main().setVisible(true);
	}

}
