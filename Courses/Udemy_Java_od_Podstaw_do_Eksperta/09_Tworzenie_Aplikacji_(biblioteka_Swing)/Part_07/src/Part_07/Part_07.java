package Part_07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Part_07 extends JFrame {
	
	
	static int i = 1;
	
	public Part_07()
	{
		super("Zegarek");
		this.setBounds(300, 300, 300, 200);
		initComponents();
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	
	public void initComponents()
	{
		
		panel.add(etykieta);
		panel.add(czas);
		
		ActionListener stoper = new  Zegar();
		Timer zegar = new Timer(1000, stoper);
		
		
		zegar.start();
		this.getContentPane().add(panel);
		
	}
	
	JPanel panel = new JPanel();
	
	JLabel etykieta = new JLabel("Czas: ");
	JLabel czas     = new JLabel(pobierzCzas());
	
	
	private class Zegar implements ActionListener
	{

		
		public void actionPerformed(ActionEvent e) {
			
			
				
			
			czas.setText(pobierzCzas());
		}
		
	}
	

	public String pobierzCzas()
	{
		GregorianCalendar kalendarzyk = new GregorianCalendar();
			
			String h = "" + kalendarzyk.get(Calendar.HOUR_OF_DAY);
			String m = "" + kalendarzyk.get(Calendar.MINUTE);
			String s = "" + kalendarzyk.get(Calendar.SECOND);
			
			if(Integer.parseInt(h) < 10)
				h = "0" + h;
			
			if(Integer.parseInt(m) < 10)
				m = "0" + m;
			
			if(Integer.parseInt(s) < 10)
				s = "0" + s;
		
		return "" + h + ":" + m + ":" + s;
		
	}
	
	public static void main(String[] args) {
		
		new Part_07().setVisible(true);

	}

}
