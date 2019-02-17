package part_02;

import javax.swing.*;
import java.awt.*;

public class Kropelka {

	
	int x = 0;
	int y = 0;
	
	int dx = 1;
	int dy = 1;
	
	int xKropelki = kropelka.getWidth(null);
	int yKropelki = kropelka.getHeight(null);
	
	
	
	public static Image kropelka = new ImageIcon("kropelka.gif").getImage();
	
	public static Image getImg()
	{
		return Kropelka.kropelka;
	}

	
	public void ruszKropelka(JPanel pojemnik)
	{
		Rectangle granicePojemnika = pojemnik.getBounds();
		
		x += dx;
		y += dy;

		
		
		if( y + yKropelki >= granicePojemnika.getMaxY())
		{
			y = (int)(granicePojemnika.getMaxY() - yKropelki);
			dy = - dy;

		}
		
		if(x + xKropelki >= granicePojemnika.getMaxX())
		{
			x = (int)(granicePojemnika.getMaxY() - xKropelki);
			dx = - dx;
		}

		if(y < granicePojemnika.getMinY())
		{
			y = (int)granicePojemnika.getMinY();
			dy = -dy;
		}
		
		
		
		if(x < granicePojemnika.getMinY())
		{
			x = (int)granicePojemnika.getMinX();
			dx = -dx;
		}
		
		
		
	}
	
	
}
