package com.dp.Observer;

import java.util.ArrayList;

// Stock Source class which implements Subject interface
public class StockGrabber implements Subject {
	
	//Here observer is kept as an attribute to add observers tracking this StockSource
	private ArrayList<Observer> observers; 
	
	//stock source instance variables 
    private double ibmPrice; 
    private double aaplPrice; 
    private double googPrice; 
    
    // Observers list is initialized for each stock source instance
    public StockGrabber(){  
        observers = new ArrayList<Observer>(); 
 
    } 

    // To register an observer in source
    @Override
	public void register(Observer newObserver) {
		// TODO Auto-generated method stub
    	observers.add(newObserver);
		
	}



    // To unregister an observer in source
	@Override
	public void unregister(Observer existingObserver) {
		// TODO Auto-generated method stub
		int observerIndex = observers.indexOf(existingObserver);
		System.out.println("Observer "+(observerIndex+1)+" is removed");
		observers.remove(observerIndex);
		
	}
	
	//To notify registered observers in terms of any changes
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(Observer ob: observers){
			ob.update(ibmPrice, aaplPrice, googPrice);
		}

	}


	// Changes in stock source instance variable inturn calls the notifyObserver which inturn calls the observer notification method(update)
	public void setIBMPrice(double newIBMPrice){ 
        this.ibmPrice = newIBMPrice; 
        notifyObserver();  
    } 

    public void setAAPLPrice(double newAAPLPrice){ 
        this.aaplPrice = newAAPLPrice; 
        notifyObserver();  
    } 

    public void setGOOGPrice(double newGOOGPrice){ 
        this.googPrice = newGOOGPrice;  
        notifyObserver(); 
 
    } 


}
