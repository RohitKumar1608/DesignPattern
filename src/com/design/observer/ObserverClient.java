package com.design.observer;

public class ObserverClient {
	
	public static void main(String args[]) {
		PublicFigure pf1= new PublicFigure("Rohit","Roh" );
		PublicFigure pf2= new PublicFigure("Avyaan","AV" );
	
		Follower f1= new Follower("Raj");
		Follower f2= new Follower("Rajat");
		
		pf1.addsubscriber(f1);
		pf1.addsubscriber(f2);
		pf2.addsubscriber(f2);
		
		pf1.tweet("Hi From Rohit");
	}

}
