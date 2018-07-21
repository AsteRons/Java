package GroupLayout;


import javax.swing.*;
import java.awt.*;

// Grupowy Layout	-	 grupujemmy komponenty poziomo i pionowo

public class Main  extends JFrame
{

	public Main()
	{
	this.setBounds(300, 300, 300, 200);
	
	initComponents();
	this.setDefaultCloseOperation(3);
	
	
	
	}
	
	
	public void initComponents()
	{
	
	 GroupLayout layout = new GroupLayout(getContentPane());	//stworzenie layout(uk�ad) i dodanie do niej szybki
	 this.getContentPane().setLayout(layout);					//wywo�anie panelu i ustawienie lauout
		
	  
	 
	 
	 layout.setAutoCreateGaps(true);
	 layout.setAutoCreateContainerGaps(true);
	 
	 
	//ustawienie grupe poziom�  	Horizontal
	 
	 layout.setHorizontalGroup(
			 layout.createSequentialGroup()						//tworzenie grupy w sekwencji
			 .addComponent(button1)						//a,b,c,d /b-minimalna wielkosc, c- preferowana wielkosc, d- max wielkosc / GroupLayout().Defaulty.Size- domy�lny lub Shore.MAX_VALUR-niesko�czonos�
			 .addGroup(
					 layout.createParallelGroup()  				//Paraelle- r�wnoleg�y
							 .addComponent(button2)
							 .addComponent(button4)
							  )
							 
			 .addComponent(button3)
			 
			 
			 .addContainerGap(10, Short.MAX_VALUE) //dodajemy dziure kontenerow�
			 .addComponent(JAnuluj)
			 );
	 

	 
	 // ustawiamy grup� pionow�  Vertical
	 
	 layout.setVerticalGroup(
			 layout.createSequentialGroup()
			 .addGroup(
					 layout.createParallelGroup().addComponent(button1).addComponent(button2).addComponent(button3)	 
			 )
			 .addComponent(button4)	 
			 .addComponent(JAnuluj)
			 );
	 
	 
	 
	 
		
	}
	
	
	//deklaracja przycisk�w
	
	JButton button1 = new JButton("Button 1");
	JButton button2 = new JButton("Button 2");
	JButton button3 = new JButton("Button 3");
	JButton button4 = new JButton("Button 4");
	JButton JAnuluj = new JButton("Anuluj");
	

	public static void main(String[] args) {

		new Main().setVisible(true);
	}

}
