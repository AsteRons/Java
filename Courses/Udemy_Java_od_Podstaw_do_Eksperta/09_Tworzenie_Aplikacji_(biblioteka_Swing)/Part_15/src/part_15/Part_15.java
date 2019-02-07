/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part_15;

/**
 *
 * @author Maciek
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Part_15  extends JFrame implements WindowListener{

    public Part_15()
    {
        initComponents();
    }
    /**
     * @param args the command line arguments
     */
    
   public void initComponents()
   {
       this.setTitle("Pola Wyboru");
       this.setBounds(500, 500, 500, 400);
       
       this.addWindowListener(new WindowAdapter(){
           
           public void windowOpened(WindowEvent we) {
     
        JOptionPane.showMessageDialog(rootPane, "Witaj 2!");
        
    }

       
       });
       
       
       this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
       
   }
    public static void main(String[] args) {
        
        new Part_15().setVisible(true);
    }

    @Override
    public void windowOpened(WindowEvent we) {
     
        JOptionPane.showMessageDialog(rootPane, "Witaj");
        
    }

   
    public void windowClosing(WindowEvent we) {
     
       int opcja =  JOptionPane.showConfirmDialog(rootPane, "Czy na pewno?"); // Jako wiadomosć
       if( opcja == 0)
           this.dispose();
    }

    
    public void windowClosed(WindowEvent we) {
      
        System.out.println("Zapisz dane na dysku");
    }

    
    public void windowIconified(WindowEvent we) {
       
                System.out.println("Program zostaje zmaksymalizowany");
        
    }

    
    public void windowDeiconified(WindowEvent we) {
        
        
             System.out.println("Program zostaje zminimalizowany");
             
    }

    @Override
    public void windowActivated(WindowEvent we) {
       System.out.println("Program zostaje aktywowany");
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        System.out.println("Program zostaje dezaktywowany");
    }
    
}
