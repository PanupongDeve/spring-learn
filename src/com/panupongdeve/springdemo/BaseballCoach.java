package com.panupongdeve.springdemo;

public class BaseballCoach implements Coach {
	@Override
	public String getDailyWorkout() {
		return "Spend 30 Minutes on batting practice";
	}
}
