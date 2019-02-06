/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part_23;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class Part_23 extends JFrame{

    private JList listaPrzedmiotow = new JList(new String[]{
        "Matematyka",
        "Fizyka",
        "Informatyka",
        "Biologia",
        "Chemia",
        "WOS",
        "PO",
        "Historia",
        "Test",
    });
    
    private JPanel panelListy = new JPanel();
    private JScrollPane scrollListy = new JScrollPane(listaPrzedmiotow);
    private JPanel panelKomunikatu = new JPanel();
    private JLabel komunikat = new JLabel();
    private int i = 0;

    
    
    public Part_23()
    {
        initComponents();
    }

    
    public void initComponents()
    {
        this.setTitle("Lista");
        this.setBounds(500, 500, 500, 400);
        
        listaPrzedmiotow.setVisibleRowCount(4);
        listaPrzedmiotow.setFixedCellHeight(30);
        listaPrzedmiotow.setFixedCellWidth(200);
        listaPrzedmiotow.setSelectionBackground(Color.BLUE);
        listaPrzedmiotow.setSelectionForeground(Color.yellow);
        
        //listaPrzedmiotow.setLayoutOrientation(JList.VERTICAL);

        listaPrzedmiotow.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        listaPrzedmiotow.addListSelectionListener(new ListSelectionListener(){

            public void valueChanged(ListSelectionEvent lse) {
               
                System.out.println("Zmieniłem się" + (++i));
                
                if(lse.getValueIsAdjusting()) System.out.println("Trzymam button myszy");
                else
                    System.out.println("Puściłem button myszy");
                
                
                if(!lse.getValueIsAdjusting()) 
                {
                String zawartosc =   (String)((JList)lse.getSource()).getSelectedValue();
                
                
                    Object[] wartoscWLiscie = ((JList)lse.getSource()).getSelectedValues(); // Pobieranie naciśnietych danych do tablicy obiektów
               
                String przedmioty = "";
                
                for(int i = 0; i < wartoscWLiscie.length; i++)
                {
                    przedmioty += (String)wartoscWLiscie[i] + " ";
                }
                
                System.out.println(przedmioty);
                
                komunikat.setText("Nie lubie przedmiotów: " + przedmioty);
                
                }
 
            }

        });
        
        // Tworzymy domyślną listę
        final    DefaultListModel modelListy = new DefaultListModel();
    String[] tekst = new String[]{
        "Matematyka",
        "Fizyka",
        "Informatyka",
        "Biologia",
        "Chemia",
        "WOS",
        "PO",
        "Historia",
        "Test",
    };
        for(int i = 0; i < tekst.length; i++)
    modelListy.addElement(tekst[i]);
        
        
                 modelListy.addElement("k");
                 modelListy.addElement("g");
                 modelListy.addElement("h");
                 modelListy.addElement("la");
                 
        JList lista2 = new JList(modelListy);
              lista2.addListSelectionListener(new ListSelectionListener(){
            
            public void valueChanged(ListSelectionEvent lse) {
             //   modelListy.remove(0);
                
            }

              });
        
        
        panelListy.add(scrollListy);
        panelKomunikatu.add(komunikat);
        
        this.getContentPane().add(panelListy, BorderLayout.NORTH);
        this.getContentPane().add(panelKomunikatu, BorderLayout.CENTER);
        this.getContentPane().add(lista2, BorderLayout.SOUTH);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    
    

    
    public static void main(String[] args) {
        
    new Part_23().setVisible(true);
        
    }
    
}
