package com.panupongdeve.springdemo;

public class RovCoach implements Coach {

	private FortuneService fortuneService;
	

	public RovCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "play ROV 2hr.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return this.fortuneService.getFortune();
	}

}
