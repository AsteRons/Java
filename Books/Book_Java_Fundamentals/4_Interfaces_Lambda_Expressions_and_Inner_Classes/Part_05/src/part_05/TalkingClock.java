package part_05;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;


public class TalkingClock {

	private int interval;
	private boolean beep;
	
	
	public TalkingClock(int interval, boolean beep)
	{
		this.interval = interval;
		this.beep = beep;
	}
	
	/**
	 * W��cz zegar
	 */
	public void start()
	{
		ActionListener listener = new TimePrinter();
		Timer t = new Timer (interval, listener);
		t.start();
	}
	
	public class TimePrinter implements ActionListener
	{

		
		public void actionPerformed(ActionEvent event) {
			System.out.println("Kiedy us�yszysz dzwi�k, bedzie godzina " + new Date());
			if(beep) Toolkit.getDefaultToolkit().beep();
			
		}
		
	}
	
}
