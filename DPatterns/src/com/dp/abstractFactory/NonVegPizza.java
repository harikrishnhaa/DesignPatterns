package com.dp.abstractFactory;

public class NonVegPizza extends Pizza {
	
	PizzaFactory pizzaFactory;
	
	public NonVegPizza(PizzaFactory nonVegPizzaFactory) {
		// TODO Auto-generated constructor stub
		this.pizzaFactory = nonVegPizzaFactory;
	}

	@Override
	void makePizza() {
		// TODO Auto-generated method stub
		System.out.println("Making Pizza :"+ getName());
		
		pizzaFlavour = pizzaFactory.addPizzaFlavour();
		pizzaTopping = pizzaFactory.addPizzaTopping();
	}

}
