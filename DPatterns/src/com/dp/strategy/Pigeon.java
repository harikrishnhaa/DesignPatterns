package com.dp.strategy;

public class Pigeon extends Animal {
	
	public Pigeon(){
		flyingType = new ItFlys();
	}

}
