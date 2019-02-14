package com.dp.Observer;

public class GrabStocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaring Stock Source
		StockGrabber stockGrabber = new StockGrabber();
		
		//Registering first observer in the source
		StockObserver observer1 = new StockObserver(stockGrabber);
		
		//Changes in the price intimates the observers(here Observer 1 alone)
		stockGrabber.setIBMPrice(324.00);
		stockGrabber.setGOOGPrice(634.50);
		stockGrabber.setAAPLPrice(207.57);
		
		//Registering second observer in the source
		StockObserver observer2 = new StockObserver(stockGrabber);
		
		//Changes in the price intimates the observers(here Observer 1 and 2)
		stockGrabber.setIBMPrice(343.00);
		stockGrabber.setGOOGPrice(624.50);
		stockGrabber.setAAPLPrice(234.57);
		
		// Removing observer2 from the source
		stockGrabber.unregister(observer2);
		
		//Changes in the price intimates the observers(now Observer 1 alone)
		stockGrabber.setIBMPrice(245.54);
		stockGrabber.setGOOGPrice(346.75);
		stockGrabber.setAAPLPrice(464.23);
		
		

	}

}
