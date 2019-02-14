package com.dp.Observer;

public class StockObserver implements Observer {
	
	// observers instance variables
	private double ibmPrice; 
    private double aaplPrice; 
    private double googPrice; 
	
	private static int observerIDTracker = 0;
	
	private int observerID;
	
	//source  is declared as attribute so that it can be used to register an observer
	private Subject stockGrabber;
	
	//source is passed as a parameter( multiple observers can be created for the same source which is sent as parameter)
	public StockObserver(Subject stockGrabber) {
		
		this.stockGrabber = stockGrabber;
		this.observerID = ++ observerIDTracker;
		
		System.out.println("New Observer: "+ this.observerID);
		stockGrabber.register(this);
		
	}

	@Override
	public void update(double ibmPrice, double aaplPrice, double googPrice) {
		// TODO Auto-generated method stub
		this.ibmPrice = ibmPrice;
		this.aaplPrice = aaplPrice;
		this.googPrice = googPrice;
		
		printAllPrices();

	}

	private void printAllPrices() {
		// TODO Auto-generated method stub

		 System.out.println(observerID + "\nIBM: " + ibmPrice + "\nAAPL: " +   
		                aaplPrice + "\nGOOG: " + googPrice + "\n"); 

	}

}
