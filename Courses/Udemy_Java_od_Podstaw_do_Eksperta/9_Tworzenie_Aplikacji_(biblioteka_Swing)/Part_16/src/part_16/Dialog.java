/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part_16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Dialog extends JDialog{
    static int nr_ramki = 0;

public Dialog(JFrame parent)
{
    
    super(parent, true);
    initComponents();
    
    int szer = (int)parent.getBounds().getWidth();
    int wys = (int)parent.getBounds().getHeight();
    
  //  this.setSize(szer/10, wys/4);
    
    int szerRamki = this.getSize().width;
    int wysRamki = this.getSize().height;
    
    this.setLocation(parent.getBounds().x + (szer - szerRamki)/2,parent.getBounds().y + (wys - wysRamki)/2);
    
}
public void initComponents()
{
    this.setTitle("To jest ramka numer " + (++nr_ramki) );
     this.setBounds(300, 300, 300, 200);

   this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
}




public static void main(String[] args) {
        
     
    }
    
    
    
    
}
