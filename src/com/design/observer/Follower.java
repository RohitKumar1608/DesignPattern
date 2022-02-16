package com.design.observer;

public class Follower implements Observer{
	
	String name;
	
	public Follower(String name) {
		this.name=name;
	}
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public void notification(String handle,String tweet) {
		System.out.println("Notification received to "+ name+" from Handle"+  " handle" +" Tweet" + tweet );
		
		
	}

}
