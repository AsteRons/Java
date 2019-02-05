/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part_21;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Part_21 extends JFrame{
    
    public Part_21()
    {
        initComponents();
    }
    
    
    private void initComponents()
    {
        this.setTitle("Menu kontekstowe");
        this.setBounds(500, 500, 500, 400);
        final  JPopupMenu menuKontekstowe = new JPopupMenu();
        menuKontekstowe.add(new JMenuItem(new AbstractAction("Zamknij"){
        
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        
        
        
        }));
        menuKontekstowe.add(new JMenuItem("Kopiuj"));
        menuKontekstowe.add(new JMenuItem("Wklej"));
         
        
        
        this.getContentPane().addMouseListener(new MouseAdapter(){
                
            public void mouseReleased(MouseEvent me) {
                
                    System.out.println("zwolnienie");
                
                    if(me.getClickCount() == 3 && me.getButton() == MouseEvent.BUTTON1)
                        JOptionPane.showMessageDialog(rootPane, "Przestń klikać! : " + me.getClickCount());
                    
                    if(me.isPopupTrigger())
                    menuKontekstowe.show(me.getComponent(), me.getX(), me.getY());
                        
            }

            
           
        
        });
        
        
        
        this.getContentPane().add(testowiec, BorderLayout.SOUTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    
    
    private JButton testowiec = new JButton("Test");
    
    public static void main(String[] args) {
    
        
      new Part_21().setVisible(true);
        
    }
    
}
