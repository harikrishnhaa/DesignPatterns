package com.dp.abstractFactory;

public abstract class PizzaMaker {
	
	protected abstract Pizza buildPizza(String typeOfPizza);
	
	public Pizza orderPizza(String type){
		Pizza orderedPizza = buildPizza(type);
		
		orderedPizza.makePizza();
		orderedPizza.orderedPizza();
		orderedPizza.pizzaInProgress();
		orderedPizza.deliverPizza();
		
		return orderedPizza;
	}

}
