package com.dp.factory;

public class PizzaStore {
	
	/*public  static Pizza orderPizza(String type){
		Pizza p = null;
		if(type.equalsIgnoreCase("Cheese"))
			p = new CheesePizza();
		else
			p = new ChickenPizza();
		
		p.prepare();
		p.bake();
		p.cut();
		return p;
		
	}*/
	
	public static void main(String[] args) {
		Pizza p1 = PizzaFactory.orderPizza("cheese");
		Pizza p2 = PizzaFactory.orderPizza("chicken");
		
		p1.prepare();
		p2.bake();p1.cut();
	}

}
