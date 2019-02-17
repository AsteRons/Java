package part_01;

import java.awt.*;
import javax.swing.*;

public class PanelRysowiak extends JPanel{

	public static int i = 0;
	
	
	public PanelRysowiak()
	{
		super();
		
		this.add(new JButton("Test") {
			
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				System.out.println(i++);
				
				
			}

		});
		
	}
	
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.drawString("Napis",0 , 40);
		g.drawImage(new ImageIcon("kropelka.gif").getImage(), 0, 80, null);
		g.drawRect(40, 40, 120, 80);
		g.drawLine(40, 40, 80, 80);
	}

	
}
