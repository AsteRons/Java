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
	
	 GroupLayout layout = new GroupLayout(getContentPane());	//stworzenie layout(uk³ad) i dodanie do niej szybki
	 this.getContentPane().setLayout(layout);					//wywo³anie panelu i ustawienie lauout
		
	  
	 
	 
	 layout.setAutoCreateGaps(true);
	 layout.setAutoCreateContainerGaps(true);
	 
	 
	//ustawienie grupe poziom¹  	Horizontal
	 
	 layout.setHorizontalGroup(
			 layout.createSequentialGroup()						//tworzenie grupy w sekwencji
			 .addComponent(button1)						//a,b,c,d /b-minimalna wielkosc, c- preferowana wielkosc, d- max wielkosc / GroupLayout().Defaulty.Size- domyœlny lub Shore.MAX_VALUR-nieskoñczonosæ
			 .addGroup(
					 layout.createParallelGroup()  				//Paraelle- równoleg³y
							 .addComponent(button2)
							 .addComponent(button4)
							  )
							 
			 .addComponent(button3)
			 
			 
			 .addContainerGap(10, Short.MAX_VALUE) //dodajemy dziure kontenerow¹
			 .addComponent(JAnuluj)
			 );
	 

	 
	 // ustawiamy grupê pionow¹  Vertical
	 
	 layout.setVerticalGroup(
			 layout.createSequentialGroup()
			 .addGroup(
					 layout.createParallelGroup().addComponent(button1).addComponent(button2).addComponent(button3)	 
			 )
			 .addComponent(button4)	 
			 .addComponent(JAnuluj)
			 );
	 
	 
	 
	 
		
	}
	
	
	//deklaracja przycisków
	
	JButton button1 = new JButton("Button 1");
	JButton button2 = new JButton("Button 2");
	JButton button3 = new JButton("Button 3");
	JButton button4 = new JButton("Button 4");
	JButton JAnuluj = new JButton("Anuluj");
	

	public static void main(String[] args) {

		new Main().setVisible(true);
	}

}
