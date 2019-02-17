package part_03;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class Part_03 extends JFrame {

	
	//------------------------Pola------------
	
	private JPanel panelButtonow = new JPanel();
	private PanelAnimacji panelAnimacji = new PanelAnimacji();
	
	
	
	//------------------------Konstruktory------------
	
	public Part_03()
	{
		
		this.setTitle("Animacja kropelek");
		this.setBounds(450, 500, 500, 450);
		JButton bStart = (JButton)panelButtonow.add(new JButton("Start"));
		panelAnimacji.setBackground(Color.GRAY );
		
		
		
		bStart.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				
				startAnimation();
			}

		});
		
		
		this.getContentPane().add(panelAnimacji);
		this.getContentPane().add(panelButtonow, BorderLayout.SOUTH);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
	//------------------------Metody------------

	public static void main(String[] args) {

		
		new Part_03().setVisible(true);
	}

	
	
	
	public void startAnimation()
	{
		
		panelAnimacji.addKropelka();
		
	}
	
	
	//------------------------KLASY------------
	
	// Panel animacji
	
	class PanelAnimacji extends JPanel
	{
		
		ArrayList listaKropelek = new ArrayList();
		
		public void addKropelka() 
		{
			listaKropelek.add(new Kropelka());
			
			for(int i = 0; i < 1000; i++)
			{
				
				
				for(int j = 0; j < listaKropelek.size(); j++)
				{
					
					((Kropelka)listaKropelek.get(j)).ruszKropelka(this);;
		
				
				this.paint(this.getGraphics());
				try
				{
					Thread.sleep(1);

				}
				catch(InterruptedException ex)
				
				{
					
					System.out.println(ex.getMessage());
				}
				
				}
				
				
			}
				}

		
		
		
		
	        public void paintComponent(Graphics g)
			{
				
				super.paintComponent(g);
				
				for(int i = 0; i < listaKropelek.size(); i++)
				{
					g.drawImage(Kropelka.getImg(), ((Kropelka)listaKropelek.get(i)).x,  ((Kropelka)listaKropelek.get(i)).y, null);
				}
				
			}
			
	}

}


