package com.panupongdeve.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Tody is your lucky day!";
	}

}
