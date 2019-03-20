package com.project.spring.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;




@Component
// @Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//define a default constructor
	
	
	
	public TennisCoach()
	{
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	
	// define my init method
	@PostConstruct
	public void doMyStartupStuff()
	{
		System.out.println(">> TennisCoach: instance of doMyStartupStuff");
	}
	
	
	
	// define my destroy method
	@PreDestroy
	public void doMyCleanupStuff()
	{
		System.out.println(">> TennisCoach: instance of doMyCleanupStuff");
	}
	
	
	
	//define a setter method
	
	/*

	
	@Autowired
	public void setFortineService(FortuneService theFortineService )
	{
		System.out.println(">>TennisCoach: inside setFortineService");
		fortuneService = theFortineService;
	}
	
	
	
	@Autowired
	public void  doSomeCrazyStuff(FortuneService theFortineService )
	{
		System.out.println(">>TennisCoach: inside doSomeCrazyStuff");
		fortuneService = theFortineService;
	}
	
	*/
	
	
	
	/*
	 
	@Autowired
	
	public TennisCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}
	
	*/
	
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
		
		
		
	}


	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
