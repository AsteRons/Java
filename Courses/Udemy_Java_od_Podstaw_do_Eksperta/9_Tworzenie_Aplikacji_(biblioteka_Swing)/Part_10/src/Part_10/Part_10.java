package Part_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Part_10 extends JFrame{

	
	public Part_10()
	{
		initComponents();
		
	}
	
	
	
	public void initComponents()
	{
		this.setTitle("Wlasne Menu");
		this.setBounds(500, 500, 500, 400);

		panelMenu.setLayout(new GridLayout(3, 1));
		
		panelMenu.add(menu1);
		panelMenu.add(menu2);
		panelMenu.add(menu3);
		
		kontener.add(panelMenu);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	
	private Container kontener = this.getContentPane(); 
	private JPanel panelMenu = new JPanel();
	MenuButton menu1 = new MenuButton("1. Dodaj");
	MenuButton menu2 = new MenuButton("2. Usuñ");
	MenuButton menu3 = new MenuButton("3. Zmieñ");
	private int i = 0;
		
	private class MenuButton extends JButton implements FocusListener, ActionListener
	{
		private Color kFocuseGained = Color.RED;
		private Color kFocusLost= Color.BLUE;
		
		// Konstruktor menu
		
		public MenuButton(String nazwa)
		{
			super(nazwa);
			this.addFocusListener(this);
			this.addActionListener(this);
			this.addKeyListener(new KeyAdapter() {
			
			
				public void keyPressed(KeyEvent e)
				{
					keyPressedHandler(e);
					
				}
				
			});
			
			this.setBackground(kFocusLost);
			
		}


		// 	Fokus po wciœniêciu
		
		public void focusGained(FocusEvent arg0) {

			this.setBackground(kFocuseGained);
		}


		public void focusLost(FocusEvent arg0) {

			this.setBackground(kFocusLost);
		}
		
		
		// Metoda co sie stanie gdy naciœniemy jakiœ przycisk
		private void keyPressedHandler(KeyEvent e)
		{
			int dlMenu	= panelMenu.getComponentCount();
			
			if( i == 0 ) i = 10 * dlMenu;
			
			if(e.getKeyCode() == KeyEvent.VK_DOWN)
			{
				// 1 % 3 = 1,	2 % 3 = 2,	3 % 3 = 0
				
				panelMenu.getComponent(++i % dlMenu).requestFocus();
			}else if(e.getKeyCode() == KeyEvent.VK_UP)
			{
				// 1 % 3 = 1,	2 % 3 = 2,	3 % 3 = 0
				
				panelMenu.getComponent(--i % dlMenu).requestFocus();
				
			} 
			else if(e.getKeyCode() == KeyEvent.VK_ENTER)	// Wykonuje klikniecie Enter
		{
		
			
				MenuButton temp = (MenuButton)e.getSource();
				temp.doClick();
		}
			
			
		}

		
		// Nas³uchiwacz

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			
			//Co sie stanie jak naciœniemy przycisk
			System.out.println("Enter");
			
			JOptionPane.showMessageDialog(this, ((MenuButton)arg0.getSource()).getText());
			
		}
		
	}
	
	public static void main(String[] args) {

		new Part_10().setVisible(true);
		
	}

}
