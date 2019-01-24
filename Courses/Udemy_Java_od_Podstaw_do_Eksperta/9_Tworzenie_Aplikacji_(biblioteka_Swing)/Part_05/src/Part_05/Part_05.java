package Part_05;


import javax.swing.*;
import java.awt.*;


public class Part_05  extends JFrame{
	
	
	JButton button1 = new JButton("Button 1");
	JButton button2 = new JButton("Button 2");
	JButton button3 = new JButton("Button 3");
	JButton button4 = new JButton("Button 4");
	JButton bAnuluj = new JButton("Anuluj");
	
		public Part_05()
		{
			
		this.setBounds(300, 300, 300, 200);
		initComponents();
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		
			
		}
		
		public void initComponents()
		{
			GroupLayout loyout = new GroupLayout(getContentPane());	//stworzenie layouta
			this.getContentPane().setLayout(loyout);				//£¹czenie layouta z szybk¹
			
			
			//Ustawianie odstêpow w Layout
			
			loyout.setAutoCreateContainerGaps(true);
			loyout.setAutoCreateGaps(true);
			
			
			//Ustawienie poziome
			
			loyout.setHorizontalGroup(
					
					loyout.createSequentialGroup()
					.addComponent(button1, GroupLayout.DEFAULT_SIZE , GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					
					.addGroup(		
					loyout.createParallelGroup().addComponent(button2).addComponent(button4))
					
					.addComponent(button3)
					
					.addContainerGap(10, Short.MAX_VALUE)
					.addComponent(bAnuluj)
					);
			
			loyout.setVerticalGroup(
					
					loyout.createSequentialGroup()
							.addGroup(
					
							loyout.createParallelGroup().addComponent(button1).addComponent(button2).addComponent(button3)
							)
					.addComponent(button4)
					
					.addContainerGap(10, Short.MAX_VALUE)
					.addComponent(bAnuluj)
					
					);
			
			pack();
			
			
			
		}

		
	public static void main(String[] args) {

			new Part_05().setVisible(true);

	}

}
