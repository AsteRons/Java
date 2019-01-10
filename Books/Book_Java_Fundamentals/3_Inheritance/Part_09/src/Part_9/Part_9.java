package Part_9;

import java.util.*;
import java.lang.reflect.*;


public class Part_9 {

	public static void main(String[] args) {

		String name;
		
		
		if(args.length > 0) name = args[0];
		else
		{
			Scanner in = new Scanner(System.in);
			System.out.println("Podaj nazwe klasy (np. java.util.Date): ");
			name = in.next();
			
		}
		try {
			
			Class cl = Class.forName(name);
			Class supercl = cl.getSuperclass();
			
			String modifiers = Modifier.toString(cl.getModifiers());
			if(modifiers.length() > 0) System.out.print(modifiers + " ");
			
			System.out.print("klasa " + name);
			
			if(supercl != null && supercl != Object.class) System.out.print("rozszerza klase " + supercl.getName());
			
			
			System.out.print("\n{\n");
			printConstructors(cl);
			System.out.println();
			printMethods(cl);
			System.out.println();
			printFields(cl);
			System.out.println("}");
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		System.exit(0);
	}
	
	
	
	/**
	 * Drukowanie wszystkich konstruktorów klasy
	 * @param cl klasa
	 */
	
	
	public static void printConstructors(Class cl)
	{
		Constructor[] constructors = cl.getDeclaredConstructors();
		
		for (Constructor c : constructors)
		{
			String name = c.getName();
			System.out.print("  ");
			
			String modifiers = Modifier.toString(c.getModifiers());
			if(modifiers.length() > 0) System.out.print(modifiers + " ");
			System.out.print(name + "(");
			
			//Drukowanie typów parametrów
			
			Class[] paramTypes = c.getParameterTypes();
			for (int j = 0; j < paramTypes.length; j++)
			{
				if(j > 0) System.out.print(", ");
				System.out.print(paramTypes[j].getName());

			}
			System.out.println("); ");
		}
		
	}
	
	public static void printMethods(Class cl)
	{
		Method[] metods = cl.getDeclaredMethods();
		
		
		
	}
	
	
	
	
	
	/**
	 * Drukowanie wszystkich pól klas
	 * @param cl klasa
	 */
	
	public static void printFields(Class cl)
	{
		
		Field[] fields = cl.getDeclaredFields();
		
		for(Field f : fields)
		{
			Class type = f.getType();
			String name = f.getName();
			System.out.print("  ");
			
			String modifiers = Modifier.toString(f.getModifiers());
			if(modifiers.length() > 0) System.out.print(modifiers + " ");
			System.out.println(type.getName() + " " + name + ";");
		}
	}


}
