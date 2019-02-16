package part_11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;


public class Part_11 extends JFrame{

	
	private JPanel panelButtonow = new JPanel();
	private JButton button1 = new JButton("Otwórz");
	private JButton button2 = new JButton("Zapisz");	
	private String[] ROZSZERZENIA_TEKSTOWE = new String[] {".txt", ".xml"};
	
	
	
	public Part_11()
	{
		this.setTitle("Okno wyboru plikow");
		this.setBounds(450, 500, 500, 450);
		
		final JFileChooser wyborPlikow = new JFileChooser();
		wyborPlikow.setCurrentDirectory(new File(System.getProperty("user.dir")));
		wyborPlikow.setMultiSelectionEnabled(true);
		
		wyborPlikow.setAcceptAllFileFilterUsed(true);
	
		
		// Filtry
		
		wyborPlikow.setFileFilter(new FiltrRozszerzen("Pola tekstowe", ROZSZERZENIA_TEKSTOWE));
		
		
		// filtr do wyboru tylko katalogow
        wyborPlikow.setFileFilter(new FileFilter() {
        	

            public boolean accept(File f) 
            {
                return f.isDirectory();
            	
            }

           
            public String getDescription() 
            {
               return "Katalogi";
            }
        	
        });
		
        
		button1.addActionListener(new ActionListener(){

			
			public void actionPerformed(ActionEvent arg0) {
				
			int tmp = wyborPlikow.showOpenDialog(rootPane);
				
			stworzPlikZip(wyborPlikow.getSelectedFiles());
			
			}
		});
		
		
		
		button2.addActionListener(new ActionListener(){

			
			public void actionPerformed(ActionEvent arg0) {
				
				wyborPlikow.showSaveDialog(rootPane);
				

			}
		});
		
		this.panelButtonow.add(button1);
		this.panelButtonow.add(button2);
		this.getContentPane().add(panelButtonow);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

	
	
	public void stworzPlikZip(File[] pliki)
	{
		for( int i = 0; i < pliki.length; i++ )
		System.out.println(pliki[i].getPath());;
			
	}
	
	
	
	public static void main(String[] args) {
		
		
		new Part_11().setVisible(true);

	}




private class FiltrRozszerzen extends FileFilter
{

   private String opis;
   private String[] rozszerzenia;
   
   public FiltrRozszerzen(String opis, String[] rozszerzenia)
   {
	   this.opis = opis;
	   this.rozszerzenia = rozszerzenia;
   }
   
   
    public boolean accept(File f) 
    {
    	for(int i = 0; i < this.rozszerzenia.length; i++)
    		if(f.getName().toLowerCase().endsWith(this.rozszerzenia[i]) || f.isDirectory())
    		  return true;
    		

    		
    		  return false;

	
    }

   
    public String getDescription() 
    {
       return opis;
    }
	
}
}
