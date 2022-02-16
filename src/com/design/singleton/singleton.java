package com.design.singleton;

/*
 * 
 * 
 * Creation design pattern
 * 
 * Constructor to be private
 * static object for the class
 * null check before the synchronized block
 * synchronized block for applying critical section
 * 
 * 
 * 
 * 
 * 
 */

public class singleton {

	private static singleton sc = null;

	private singleton() {

	}

	public static singleton getInstance() {

		if (sc == null) {
			synchronized (singleton.class) {
				if (sc == null) {
					sc = new singleton();
				}
			}
			
		}
		return sc;
	}

}
