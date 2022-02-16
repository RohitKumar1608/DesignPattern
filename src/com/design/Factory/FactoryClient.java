package com.design.Factory;

public class FactoryClient {
	
	public static void main(String args[]) {
		FactoryPattern fp = new FactoryPattern();
		fp.getInstance("Sedan").make();
		fp.getInstance("sports").make();
	}

}
