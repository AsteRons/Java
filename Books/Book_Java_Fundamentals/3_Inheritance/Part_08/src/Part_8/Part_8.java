package Part_8;

import java.util.*;
import java.lang.reflect.*;

public class Part_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



public static void printConstructors(Class cl)
{
	Constructor[] constructors = cl.getDeclaredConstructors();
	
	for(Constructor c : constructors)
	{
		String name = c.getName();
		System.out.println("  ");
		String modifiers = Modifier.toString(c.getModifiers());
		if(modifiers.length() > 0) System.out.print(modifiers + " ");
		System.out.print(name + "(");
		
		//Drukowanie typów parametrów 
	
		Class[] paramTypes = c.getParameterTypes();
		for (int j = 0; j < paramTypes.length; j++)
		{
			
		}
	}
}
}