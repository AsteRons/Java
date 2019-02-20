package part_10;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class Part_10 extends JFrame
{
    public Part_10()
    {
        this.setTitle("Animacja kropelki");
        this.setBounds(250, 300, 300, 250);
        panelAnimacji.setBackground(Color.GRAY);
        JButton bStart = (JButton)panelButtonow.add(new JButton("Start"));
        
        bStart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
                startAnimation();
            }
        });
        
        JButton bStop = (JButton)panelButtonow.add(new JButton("Stop"));
        
        bStop.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
                stopAnimation();
            }
        });
        
        JButton bDodaj = (JButton)panelButtonow.add(new JButton("Dodaj"));
        
        bDodaj.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
                dodajAnimation();
            }
        });
                
        
        this.getContentPane().add(panelAnimacji);
        this.getContentPane().add(panelButtonow, BorderLayout.SOUTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void startAnimation()
    {
        panelAnimacji.startAnimation();
    }
    public void stopAnimation()
    {
        panelAnimacji.stop();
    }
    public void dodajAnimation()
    {
        panelAnimacji.addKropelka();
    }    
    private JPanel panelButtonow = new JPanel();
    private PanelAnimacji panelAnimacji = new PanelAnimacji();
    public static void main(String[] args) 
    {
        new Part_10().setVisible(true);
    }
    
    class PanelAnimacji extends JPanel
    {
        private volatile boolean zatrzymany = false;
        private Object lock = new Object();
        public void addKropelka()
        {
            listaKropelek.add(new Kropelka());
            watek = new Thread(grupaWatkow, new KropelkaRunnable((Kropelka)listaKropelek.get(listaKropelek.size()-1)));
            watek.start();
            
            grupaWatkow.list();
        }
        public void stop()
        {
            zatrzymany = true;
        }
        public void startAnimation() 
        {
            if(zatrzymany)
            {
                zatrzymany = false;
                synchronized(lock)
                {
                    lock.notifyAll();
                }
            }
        }        
        @Override
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            
            for (int i = 0; i < listaKropelek.size(); i++)
            {
                g.drawImage(Kropelka.getImg(), ((Kropelka)listaKropelek.get(i)).x, ((Kropelka)listaKropelek.get(i)).y, null);
            }
        }
        ArrayList listaKropelek = new ArrayList();
        JPanel ten = this;
        Thread watek;
        ThreadGroup grupaWatkow = new ThreadGroup("Grupa Kropelek");
        public class KropelkaRunnable implements Runnable
        {
            public KropelkaRunnable(Kropelka kropelka)
            {
               this.kropelka = kropelka;   
            }
            public void run()
            {
                    while (true)
                    {
                        synchronized(lock)
                        {
                            while(zatrzymany)
                            {
                                try 
                                {
                                    lock.wait();
                                } 
                                catch (InterruptedException ex) 
                                {
                                    ex.printStackTrace();
                                }
                            }
                        }
                        this.kropelka.ruszKropelka(ten);
                        repaint();
                        try 
                        {
                            Thread.sleep(10);
                        } 
                        catch (InterruptedException ex) 
                        {
                           ex.printStackTrace();
                        }
                    }
                
            }
            Kropelka kropelka;
        }
    }
}
