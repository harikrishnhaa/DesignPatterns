package com.dp.abstractFactory;

public class VegPizzaFactory implements PizzaFactory {

	@Override
	public PizzaFlavour addPizzaFlavour() {
		// TODO Auto-generated method stub
		return new CheeseFlavour();
	}

	@Override
	public PizzaTopping addPizzaTopping() {
		// TODO Auto-generated method stub
		return new CheeseTopping();
	}

}
