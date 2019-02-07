/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part_20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Maciek
 */
public class Part_20 extends JFrame {

    private JMenuBar pasekMenu = new JMenuBar();
    private JCheckBoxMenuItem  tylkoDoOdczytu = new JCheckBoxMenuItem("Tylko do odczytu");
    private JRadioButton radioButton = new JRadioButton("RadioButton");
    private JTextArea obszarTekstowy = new JTextArea();
   
    private String przedZmianaObszaruTekstowego  = ""; 
    private boolean flagaObszaruTekstowego = false;
    private JButton   buttonZapisz;  
  

    
 

    public Part_20()
    {
        initComponents();
    }
      // Główny inicjalizator komponentów      
    private void initComponents()
    {
         addPasekMenu();
        this.setTitle("Działania");
        this.setBounds(500, 500, 500, 400);
        this.setJMenuBar(pasekMenu);
        this.getContentPane().setLayout(new GridLayout(2, 1));
        this.getContentPane().add(obszarTekstowy);
        this.getContentPane().add(buttonZapisz);
        
       
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
     
    }
     
    // Operacja obsługi zapisu na dwa przyciski
    
  private class ActionSave extends AbstractAction
  {

      public ActionSave(String nazwa, String podpowiedz, String klawiaturowySkrot, Icon ikon, int memonicKey)
      {
          this.putValue(Action.NAME, nazwa);
          this.putValue(Action.SHORT_DESCRIPTION, podpowiedz);
          this.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(klawiaturowySkrot));
          this.putValue(Action.SMALL_ICON, ikon);
          this.putValue(Action.MNEMONIC_KEY, memonicKey);
          
      }
        public void actionPerformed(ActionEvent e) {
            
                System.out.println("ZAPISUJEMY NA DYSKU");
                this.setEnabled(flagaObszaruTekstowego = false);
        }
      
  }
  

    // Metoda do sprawdzania czy znak jest ASCII
    private boolean czyToAscii(char zn)
            {
                for(int i = 0; i < 256; i++)
                {
                    if(zn == i)
                    return true;
                }
                return false;
            }
    
    
    
    // Funkcja do dodawania Menue oraz działania przycisków
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
        
        
        Action actionSave = new ActionSave("Zapisz", "Zapisanie pliku na dysku. ","ctrl S", new ImageIcon("Smart_Media.png"), KeyEvent.VK_Z);
        
        final JMenuItem zapiszMenu = menuPlik.add(actionSave);
         buttonZapisz = new  JButton(actionSave);  
         actionSave.setEnabled(false);
         
         
         /*
         
         
        //
       
        zapiszMenu.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent ae) {
                
                System.out.println("ZAPISUJEMY NA DYSKU");
                zapiszMenu.setEnabled(flagaObszaruTekstowego = false);
            }
        
        
        });
        
         //Podpowiedzi i skróty
         
        zapiszMenu.setToolTipText("Zapisanie pliku na dysku. ");
        zapiszMenu.setMnemonic('Z');
        zapiszMenu.setAccelerator(KeyStroke.getKeyStroke("ctrl S"));
        */
        
       
        //Pasek Menu
         menuPlik.setMnemonic('P');
         
         
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
                actionSave.setEnabled(false);
                else
                actionSave.setEnabled(flagaObszaruTekstowego);
                
            }
        
        
        
        });
        
        
    // Pasek Pomoc
    JMenu menuPomoc = pasekMenu.add(new JMenu("Pomoc"));
    menuPomoc.add( new JMenuItem("FAQ"));
        
        
        
    //Obsługa obszaru tekstowego    
    obszarTekstowy.addKeyListener(new KeyAdapter() {
        
    public void keyTyped(KeyEvent ke) {
                if(tylkoDoOdczytu.isSelected())
                    ke.consume();
        
    }

    public void keyPressed(KeyEvent ke) {
        
        if( tylkoDoOdczytu.isSelected())   // zabezpiecza przed kopiowaniem
         ke.consume();
        else if(!(obszarTekstowy.getText() +  ke.getKeyChar()).equals(przedZmianaObszaruTekstowego) && czyToAscii(ke.getKeyChar()))
        {
            przedZmianaObszaruTekstowego = obszarTekstowy.getText() + ke.getKeyChar();
            actionSave.setEnabled(flagaObszaruTekstowego = true);
            
        }   
            
        System.out.println(obszarTekstowy.getText() + ke.getKeyChar());
        
        
    }
 
        });
   
    }
    
    
    public static void main(String[] args) {

        new Part_20().setVisible(true);
        
        
        
    }
    
}
