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
		
		
		//Prze³¹cznik RadioButton
		JRadioButton malyprzelacznik = new JRadioButton("Ma³y", false);		//prze³¹cznik o nazwie maly i odznaczony 
		JRadioButton sredniprzelacznik = new JRadioButton("Sredni", false);		//prze³¹cznik o nazwie maly i odznaczony 
											//dodanie prze³¹cznika do panelu
		
		
		groupSize.add(malyprzelacznik);
		groupSize.add(sredniprzelacznik);
		
			panel.add(malyprzelacznik);	
			panel.add(sredniprzelacznik);	
		
		this.getContentPane().add(panel, BorderLayout.NORTH);			//dodanie panelu o nazwie 
		this.getContentPane().add(panel2, BorderLayout.CENTER);
		
		this.setDefaultCloseOperation(3);
	}
	
	
	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();
	JLabel etykieta = new JLabel("Coœ");
	
	ButtonGroup groupSize = new ButtonGroup();
	
	public static void main(String[] args)
	{

			new Main().setVisible(true);
	}

}
