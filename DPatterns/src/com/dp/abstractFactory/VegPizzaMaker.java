package com.dp.abstractFactory;

public class VegPizzaMaker extends PizzaMaker {

	@Override
	protected Pizza buildPizza(String typeOfPizza) {
		// TODO Auto-generated method stub
		
		Pizza newPizza = null;
		
		if(typeOfPizza.equals("veg")){
			PizzaFactory pizzaFactory = new VegPizzaFactory();
			newPizza = new VegPizza(pizzaFactory);
			newPizza.setName("Piping Hot Veg Pizza");
		}else{
			
			
		}
		return newPizza;
	}

}
