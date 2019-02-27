package part_06;


import  java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;


public class Part_06 {

	public static void main(String[] args) {

		TalkingClock clock = new TalkingClock();
		clock.start(1000, true);

		JOptionPane.showMessageDialog(null, "Zamkn¹æ program?");
		System.exit(0);
		
	}

}
