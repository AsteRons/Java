package part_01;



import javax.swing.*;
import java.awt.*;


public class Part_01 extends JFrame
{
	
	private PanelRysowiak panelDoRysowania = new PanelRysowiak();

	Part_01()
	{
	
		this.setTitle("Rysowanie");
		this.setBounds(450, 500, 500, 450);
		
		
		
		
		this.getContentPane().add(panelDoRysowania);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		new Part_01().setVisible(true);

	}

}
