package com.dp.factory;

//factory class
public class PizzaFactory {
	//factory method
	public  static Pizza orderPizza(String type){
		Pizza p = null;
		if(type.equalsIgnoreCase("Cheese"))
			p = new CheesePizza();
		else
			p = new ChickenPizza();
		
		return p;
		
	}

}
