package com.dp.strategy;

public class Animal {
	
	//Declaring Fly as an attribute rather than fly or not fly method here
	//Field as an object
	public Fly flyingType;
	
	public void tryToFly(){
		flyingType.fly();
	}
	
	public void changeFlyingAbility(Fly newFlyingType){
		flyingType = newFlyingType;
	}

}
