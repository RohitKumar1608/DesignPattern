package com.design.observer;

import java.util.ArrayList;
import java.util.List;

public class PublicFigure implements ObervableSubject{
	
	private String name;
	private String handle;
	
	public PublicFigure(String name,String handle) {
		this.name=name;
		this.handle=handle;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHandle() {
		return handle;
	}

	public void setHandle(String handle) {
		this.handle = handle;
	}

	public List<Observer> getLstob() {
		return lstob;
	}

	public void setLstob(List<Observer> lstob) {
		this.lstob = lstob;
	}

	List<Observer> lstob= new ArrayList<Observer>();

	@Override
	public void addsubscriber(Observer observer) {
		// TODO Auto-generated method stub
		lstob.add(observer);
		
	}

	@Override
	public void removesubscriber(Observer observer) {
		// TODO Auto-generated method stub
		lstob.remove(observer);
		
	}

	@Override
	public void notifysubscriber(String tweet){
		// TODO Auto-generated method stub`
		lstob.forEach(observer -> observer.notification(handle, tweet));
		
	}
	
	public void tweet(String tweet) {
		notifysubscriber(tweet);
	}

}
