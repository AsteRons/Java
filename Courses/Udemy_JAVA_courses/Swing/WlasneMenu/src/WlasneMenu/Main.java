package WlasneMenu;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;





public class Main extends JFrame
{
	
	
	public Main()
	{
		initComponents();
	}

	
	public void initComponents()
	{
		this.setTitle("Wlasne Manu");
		this.setBounds(300, 300, 300, 200);
		
		
		panelMenue.setLayout(new GridLayout(3,1));
		
		panelMenue.add(menu1);
		panelMenue.add(menu2);
		panelMenue.add(menu3);
		
		
		kontener.add(panelMenue);
		this.setDefaultCloseOperation(3);
	}
	
	

	
	private Container kontener = this.getContentPane();
	private JPanel panelMenue = new JPanel();
	
	
	//Implementacja 3 klawiszy o ro¿nych klawiszach
	MenuButton menu1 = new MenuButton("1. Dodaj");
	MenuButton menu2 = new MenuButton("2. Usun");
	MenuButton menu3 = new MenuButton("3. Zmien");

	
	//FocuseListener - Po naciœniêciu klawisza zmienia siê na inny kolor i po najechaniu na jeszcze innego wraca do domyœlnego
	
	private class MenuButton extends JButton implements FocusListener
	{
		
		//Dodanie s³uchacza klawiszy

		// nadanie zmiennych koloru
		private Color kFocusGained = Color.RED;
		private Color kFocusLost = Color.BLUE;
			
		
		//Implementacja domyœlnego konstruktowa
		public MenuButton(String nazwa)
		{
		super(nazwa);	
		
		//Dodanie nas³uchiwacza na przycisk
		this.addKeyListener(new KeyAdapter() {					//KeyAdapter - klasa adaptacyjna zdolna do nadpisania
			//gdy klikne np. literke a to najpierw jest keyPressed -> keyTyped ->keyReleased
				/*	public void keyTyped(KeyEvent e) {}	//Dla tych ,które s¹ drukowane

					public void keyReleased(KeyEvent e) {		}//Puszczenie klawisza
												
			*/


				
					public void keyPressed(KeyEvent e) {	//Trzymanie (klikniecie) klawisza
						
						//keyPressedHandler(e);
						
					}

					
					
			
		}
				
				
				);

			this.addFocusListener(this);
			this.setBackground(kFocusLost);
			

		}
		
		
		
		//Implementacja metod KeyPressed
		
		private void keyPressedHandler()
		{
			
		}
		

		//Implementacja metod Fosuce
	
		public void focusGained(FocusEvent arg0) {	//metoda po sfokusowaniu
			
			this.setBackground(Color.RED);
			
		}

		public void focusLost(FocusEvent arg0) {	//metoda po straceniu sfokusowania 

			this.setBackground(kFocusLost);
		}
		
		
		
	}
	
	public static void main(String[] args) {

		
		new Main().setVisible(true);
		

	}

}
