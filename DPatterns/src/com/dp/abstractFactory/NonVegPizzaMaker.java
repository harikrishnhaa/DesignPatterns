package com.dp.abstractFactory;

public class NonVegPizzaMaker extends PizzaMaker {

	@Override
	protected Pizza buildPizza(String typeOfPizza) {
		// TODO Auto-generated method stub
		Pizza newPizza = null;
		
		if(typeOfPizza.equals("nonVeg")){
			PizzaFactory nonVegPizzaFactory = new NonVegPizzaFactory();
			newPizza = new NonVegPizza(nonVegPizzaFactory);
			newPizza.setName("Chicken Nonveg Pizza");
		}else{
			
		}
		 
		return newPizza;
	}

}
