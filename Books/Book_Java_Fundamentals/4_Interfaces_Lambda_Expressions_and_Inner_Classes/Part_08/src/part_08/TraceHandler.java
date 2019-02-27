package part_08;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 
 * @author Maciek
 *
 *Obiekt obs³uguj¹cy wywo³anie, który drukuje nazwê 
 *metody i parametry a nastêpnie wywo³uje orginaln¹ metode
 *
 */


public class TraceHandler implements InvocationHandler {

	
	private Object target;
	
	public TraceHandler(Object t)
	{
		target = t;
	}
	
	
	
	public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {
		
		// Drukowanie argumentu niejawnego
		System.out.print(target);
		
		// Drukowanie nazwy metody
		
		System.out.print("." + m.getName() + "(");
		
		//Drukowanie argumentów jawnych
		
		if(args != null)
		{
			for(int i = 0; i < args.length; i++)
			{
				System.out.print(args[i]);
				if ( i < args.length - 1)
					System.out.print(", ");
			}
		}
		System.out.println(")");
		
		return m.invoke(target, args);
	}

}
