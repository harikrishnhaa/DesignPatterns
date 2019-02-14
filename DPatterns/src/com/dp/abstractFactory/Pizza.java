package com.dp.abstractFactory;

public abstract class Pizza {
	
	private String name;
	
	PizzaFlavour pizzaFlavour;
	
	PizzaTopping pizzaTopping;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	abstract void makePizza();
	
	public void orderedPizza(){
		System.out.println(getName()+"with flavour :"+pizzaFlavour+" topping :"+pizzaTopping +"is ordered");
	}
	
	public void pizzaInProgress(){
		System.out.println(getName() +" is getting ready!!");
	}
	
	public void deliverPizza(){
		System.out.println(getName() +"is delivered with flavour :"+pizzaFlavour+" topping :"+pizzaTopping);
	}
	
	public String toString(){
		return "This is a"+getName()+ "with flavour :"+pizzaFlavour+" topping :"+pizzaTopping ;
	}

}
