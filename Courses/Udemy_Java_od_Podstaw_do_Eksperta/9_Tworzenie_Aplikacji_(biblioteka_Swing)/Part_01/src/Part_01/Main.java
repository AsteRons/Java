package Part_01;

import javax.swing.*;
import java.awt.*;

public class Main {

	
	public Main()
	{
		
		JFrame frame = new JFrame(); // Tworzymy obiekt ramki
		
		frame.setSize(500, 500);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // zamyka ramke
		
		frame.setVisible(true);	//Uwidocznienie ramki
		
		frame.setTitle("Tytu³ ramki");
		frame.setLocation(100, 100);
		
		frame.setBounds(10, 50, 500, 500);
		frame.setResizable(false);
		
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("ikonka.jpg"));
	}
	
	
	public static void main(String[] args) {
		
		
    new Main();
    
		
	}
	
	

}
