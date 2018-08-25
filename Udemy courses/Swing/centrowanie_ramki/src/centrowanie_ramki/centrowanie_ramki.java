package centrowanie_ramki;


import javax.swing.*;
import java.awt.*;


public class centrowanie_ramki extends JFrame
{

	public centrowanie_ramki()
	{
		
		// �rdokuje ramk� na �rodku nie wa�ne od jej wielko�ci
		
		int szeroko�� = Toolkit.getDefaultToolkit().getScreenSize().width; //pobieranie szerokosci ekranu
		int wysoko�� = Toolkit.getDefaultToolkit().getScreenSize().height; //pobieranie wysoko�ci ekranu
		
		this.setSize(szeroko��/2, wysoko��/2);	//ustawiamy rozmiar
		
		int szerRamki = this.getSize().width;
		int wysRamki = this.getSize().height;
		
		
		this.setLocation((szeroko�� - szerRamki)/2, (wysoko�� - wysRamki)/2);	// ustawiamy lokacje, �rodek
		
		this.setDefaultCloseOperation(3);
		
	}
	
	
	
	public static void main(String[] args) {

		new centrowanie_ramki().setVisible(true);

	}

}