package com.project.springdemo;

public class BaseballCoach implements Coach{

	
	//define a private filed for the dependency
	
	private FortuneService fortuneService;
	
	
	//define a constructor for dependency
	
	
	public BaseballCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}
	

public String getDailWorkout()
{
	return "Spend 30 minutes on batting practice";
}

public String getDailyFortune() {
	
	//use my fortuneService to get a fortune
	
	
	return fortuneService.getFortune();
}
	


}
