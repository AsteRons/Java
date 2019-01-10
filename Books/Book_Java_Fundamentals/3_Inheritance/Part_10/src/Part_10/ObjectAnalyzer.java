package Part_10;

import java.lang.reflect.Array;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;


public class ObjectAnalyzer {

	private ArrayList<Object> visited = new ArrayList<>();
	
	/**
	 * Konwertuje obiekty na �a�cuch zawieraj�cy list� wszystkich p�l
	 * @param obj obiekt
	 * @return �a�cuch zawieraj�cy nazw� klasy obiektu oraz nazwy i warto�ci wszystkich p�l
	 * 
	 */
	public String toString(Object obj)
	{
		if(obj == null) return "null";
		if(visited.contains(obj)) return "...";
		visited.add(obj);
		
		Class cl = obj.getClass();
		
		if(cl == String.class) return (String) obj;
		if(cl.isArray())
		{
			String r = cl.getComponentType() + "[]{";
			for(int i = 0; i < Array.getLength(obj); i++)
			{
				if(i > 0) r += ",";
				Object val = Array.get(obj, i);
				if(cl.getComponentType().isPrimitive()) r += val;
				else r += toString(val);
			}
			return r + "}";
		}
	
		String r = cl.getName();
		// Inspekcja p�l klasy i wszystkich nadklas
		
		do
		{
			r += "[";
			Field[] fields = cl.getDeclaredFields();
			AccessibleObject.setAccessible(fields, true);
			
			for(Field f : fields )
			{
				if(!Modifier.isStatic(f.getModifiers()))
				{
					if(!r.endsWith("[")) r += ",";
					r += f.getName() + "=";
					try {
						
						Class t = f.getType();
						Object val = f.get(obj);
						if(t.isPrimitive()) r += val;
						else r += toString(val);
						
					}catch(Exception e)
					{
						e.printStackTrace();
					}
				}
			}
			r += "]";
			cl = cl.getSuperclass();
		
		}while(cl != null);
		
		return r;
	}
	
}
