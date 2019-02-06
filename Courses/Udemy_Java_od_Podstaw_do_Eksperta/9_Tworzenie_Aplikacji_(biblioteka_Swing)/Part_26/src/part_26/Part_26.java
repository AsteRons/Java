/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part_26;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;


public class Part_26 extends JFrame{

    private JDesktopPane desktopPane = new JDesktopPane();
    
    public Part_26()
    {
        initComponents();
        
    }

    public void initComponents()
    {
        
        this.setTitle("Wewnętrzna ramka");
        this.setBounds(500, 500, 500, 400);
        
        //  Stworzenie wewnętrznej ramki 1 
        JInternalFrame wewnRamka = new JInternalFrame("Tytul rameczki", true, true, true, true);
        wewnRamka.add(new JButton("Test"));
        wewnRamka.setVisible(true);
        wewnRamka.pack();
    //    wewnRamka.setFrameIcon(icon);
        
    
            //  Stworzenie wewnętrznej ramki 2 
        JInternalFrame wewnRamka2 = new JInternalFrame("Tytul rameczki 2", true, true, true, true);
        wewnRamka2.add(new JButton("Test2"));
        wewnRamka2.setVisible(true);
        wewnRamka2.pack();
        wewnRamka2.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
    wewnRamka.addInternalFrameListener(new InternalFrameListener(){
            
            public void internalFrameOpened(InternalFrameEvent ife) {
                
            }

            public void internalFrameClosing(InternalFrameEvent ife) {
               
             String odp =  JOptionPane.showInternalInputDialog(ife.getInternalFrame() , "Wpisz wyjscie");
            
             if(odp != null)
                 if(odp.equals("wyjście"))
                     System.exit(0);    // wychodzi z programu
                 else if(odp.equals("zamknij"))
                     ife.getInternalFrame().dispose();  // zamyka ramke
            }

          
            public void internalFrameClosed(InternalFrameEvent ife) {
               
            }

          
            public void internalFrameIconified(InternalFrameEvent ife) {
                
            }

            
            public void internalFrameDeiconified(InternalFrameEvent ife) {
               
            }

          
            public void internalFrameActivated(InternalFrameEvent ife) {
                
            }

            
            public void internalFrameDeactivated(InternalFrameEvent ife) {
                
            }
    
    
    });
    
        desktopPane.add(wewnRamka);
        desktopPane.add(wewnRamka2);
        
        
        this.getContentPane().add(desktopPane, BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    
    public static void main(String[] args) {
       
        new Part_26().setVisible(true);
        
    }
    
}
