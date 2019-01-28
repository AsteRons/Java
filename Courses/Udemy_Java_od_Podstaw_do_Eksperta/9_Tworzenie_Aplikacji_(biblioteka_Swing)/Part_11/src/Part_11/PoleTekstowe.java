package Part_11;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class PoleTekstowe extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PoleTekstowe frame = new PoleTekstowe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	private boolean jestLiczba(char zn)
	{
		if(zn >= '0' && zn <= '9')	return true;

		return false;
	}
	
	

	/**
	 * Create the frame.
	 */
	public PoleTekstowe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		TextField textField = new TextField();
		textField.addKeyListener(new KeyAdapter() {
	
			public void keyTyped(KeyEvent e) {
				
				if(!jestLiczba(e.getKeyChar()))
				e.consume();
			}
			
			public void keyPressed(KeyEvent e) {
				
			if(e.isControlDown()	&&	e.getKeyCode() == KeyEvent.VK_V)
			{
				Clipboard 	clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				DataFlavor flawor	=	DataFlavor.stringFlavor;
				
				String schowek = "";
				
				try {
					schowek = (String)clipboard.getData(flawor);
					
				} catch (UnsupportedFlavorException e1) {
					e1.printStackTrace();
					System.out.println("To nie jest string");
					
				} catch (IOException e1) {
					
					System.out.println("Wyst¹pi³ b³¹d I/O");
				}
				
				//Sprawdzic czy kazda literka w stringu jest liczb¹
				
				for(int i = 0; i < schowek.length(); i++)
					if(!jestLiczba(schowek.charAt(i)))
					{
						e.consume();
						break;
					}
			}
			}
		});
		
		
		
		contentPane.add(textField, BorderLayout.NORTH);
	}
		
	

}
