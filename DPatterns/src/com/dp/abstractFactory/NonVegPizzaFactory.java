package com.dp.abstractFactory;

public class NonVegPizzaFactory implements PizzaFactory {

	@Override
	public PizzaFlavour addPizzaFlavour() {
		// TODO Auto-generated method stub
		return new ChickenFlavour();
	}

	@Override
	public PizzaTopping addPizzaTopping() {
		// TODO Auto-generated method stub
		return new ChickenTopping();
	}

}
