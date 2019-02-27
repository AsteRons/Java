package part_06;


import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;


public class TalkingClock {

	public void start(int interval, boolean beep)
	{
		
		ActionListener listner = new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Kiedys uslyszysz dziwek, bedzie godzina " + new Date());
				if(beep) Toolkit.getDefaultToolkit().beep();
			}

		};

	Timer t = new Timer(interval, listner); 
	t.start();
	}

}
