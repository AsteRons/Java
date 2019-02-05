/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part_16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Part_16 extends JFrame{
    
   private JButton nowaRamka = new JButton("Stwórz ramkę");
   private  JFrame taRamka = this;

public Part_16()
{
    initComponents();
}
public void initComponents()
{
    this.setTitle("Aplikacja z wieloma ramkami");
    this.setBounds(500, 500, 500, 400);
    initButtons();
    
   
   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
}

private void initButtons()
{
    this.getContentPane().add(nowaRamka);
    nowaRamka.addActionListener(new ActionListener(){
        
        public void actionPerformed(ActionEvent e) {
           
            new Dialog(taRamka).setVisible(true);
        }
        
    });   
    
}

    
    public static void main(String[] args) {
        
        new Part_16().setVisible(true);
    }
    
}
