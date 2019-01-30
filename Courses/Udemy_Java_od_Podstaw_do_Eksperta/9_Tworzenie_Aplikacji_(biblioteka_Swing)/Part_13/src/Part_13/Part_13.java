package Part_13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Part_13 extends JFrame{

	private JPanel panel = new JPanel();
	private JComboBox kombinacja = new JComboBox();
	
	public Part_13()
	{
		initComponents();

	}


	public void initComponents()
	{
		this.setTitle("Listy kombinowane");
		this.setBounds(500, 500, 500, 400);
		kombinacja.addActionListener(new ActionListener()
				{

					
					public void actionPerformed(ActionEvent e) {
					
						ColorHandler obsluga =(ColorHandler)((JComboBox)e.getSource()).getSelectedItem();
					((JComboBox)e.getSource()).setBackground(obsluga.getColor());
					
					}
				});
		
		
	panel.add(kombinacja);
	
	kombinacja.addItem(new ColorHandler(Color.BLACK ,"Czarny"));
	kombinacja.addItem(new ColorHandler(Color.GREEN ,"Zielony"));
	kombinacja.addItem(new ColorHandler(Color.BLUE ,"Niebieski"));
	kombinacja.addItem(new ColorHandler(Color.YELLOW ,"¯ó³ty"));
	
	this.getContentPane().add(panel);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private class ColorHandler
	{
		private Color kolor;
		private String colorName;
		public ColorHandler(Color kolor, String colorName)
		{
			this.kolor = kolor;
			this.colorName = colorName;
		}
		
		public String toString()
		{
			return this.colorName;
		}
		
		public Color getColor()
		{
			return this.kolor;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		new Part_13().setVisible(true);
	}

}
