package part_05;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;


public class Part_05 {
	
	
	public static void main(String[] args) 
	{
	
		TalkingClock clock = new TalkingClock(1000, true);
		clock.start();
		
		JOptionPane.showMessageDialog(null, "Zamkn¹æ program");
		System.exit(0);

  }
}
