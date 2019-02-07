package Part_01;

import javax.swing.*;
import java.awt.*;

public class Ramka extends JFrame
{
	
	public Ramka()
	{  
		super("Tytu³ ramki");
		this.setBounds(100, 50, 500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// this.pack();
		
	}

	public static void main(String[] args) {

		new Ramka().setVisible(true);
	}

}
