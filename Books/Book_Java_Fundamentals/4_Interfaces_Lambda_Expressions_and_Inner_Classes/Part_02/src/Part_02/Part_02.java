package Part_02;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;


public class Part_02 {

	public static void main(String[] args) {
		
		ActionListener listener = new TimePrinter();
		
		Timer t = new Timer(1000, listener);
		t.start();
		
		JOptionPane.showMessageDialog(null, "Zamkn¹æ panel");
		System.exit(0);


	}

}


class TimePrinter implements ActionListener
{  
   public void actionPerformed(ActionEvent event)
   {  
      Date now = new Date();
      System.out.println("Kiedy us³yszysz dzwiêk, bêdzie godzina" + now);
      Toolkit.getDefaultToolkit().beep();
   }
}