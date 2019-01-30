package Part_13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Part_13 extends JFrame{

	private JPanel panel = new JPanel();
	
	public Part_13()
	{
		initComponents();

	}


	public void initComponents()
	{
		this.setTitle("Listy kombinowane");
		this.setBounds(500, 500, 500, 400);
	
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		new Part_13().setVisible(true);
	}

}
