package Part_08;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class Part_08 extends JFrame{

	public Part_08()
	{
	
		
		initComponents();
	}
	
	public void initComponents()
	{
		this.setTitle("Grupy przelacznikow ratio");
		this.setBounds(500, 500, 500, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	
	public static void main(String[] args) {
			
		new  Part_08().setVisible(true);
		
	}

}
