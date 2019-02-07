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

    private JToolBar pasekNarzedzi = new JToolBar("Nazwa nowej ramki");
    private  JButton button = new JButton("Wyłącz malowanie");
    private JPanel panel = new JPanel();
    private KolorowyButton aktywny = null;
    
    
    
    public Part_22()
    {
        initComponents();
       
    }
    
   private void initComponents()
   {
   
       this.setTitle("Pasek Narzędzi");
       this.setBounds(500, 500, 500, 400);
      
       pasekNarzedzi.add(new KolorowyButton(new ActionColor("Zmieniam kolor na zielony",   new ImageIcon("zielony.gif"),   Color.GREEN )));
       pasekNarzedzi.add(new KolorowyButton(new ActionColor("Zmieniam kolor na niebieski", new ImageIcon("niebieski.gif"), Color.BLUE )));       
       pasekNarzedzi.add(new KolorowyButton(new ActionColor("Zmieniam kolor na czerwony",  new ImageIcon("czerwony.gif"),  Color.RED )));       
       pasekNarzedzi.add(button);
       
       button.addActionListener(new ActionListener(){
           
           public void actionPerformed(ActionEvent ae) {
              
               panel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                 for(int i = 0; i < pasekNarzedzi.getComponentCount(); i++)
                    {
                        
                       if(pasekNarzedzi.getComponent(i) instanceof KolorowyButton)
                       {
                           KolorowyButton temp = (KolorowyButton)pasekNarzedzi.getComponent(i);
                           temp.setBackground(Color.WHITE);
                           temp.setZaznacziny(false);
                       }
                    }
                 aktywny = null;
                 
                 
               
           }
       });
       
       
       panel.addMouseListener(new MouseAdapter(){
       
       public void mousePressed(MouseEvent e)
       {
           if(aktywny != null)
           panel.setBackground((Color)aktywny.getAction().getValue("kolor"));
       }
           
       });
       
       
       this.getContentPane().setLayout(new GridLayout(2, 1));
       this.getContentPane().add(pasekNarzedzi, BorderLayout.NORTH);
       this.getContentPane().add(panel);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
  
   // Klasa do tworzenia akcji przycisku
   private class ActionColor extends AbstractAction
   {
       public ActionColor(String toolTip, Icon icon, Color colour)
       {
           this.putValue(Action.SHORT_DESCRIPTION, toolTip);
           this.putValue(Action.SMALL_ICON, icon);
           this.putValue("kolor", colour);
           
           
       }
        public void actionPerformed(ActionEvent ae) {
  
            aktywny = (KolorowyButton)ae.getSource();
        }

   }
   
   //Klasa do tworzenia przycisku
    private class KolorowyButton extends JButton
    {
        private KolorowyButton(final ActionColor actionColor) {
            
            super(actionColor);

            this.addActionListener(new ActionListener(){
              
                
                public void actionPerformed(ActionEvent ae) {
                   
                    for(int i = 0; i < pasekNarzedzi.getComponentCount(); i++)
                    {
                        
                       if(pasekNarzedzi.getComponent(i) instanceof KolorowyButton)
                       {
                           KolorowyButton temp = (KolorowyButton)pasekNarzedzi.getComponent(i);
                           temp.setBackground(Color.WHITE);
                           temp.setZaznacziny(false);

                       }
                      
                    }
                     //  panel.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
                      
                      panel.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("kursorek.png").getImage(), new Point(20, 17), "Nasz kursor"));
                    
                   ten.setBackground((Color)actionColor.getValue("kolor"));
                   ten.setZaznacziny(true);
                }

            });
        }
        
        
        // Funkcja do zmieniania flagi
        public void setZaznacziny(boolean zaznacz)
        {
        this.zaznaczony = zaznacz;
        }
        
        KolorowyButton ten = this;
        boolean zaznaczony = false; 
    }

    public static void main(String[] args) {

     new Part_22().setVisible(true);
    }
    
}
