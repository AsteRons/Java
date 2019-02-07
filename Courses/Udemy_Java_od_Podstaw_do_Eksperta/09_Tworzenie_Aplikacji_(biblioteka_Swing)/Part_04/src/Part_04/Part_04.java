package Part_04;

import javax.swing.*;
import java.awt.*;


public class Part_04  extends JFrame {

	public Part_04()
	{
		this.setBounds(300, 320, 300, 200);
		
		initComponents();
		
	   
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public void initComponents()
	
	{
		
		
		button1.setPreferredSize(new Dimension(100, 100));
		button2.setPreferredSize(button2.getPreferredSize());
		
		panel1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT); //stawianie orientacji
		
		panel1.add(button1);												//Wpisywanie przycisków na panel
		panel1.add(button2);
		panel1.add(button3);
		panel1.add(button4);
		
		
		this.getContentPane().add(panel1 , BorderLayout.CENTER);			//Dodawanie panelu na g³owny panel
		
		
	
	}
	
	JPanel panel1= new JPanel(new FlowLayout(FlowLayout.CENTER));
	
	JButton button1 = new JButton("Button1");
	JButton button2 = new JButton("Button2");
	JButton button3 = new JButton("Button3");
	JButton button4 = new JButton("Button4");
	
	public static void main(String[] args) {
	
		new Part_04().setVisible(true);

	}

}
