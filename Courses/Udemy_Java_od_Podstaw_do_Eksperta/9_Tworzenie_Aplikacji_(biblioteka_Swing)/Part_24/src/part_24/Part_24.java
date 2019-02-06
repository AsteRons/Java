/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part_24;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Date;


public class Part_24 extends JFrame{

    
    JPanel panel = new JPanel();
    Calendar kalendarz = Calendar.getInstance();

    public Part_24()
    {
     initComponents();
     
    }


    public void initComponents()
    {
     
        this.setTitle("Spinners");
        this.setBounds(500, 500, 500, 400);
        
        String[] miesiace = new DateFormatSymbols().getMonths();
        MySpinnerListModel modelMiesiecy = new MySpinnerListModel(odetnijArray (miesiace, 0, 11));
        
        
        JSpinner spinner = new JSpinner(modelMiesiecy);
        // spinner.setEditor(new JTextArea("Tekst"));
        
        
        SpinnerNumberModel modelLiczb = new SpinnerNumberModel(1 , 1, 5, 2);
        
        
        JSpinner spinner2 = new JSpinner(modelLiczb);
        
        
            Date poczatkowaWartosc = kalendarz.getTime();
            kalendarz.add(Calendar.DAY_OF_MONTH, -20);
            Date minimalnaWartosc = kalendarz.getTime();
            kalendarz.add(Calendar.DAY_OF_MONTH, 40);
            Date maksymalnaWartosc = kalendarz.getTime();
        
            
        SpinnerDateModel modelDate = new SpinnerDateModel(poczatkowaWartosc, minimalnaWartosc, maksymalnaWartosc, Calendar.DAY_OF_MONTH);
        
        
        JSpinner spinner3 = new JSpinner(modelDate);
       
        panel.add(spinner);
        panel.add(spinner2);
        panel.add(spinner3);
         
        this.getContentPane().add(panel, BorderLayout.NORTH);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    // Klasa do tworzenia Spinnerów dla miesięcy 
    // Możliwość przechodzenia do przodu jak i do tyłu
    
    private class MySpinnerListModel extends SpinnerListModel
    {
        Object firstValue, lastValue;
        public MySpinnerListModel(Object[] values)
        {
            super(values);
            firstValue = values[0];
            lastValue = values[values.length - 1];
            
        }
    
         public Object getNextValue()
        {
            if(super.getNextValue() == null)
            return firstValue;
            else
            return super.getNextValue();
        }
        
       
         public Object getPreviousValue()
        {
            if(super.getPreviousValue() == null)
            return lastValue;
            else
            return super.getPreviousValue();
        }
 
    }
    
   
    
    /**
     * Metoda obcina tablice <code>operowany</code> od <code>poczatek</code> do <code>koniec</code>
     * @param operowany tablica, która będzie operowana
     * @param początek - odkad zacząć obcinanie
     * @param koniec - gdzie zakończyć obcinanie
     * @return zwraca obciętą tablice temp
     */
    private Object[] odetnijArray(Object[] operowany, int poczatek, int koniec)
    {
     
        // warunek zabezpiecza przed wpisaniem wartości po za sprzyjętym warunkiem
        
        koniec = koniec > operowany.length - 1 || koniec < 0 ? operowany.length - 1 : koniec;
        poczatek = poczatek < 0 || poczatek > koniec ? 0 : poczatek;
        
        Object[] tmp = new Object[koniec+1 - poczatek];
        
        for(int i = poczatek, j = 0; i < koniec + 1; i++, j++ )
        tmp[j] =  operowany[i];
                
        return tmp;
    }
    
        public static void main(String[] args) {
       
        new Part_24().setVisible(true);
    }
    
    
}
