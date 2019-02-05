
package part_18;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class Part_18 extends JFrame{

    JSlider suwak = new JSlider(JSlider.HORIZONTAL, 0, 40, 10);
    JTextField wartoscSuwaka = new JTextField("" + suwak.getValue());
    JLabel tekst = new JLabel("Coś");
    
    
    
    public Part_18()
    {
        initComponenents();
    }
    
    public void initComponenents()
    {
        this.setTitle("Suwak");
        this.setBounds(500, 500, 500, 400);
        
       
    obslugaSuwaka();
    obslugaText();   

        
       
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }

public void obslugaSuwaka()
{
        suwak.setMajorTickSpacing(5);
        suwak.setMinorTickSpacing(1);
        suwak.setPaintTicks(true);
        suwak.setPaintLabels(true);
        suwak.setSnapToTicks(true);
        suwak.addChangeListener(new ChangeListener(){
            
            public void stateChanged(ChangeEvent e) {
               
                
                wartoscSuwaka.setText("" + ((JSlider)e.getSource()).getValue());
                
                tekst.setFont(new Font(tekst.getFont().getFontName(), tekst.getFont().getStyle(), ((JSlider)e.getSource()).getValue()));
                
            }
        
        
        });
                
        this.getContentPane().add(suwak, BorderLayout.NORTH);
}



private void obslugaText()
{
    
    
    this.getContentPane().add(tekst, BorderLayout.CENTER);
    
    
     wartoscSuwaka.setEditable(false);
     this.getContentPane().add(wartoscSuwaka, BorderLayout.SOUTH);
     
     
}
    
    public static void main(String[] args) {

        new Part_18().setVisible(true);
    }
    
}
