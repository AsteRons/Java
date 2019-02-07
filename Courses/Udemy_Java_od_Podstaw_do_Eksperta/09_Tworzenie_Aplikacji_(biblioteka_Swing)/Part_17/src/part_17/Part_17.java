/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part_17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;


/**
 *
 * @author Maciek
 */

public class Part_17  extends JFrame{

    
    public Part_17()
    {
     
        initComponents();
        
    }
   
    
    
   private void initComponents()
   {
       
  this.setTitle("Krawędzie");
  this.setBounds(500, 500, 500, 400);
dodajPrzelacznik("createEtchedBorder", BorderFactory.createEtchedBorder());
dodajPrzelacznik("createLoweredBevelBorder", BorderFactory.createLoweredBevelBorder());


panelRadio.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
  panelRadio.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Krawędzie" ));
  
  this.getContentPane().setLayout(new GridLayout(2, 1));
  this.add(panelRadio);
  this.add(panelKrawedzi);
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
  
  private  JPanel panelRadio = new JPanel();
  private JPanel panelKrawedzi = new JPanel();
  private   ButtonGroup  groupRadio = new ButtonGroup();
  
  
  public void dodajPrzelacznik(final String nazwa, final Border kr)
  {
   
      JRadioButton przelacznik = new JRadioButton(nazwa);
      przelacznik.addActionListener(new ActionListener(){
          
          public void actionPerformed(ActionEvent ae) {
       
              panelKrawedzi.setBorder(BorderFactory.createTitledBorder(kr, nazwa));
              
          }
      });
      groupRadio.add(przelacznik);
      panelRadio.add(przelacznik);
   
  }
  
  
    public static void main(String[] args) {
        
        new Part_17().setVisible(true);
        
    }
    
}
