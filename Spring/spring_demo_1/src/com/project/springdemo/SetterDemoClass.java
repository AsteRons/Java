package com.project.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoClass {

	
	
	public static void main(String[] args) {

		//load the spring configuration file
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container

		CricketCoach  theCoach =  context.getBean("myCricketCoach", CricketCoach.class);
		
		//call methods on the bean
		// ... let's come back to his
		
		System.out.println(theCoach.getDailWorkout());
		
		
		System.out.println(theCoach.getDailyFortune());
		
		
		//call our new methods to get the literal values
		
		System.out.println(theCoach.getEmailAddress());
		
		System.out.println(theCoach.getTeam());
		//close the context
		context.close();
		
	}

}
