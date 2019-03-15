package com.project.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {

//load the spring configuration file
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		
// retrieve bean from spring container
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		

		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		
		
// check if they are the same
		
		boolean result = (theCoach == alphaCoach);
		
		
//print out the result
		
		
		System.out.println("\nPointing to the same obejct " + result);
		
		
		
		System.out.println("\n Memory location for theCoach: " + theCoach);
		System.out.println("\n Memory location for theCoach: " + alphaCoach);
		
		
	//close the context
		
		context.close();
		
	}

}
