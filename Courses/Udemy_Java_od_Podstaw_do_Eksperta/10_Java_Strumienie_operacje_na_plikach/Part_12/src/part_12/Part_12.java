package part_12;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.swing.*;


public class Part_12 extends JFrame{
	
    private DefaultListModel modelListy = new DefaultListModel() {
    	
    	ArrayList lista = new ArrayList();
    	
    	public void addElement(Object obj)
    	{
    		lista.add(obj);
    		super.addElement(((File)obj).getName());

    	}

    	public Object get(int index)
    	{
    		return lista.get(index);
    	}
    	
    	
    	public Object remove(int index)
    	{
    		lista.remove(index);
    		return super.remove(index);
    	}
    	
    	
    	
    };
    
	private JList lista = new JList(modelListy);
	
	private JButton dDodaj;
	private JButton dUsun;
	private JButton dZip;
	
	private JMenuBar pasekMenu = new JMenuBar();
	
	private JFileChooser wybieracz = new JFileChooser();

	public static final int BUFFOR = 1024; 
	
	public Part_12()
	{
		this.setTitle("Zipper");
		this.setBounds(400, 500, 500, 400);
		
		
		
		
		//---------- Menu----------
		
		this.setJMenuBar(pasekMenu);
		JMenu menuPlik = pasekMenu.add(new JMenu("Plik"));
		
		
		
		//---------- Akcja----------
		
		Action akcjaDodawania = new Akcja("Dodaj", "Dodaj nowy wpis", "ctrl D", new ImageIcon("dodaj.png"));
		Action akcjaUsuwania= new Akcja("Usun", "Usun zaznaczone wpisy w archiwum", "ctrl U",new ImageIcon("usun.png"));
		Action akcjaZipowania = new Akcja("Zip", "Zapisujemy plik do archiwum", "ctrl Z");
		
		
		//---------- Menu----------
		JMenuItem  menuOtwor = menuPlik.add(akcjaDodawania);
		JMenuItem  menuUsun = menuPlik.add(akcjaUsuwania);
		JMenuItem  menuZip = menuPlik.add(akcjaZipowania);
		
		

		//---------- Przyciski----------
		dDodaj = new JButton(akcjaDodawania);
		dUsun = new JButton(akcjaUsuwania);
		dZip = new JButton(akcjaZipowania);
		
		JScrollPane scroll = new JScrollPane(lista);
		
		
		
		
		//---------- Layoutu ----------
		lista.setBorder(BorderFactory.createEtchedBorder());
		
		GroupLayout layout = new GroupLayout(this.getContentPane());
		layout.setAutoCreateContainerGaps(true);   							// Odstepy od kontenera
		layout.setAutoCreateGaps(true);										//Odstepy od komponentow
		
		layout.setHorizontalGroup(
				
				layout.createSequentialGroup()
				.addComponent(scroll,100, 150, Short.MAX_VALUE)
				.addContainerGap(0, Short.MAX_VALUE)
				.addGroup(
						layout.createParallelGroup()
						.addComponent(dDodaj)
						.addComponent(dUsun)
						.addComponent(dZip)
						)
				);
		
		layout.setVerticalGroup(
				layout.createParallelGroup()
				.addComponent(scroll, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(
						layout.createSequentialGroup()
						.addComponent(dDodaj)
						.addComponent(dUsun)
						.addGap(5, 40, Short.MAX_VALUE)
						.addComponent(dZip)

						)
				
				);
		
		
		this.getContentPane().setLayout(layout);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
	}
	
	
	
	public static void main(String[] args) {

		new Part_12().setVisible(true);

	}

	
	
	
	
	
	
	private class Akcja extends AbstractAction
	{
		public Akcja(String nazwa, String opis, String klawiaturowySkrot)
		{
			this.putValue(Action.NAME, nazwa);
			this.putValue(Action.SHORT_DESCRIPTION, opis);
			this.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(klawiaturowySkrot));
			
		}

		
		public Akcja(String nazwa, String opis, String klawiaturowySkrot, Icon ikonka)
		{
			
		this(nazwa, opis, klawiaturowySkrot);
		this.putValue(Action.SMALL_ICON, ikonka);
			
		}
		
		public void actionPerformed(ActionEvent e) {
			
			
			if( e.getActionCommand().equals("Dodaj"))

				dodajWpisyDoArchiwum();
			
			else if (e.getActionCommand().equals("Usun"))
				usuwanieZListy();
			
			else if (e.getActionCommand().equals("Zip"))
				stworzArchiwumZip();
			
			
			
		}
		
		
		//------------------------ Metoda do dodawania wpisow------------------------ 
		
		private void dodajWpisyDoArchiwum()
		{

            wybieracz.setCurrentDirectory(new File(System.getProperty("user.dir")));
            wybieracz.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            wybieracz.setMultiSelectionEnabled(true);
            
            int tmp = wybieracz.showDialog(rootPane, "Dodaj do archiwum");
            
            if (tmp == JFileChooser.APPROVE_OPTION)
            {
                File[] sciezki = wybieracz.getSelectedFiles();
                
                for (int i = 0; i < sciezki.length; i++)
                  if(!czyWpisSiePowtarza(sciezki[i].getPath()))
                    modelListy.addElement(sciezki[i]);
                
            }
	
					
		}
		private boolean czyWpisSiePowtarza(String testowanyWpis) {
			
			for(int i = 0; i < modelListy.getSize(); i++)
				if(((File) modelListy.get(i)).getPath().equals(testowanyWpis))
					return true;
			
				return false;
			
		}
		
		
		
		//------------------------ Metoda do usuwania wpisow------------------------ 	
		
		private void usuwanieZListy()
		{
			
			int[] tmp = lista.getSelectedIndices();
			
			for(int i = 0; i < tmp.length; i++)
			{
				modelListy.remove(tmp[i] - i );
			}
		}
		
		//------------------------ Metoda do Archiwizacji----------------------- 	
		
		public void stworzArchiwumZip()
		{
			
			wybieracz.setCurrentDirectory(new File(System.getProperty("user.dir")));
			wybieracz.setSelectedFile(new File(System.getProperty("user.dir") + File.separator + "mojanazwa.zip"));
			int tmp = wybieracz.showDialog(rootPane, "Kompresuj");
			
		
			if(tmp == JFileChooser.APPROVE_OPTION)
			{
		
			byte tmpData[] = new byte[BUFFOR];
			
			try {
				
				ZipOutputStream zOutS = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(wybieracz.getSelectedFile()), BUFFOR));
				
				for(int i = 0; i < modelListy.getSize(); i++)
				{
					
					
					if(!((File)modelListy.get(i)).isDirectory())
						
					zipuj(zOutS, (File)modelListy.get(i), tmpData, ((File)modelListy.get(i)).getPath());
					
					else
					{
						wypiszSciezki((File)modelListy.get(i));
						
						for(int j = 0; j < listaSciezek.size(); j++)
							zipuj(zOutS, (File)listaSciezek.get(j), tmpData, ((File)modelListy.get(i)).getPath());
						listaSciezek.removeAll(listaSciezek);
					}
					
				}
				

				zOutS.close();
				
			} catch (IOException e) {
				
				System.out.println(e.getMessage());
				
			}

			
		}
		
	}
		
		//------------------------ Metody dodatkowe ----------------------- 	
		
	private void zipuj(ZipOutputStream zOutS, File sciezkaPliku, byte[] tmpData, String sciezkaBazowa) throws IOException
	{
		

			BufferedInputStream inS =  new BufferedInputStream(new FileInputStream(sciezkaPliku), BUFFOR);
		
			zOutS.putNextEntry(new ZipEntry(sciezkaPliku.getPath().substring(sciezkaBazowa.lastIndexOf(File.separator) + 1)));
			int counter;

			while((counter = inS.read(tmpData, 0, BUFFOR))  != -1)
			{
					zOutS.write(tmpData, 0, counter);
			}

			zOutS.closeEntry();
			inS.close();
		}

	
	
	ArrayList listaSciezek = new ArrayList();
	
	private  void wypiszSciezki(File nazwaSciezki)
	{
		
	String[] nazwyPlikowIKatalogow =	nazwaSciezki.list();
	
	
	for(int i = 0; i < nazwyPlikowIKatalogow.length; i++)
	{
		File p = new File(nazwaSciezki.getPath(), nazwyPlikowIKatalogow[i]);
		
		if(p.isFile())
		
			listaSciezek.add(p);
			
		if(p.isDirectory())
			wypiszSciezki(new File(p.getPath()));
	
	}
	
	
	
	
}

	
	
	
	}
		}
