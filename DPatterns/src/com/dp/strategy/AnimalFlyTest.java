package com.dp.strategy;

public class AnimalFlyTest {

	public static void main(String[] args) {
		
		Animal puppy = new Dog();
		Animal pigey = new Pigeon();
		
		System.out.println("Dog :");
		puppy.tryToFly();
		System.out.println("Pigeon :");
		pigey.tryToFly();
		
		puppy.changeFlyingAbility(new ItFlys());
		System.out.println("Dog :");
		puppy.tryToFly();

	}

}
