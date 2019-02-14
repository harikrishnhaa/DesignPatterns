package com.dp.singleton;

import java.io.Serializable;

public class SingleUtil implements Serializable,Cloneable{
	
	// to maintain same object throughout the application
	private static SingleUtil utilInstance;
	
	//to avoid creating new objects from other class, we made it as private.
	private SingleUtil(){
		
	}
	
	//static method to create singleton object.
	public static SingleUtil getInstance(){
		//double check- not to acquire lock until needed
		if(utilInstance == null){	
			//to avoid multiple thread accessing
			synchronized (SingleUtil.class) {
				if(utilInstance == null){
					utilInstance = new SingleUtil();
				}
			}
		}
		
		return utilInstance;
	}
	
	protected Object readResolve(){
		return utilInstance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		//super.clone();
		return utilInstance;
	}

}
