/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part_27;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class Part_27 extends JFrame{

   JPanel panelListy = new JPanel();
   JPanel panelObrazka = new JPanel();
   JPanel panelOpisu = new JPanel();
   
   JLabel obrazek = new JLabel();
   JLabel opis = new JLabel();
   
   JList lista = new JList(
   new  Obrazek[]{
       
       new Obrazek("niebieski", " kolor niebieski"),
       new Obrazek("czerwony", " kolor czerwony"),
       new Obrazek("zielony", " kolor zielony"),
   
   
   
   });
   
   
    public Part_27()
    {
        initComponents();
        
    }
    public void initComponents()
    {
     this.setTitle("Podzielenie paneli");
     this.setBounds(500, 500, 500, 400);
        
     
     panelListy.add(lista);
     panelObrazka.add(obrazek);
     panelOpisu.add(opis);
     
     
     lista.addListSelectionListener(new ListSelectionListener(){
       
         
         public void valueChanged(ListSelectionEvent lse) {
            if(!lse.getValueIsAdjusting()) 
            {
            Obrazek img =  (Obrazek)((JList)lse.getSource()).getSelectedValue();
            
            obrazek.setIcon(img.getImage());
            opis.setText(img.getDescription());
            }
         }
     
     
     });
     

     JSplitPane podzielenie = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panelListy, panelObrazka);
     
     JSplitPane podzielenieGlowne = new JSplitPane(JSplitPane.VERTICAL_SPLIT, podzielenie, panelObrazka);
     
     
     
     
        this.getContentPane().add(podzielenieGlowne);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
  
    private class Obrazek
    {
        String nazwa, opis;
        ImageIcon obrazek;
        
        public Obrazek(String nazwa, String opis)
        {
            this.nazwa = nazwa;
            this.opis = opis;
            
            obrazek = new ImageIcon( nazwa + ".gif");
        }
        
        public String toString()
        {
            return nazwa;
        }
        
        public ImageIcon getImage()
        {
            return obrazek;
        }
        
        public String getDescription()
        {
            
            return opis;
        }
        
    }
    
    
    public static void main(String[] args) {
       
        new Part_27().setVisible(true);
    }
    
}
