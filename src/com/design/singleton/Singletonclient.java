package com.design.singleton;

public class Singletonclient {

	public static void main(String args[]) {
		singleton sc= singleton.getInstance();
		System.out.println(sc.toString());
	}
}
