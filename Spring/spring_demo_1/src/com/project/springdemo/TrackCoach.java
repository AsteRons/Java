package com.project.springdemo;

public class TrackCoach implements Coach {
	
	

	private FortuneService fortuneService;
	

	public TrackCoach()
	{
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailWorkout() {
		
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do IT: " + fortuneService.getFortune();
	}

	
	
	// add an init method
	
	public void doMyStartupStuff()
	{
	System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	//add a destroy method
	
	public void doMyCleanupStuffYoYo()
	{
		System.out.println("TrackCoach: inside method doMyStartupStuffYoYo");
	}
	
	
}
