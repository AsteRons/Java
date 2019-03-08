package part_03;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.logging.*;
import javax.swing.*;

public class ImageViewerFrame  extends JFrame{

	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 400;
	
	
	private JLabel label;
	private static Logger logger = Logger.getLogger("com.horstmann.corejava");
	
	public ImageViewerFrame()
	{
		
		//Pasek menu
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("Plik");
		setJMenuBar(menuBar);
		
		JMenuItem openItem = new  JMenuItem("Otworz");
		menu.add(openItem);
		openItem.addActionListener(new FileOpenListener());
		
		JMenuItem exitItem = new JMenuItem("Zamknij");
		menu.add(exitItem);
		
		
		exitItem.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent event) {
				
				logger.fine("Zamykanie.");
				System.exit(0);
				
			}
		});
			
		// Etykieta
		
		label = new JLabel();
		add(label);
		logger.exiting("ImageViewerFrame ", "<init>");

	}

	class FileOpenListener implements ActionListener
	{

		
		public void actionPerformed(ActionEvent event) {
			
			logger.entering("ImageViewerFrame.FileOpenListener", "actionPerformed", event);
			
			//Okno wyboru plików
			JFileChooser chooser = new JFileChooser();
			chooser.setCurrentDirectory(new File("."));
			
			// Akceptowanie wszystkich plikow z rozszerzeniem gif
			
			chooser.setFileFilter(new javax.swing.filechooser.FileFilter()
					{
				public boolean accept(File f)
				{
					return f.getName().toLowerCase().endsWith(".gif") || f.isDirectory();
				}
				
				public String getDescription() {
					
					return "Obraz GIF";
				}
				});
			
			//Wyœwietlanie oka dialogowego wyboru plikow
			
			int r = chooser.showOpenDialog(ImageViewerFrame.this);
			
			// Jeœli plik obrazu zosta³ zaakceptowany, jest on ustawiony jako ikona etykiety
			
			if(r == JFileChooser.APPROVE_OPTION)
			{
				String name = chooser.getSelectedFile().getPath();
				logger.log(Level.FINE, "Wczytanie plikow {0}", name);
				label.setIcon(new ImageIcon(name));
			}
			else
				
				logger.fine("Anulowano okno otwierania pliku");
			logger.exiting("ImageViewerFrame.FileOpenListener", "actionPerformed");
			
			
			
		}

	}
	
}


