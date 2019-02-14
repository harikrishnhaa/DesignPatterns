package com.dp.Observer;

// An observer template on what to be notified when there is an update
public interface Observer {
	
	public void update(double ibmPrice,double aaplPrice,double googPrice);

}
