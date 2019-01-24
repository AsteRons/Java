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
		
		panel2.add(etykieta);
		panel.add(malyprzelacznik);
		panel.add(sredniprzelacznik);		
	
		
		this.getContentPane().add(panel, BorderLayout.NORTH);
		this.getContentPane().add(panel2, BorderLayout.CENTER);
		
		
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	JPanel panel  = new JPanel();
	JPanel panel2 = new JPanel();
	
	JLabel etykieta = new JLabel("Coœ");
    JRadioButton malyprzelacznik = new JRadioButton("Ma³y");
    JRadioButton sredniprzelacznik = new JRadioButton("Œredni");		
	
	
	public static void main(String[] args) {
			
		new  Part_08().setVisible(true);
		
	}

}
