package com.dp.abstractFactory;

public class PizzaStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PizzaMaker pizzaMaker = new VegPizzaMaker();
		Pizza vegPizza = pizzaMaker.orderPizza("veg");
		System.out.println(vegPizza);
		
		PizzaMaker nvpizzaMaker = new NonVegPizzaMaker();
		Pizza nonVegPizza = nvpizzaMaker.orderPizza("nonVeg");
		System.out.println(nonVegPizza);
	}

}
