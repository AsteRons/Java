package com.project.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanDemoApp {

	
	
	
	public static void main(String[] args) {

		
		//	load spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		// 	retrieven bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);

		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		
		//check if the are the same
		
		boolean result = (theCoach == alphaCoach);
		
		//print out the results
		
		System.out.println("\nPinting to the same object: " + result);
		
		
		System.out.println("\nMemory location for theCoach: " + theCoach);
		
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach);
		
		// close the context
		context.close();
		
		
		
	}

}
