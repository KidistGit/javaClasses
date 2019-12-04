package com.class29;

public abstract class Phone {
// Implemented methods
	public void makeCall() {
		System.out.println("Make call");
	}

	public void sendText() {
		System.out.println("Send text");
	}

	// Unimplemented methods
	public abstract void takePictures();

	public abstract void playGames();
}

// Concrete class 
class iphone extends Phone {
	@Override
	public void takePictures() {
		System.out.println("iphone takes pictures");

	}

	@Override
	public void playGames() {
		System.out.println("Play games on iphone");
	}
}