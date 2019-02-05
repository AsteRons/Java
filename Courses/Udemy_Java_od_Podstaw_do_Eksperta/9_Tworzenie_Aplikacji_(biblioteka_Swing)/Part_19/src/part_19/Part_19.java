/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part_19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Maciek
 */
public class Part_19 extends JFrame {

    private JMenuBar pasekMenu = new JMenuBar();
    private JCheckBoxMenuItem  tylkoDoOdczytu = new JCheckBoxMenuItem("Tylko do odczytu");
    private JRadioButton radioButton = new JRadioButton("RadioButton");
    
    public Part_19()
    {
        initComponents();
    }
            
    private void initComponents()
    {
        this.setTitle("Pasek Menue");
        this.setBounds(500, 500, 500, 400);
        this.setJMenuBar(pasekMenu);
        
        
        addPasekMenu();
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
     
    }
    
    private void addPasekMenu()
    {
        // Pasek Plik
        JMenu menuPlik = pasekMenu.add(new JMenu("Plik"));
        JMenuItem podNowyPlik = menuPlik.add(new JMenuItem("Nowy"));
        podNowyPlik.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent ae) {
               System.out.println("podNowyPlik");
            }

        });
        menuPlik.addSeparator();
        JMenuItem zapiszMenu = menuPlik.add(new JMenuItem("Zapisz"));
        menuPlik.addSeparator();
        menuPlik.add(new JMenuItem("Wczytaj")); 
        menuPlik.addSeparator();
        
        JMenu menuOpcje = new JMenu("Opsje");
        menuPlik.add(menuOpcje);
        menuOpcje.add(new JMenuItem("Opcja 1"));
        menuOpcje.add(new JMenuItem("Opcja 2"));        
        menuOpcje.add(new JMenuItem("Opcja 3"));        
        menuOpcje.add(tylkoDoOdczytu);
        menuOpcje.add(radioButton);
        tylkoDoOdczytu.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e) {
            
                if(tylkoDoOdczytu.isSelected())
                    zapiszMenu.setEnabled(false);
                else
                zapiszMenu.setEnabled(true);
                
            }
        
        
        
        });
        
        
        // Pasek Pomoc
        JMenu menuPomoc = pasekMenu.add(new JMenu("Pomoc"));
        menuPomoc.add( new JMenuItem("FAQ"));
        
        
    }
    
    public static void main(String[] args) {

        new Part_19().setVisible(true);
        
        
        
    }
    
}
