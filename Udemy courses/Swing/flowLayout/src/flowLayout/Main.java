package flowLayout;


import javax.swing.*;
import java.awt.*;


public class Main extends JFrame {

	
	
	public Main()
	{
		
		this.setBounds(300, 300, 300, 200);	// ustawianie granicy
		initComponents();					// inicjalizacja  funckji z komponentami
		
		this.setDefaultCloseOperation(3);	// zamkni�cie
		
		
	}
	
	public void initComponents()
	{
		
		
		
		
		
		button1.setPreferredSize(new Dimension(100, 100));		//z panelem odczytuje t� wielkos�
		button2.setPreferredSize(button2.getPreferredSize());
		
		panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT); // ustawianie orientacji
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		
		
		
		this.getContentPane().add(panel, BorderLayout.PAGE_START); // nasza szybka
	}
	
	//JPanel - panel przytrzymuje tematyczne komponenty
	
	
	JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
	
	
	
	JButton button1 = new JButton("Button 1");
	JButton button2 = new JButton("Button 2");
	JButton button3 = new JButton("Button 3");
	JButton button4 = new JButton("Button 4");
	
	public static void main(String[] args) {

		
		new Main().setVisible(true);
	}

}