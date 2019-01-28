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
		
		this.getContentPane().add(obszarPrzewijania, BorderLayout.NORTH);	
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	
	private  JTextArea obszarTekstowy = new JTextArea(7, 1_0);
	private JScrollPane  obszarPrzewijania = new JScrollPane(obszarTekstowy);
	
	public static void main(String[] args) {
		new Part_12().setVisible(true);

	}

}
