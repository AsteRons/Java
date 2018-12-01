package etykieta;

// Tworzeine prostego zegarka 

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Main extends JFrame
{

	public Main()
	{
		super("Zegarek");		// Implementacja o tytule zegar
		this.setBounds(300, 300, 300, 200);		//Implementacja aplikacji o wymiarach x300

		initComponents();						//Inicjalizacja inicjalizacja komponent�w
		
		this.setDefaultCloseOperation(3);		//Co sie dzieje po wy��czeniu aplikacji
		
	}
	public void initComponents()				//definicja metody init
	{	
		panel.add(etykieta);					//dodanie etykiety do panelu
		panel.add(czas);						//dodanie czasu do panelu

		ActionListener stoper = new Zegar();	//stworzenie obiektu nasluchiwaczas stoper kt�ry pobiera dane z klasy Zegar
		
		Timer zegar = new Timer(1000, stoper);			// co 1s wywo�uje metode stoper
		zegar.start();
		
		this.getContentPane().add(panel);
	}
	
	
	JPanel panel = new JPanel();					//definicja Panelu
	JLabel etykieta = new JLabel("Czas: ");			// Definicja etykiety etykieta o Tytule Czas
	JLabel czas = new JLabel(pobierzCzas());						//definicja etykiety czas
	
	
	
	
	private class Zegar implements ActionListener	  //Ustawienie klasu zegar z nas�uchiwaczem , wywo�uje sie co 1s
	{


		public void actionPerformed(ActionEvent arg0) {	

		
		
		czas.setText(pobierzCzas());
		}
		
	}
	
	static int i = 1;
	public String pobierzCzas()	//inicjalizacja funckji kt�ry pobiera czas
	{

		GregorianCalendar kalendarz = new GregorianCalendar();	//pobieramy dane z klasy kalendarza Gregoria�skiego
		String   h =  ""+kalendarz.get(Calendar.HOUR_OF_DAY);		//pobieramy godziny
		String  min =  ""+kalendarz.get(Calendar.MINUTE);			//pobieramy minuty
		String  s =  ""+kalendarz.get(Calendar.SECOND);				//pobieramy sekundy
		
		
		if (Integer.parseInt(h) < 10) 		
		h = "0" + h;
		
		if (Integer.parseInt(min) < 10) 
		min = "0" + min;
		
		if (Integer.parseInt(s) < 10) 
		s = "0" + s;
		
		
		return h+":"+min+":"+s;			//zwracamy godzina:minuta:sekunda
	}
	public static void main(String[] args) {

		new Main().setVisible(true);
	}

}
