

package part_25;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Part_25 extends JFrame{

    private JTabbedPane zakladki = new JTabbedPane();
    private JPanel panel = new JPanel();
    private JPanel panelTworzenia = new JPanel();
    
    
    public Part_25()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        this.setTitle("Zakładki");
        this.setBounds(500, 500, 500, 400);
        
        // Dodawanie zakładek, oraz zakładek z ikonkami
        panel.add(new JButton("tescior"));
        
        zakladki.addTab("Tab 1", new JLabel("to jest pierwszy"));
        zakladki.addTab("Drugi tab", new ImageIcon("videokurs.jpg"), panel, "Test");
             
        zakladki.addTab("Video Kurs", panelTworzenia);
        zakladki.setMnemonicAt(0, KeyEvent.VK_T);
        
        // Tworzenie programu do tworzenia nowej zakładki
        panelTworzenia.add(new JLabel("Stwórz nowy plik o nazwie: "));
        final JTextField nazwaNowejZakladki = new JTextField();
        panelTworzenia.add(nazwaNowejZakladki);
        JButton stworzZakladke = new JButton("Stwórz");
        panelTworzenia.add(stworzZakladke);
        
        stworzZakladke.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent ae) {
               
                
                JPanel panelTekstowy = new JPanel();
                
                panelTekstowy.setLayout(new GridLayout(1, 2));
                
                JTextArea obszarTekstowy = new JTextArea();
                panelTekstowy.add(new JScrollPane(obszarTekstowy));
                
                zakladki.addTab(nazwaNowejZakladki.getText() + ".txt", panelTekstowy);
                zakladki.setSelectedIndex(zakladki.getTabCount() - 1);
                
                
                obszarTekstowy.addKeyListener(new KeyAdapter(){
                   
                    public void keyPressed(KeyEvent e) {
                   
                        if(!(tytulZakladki + e.getKeyChar()).equals(przedZmianaObszaruTekstowego) && czyToAscii(e.getKeyChar()) && flagaZapisu == true)
                        {
                            przedZmianaObszaruTekstowego = tytulZakladki + e.getKeyChar();
                            zakladki.setTitleAt(indeksZakladki, tytulZakladki + "*");
                            flagaZapisu = false;
                        }
                       else if(e.isControlDown() && e.getKeyCode() == KeyEvent.VK_S && !flagaZapisu)
                        {
                            zakladki.setTitleAt(indeksZakladki, tytulZakladki);
                            System.out.print("Zapisujemy");
                            flagaZapisu = true;
                        }
                        
                    }
                    
                    private boolean czyToAscii(char zn)
                    {
                        for( int i = 0; i < 255; i++)
                            if(zn == i)
                                return true;
                        
                        return false;
                    }
                    
                    
                    String przedZmianaObszaruTekstowego = "";
                    int indeksZakladki = zakladki.getSelectedIndex();
                    String tytulZakladki = zakladki.getTitleAt(indeksZakladki);
                    boolean flagaZapisu = true;
                });
                
            }
        });
        
        zakladki.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);         // Tworzymy Scroll do Zakłądek
        
        this.getContentPane().add(zakladki);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    public static void main(String[] args) {
       
        new Part_25().setVisible(true);
    }
    
    
}
