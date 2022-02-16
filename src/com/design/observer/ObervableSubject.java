package com.design.observer;


public interface ObervableSubject {
	
	public void addsubscriber(Observer observer);
	public void removesubscriber(Observer observer);
	public void notifysubscriber(String tweet);

}
