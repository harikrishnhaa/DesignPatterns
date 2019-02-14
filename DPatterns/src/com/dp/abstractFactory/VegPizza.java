package com.dp.abstractFactory;

public class VegPizza extends Pizza {
	
	PizzaFactory pizzaFactory;
	
	public VegPizza(PizzaFactory vegPizzaFactory) {
		// TODO Auto-generated constructor stub
		this.pizzaFactory = vegPizzaFactory;
	}

	@Override
	void makePizza() {
		// TODO Auto-generated method stub
		System.out.println("Making Pizza :"+ getName());
		
		pizzaFlavour = pizzaFactory.addPizzaFlavour();
		pizzaTopping = pizzaFactory.addPizzaTopping();

	}

}
