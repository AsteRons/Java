/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part_22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Part_22 extends JFrame{

    JToolBar pasekNarzedzi = new JToolBar("Nazwa nowej ramki");
    
    
    public Part_22()
    {
        initComponents();
    }
    
   private void initComponents()
   {
   
       this.setTitle("Pasek Narzędzi");
       this.setBounds(500, 500, 500, 400);
      
       pasekNarzedzi.add(new JButton("Lala"));
       this.getContentPane().add(pasekNarzedzi, BorderLayout.NORTH);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   
   
    
    public static void main(String[] args) {

     new Part_22().setVisible(true);
    }
    
}
