package com.design.Factory;

public class FactoryPattern {
	
	public car getInstance(String type) {
		
		if(type.equalsIgnoreCase("Sedan"))
			return new Sedan();
		else
			return new sports();
		
	}
	
	

}
