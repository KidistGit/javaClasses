package com.class29;

public class PhoneTest {

	public static void main(String[] args) {
		// you can not create an object of an abstract class
		// phone phone= new phone(); CE: cannot instanciate
		// we can cerate it indirectilly
		Phone phone = new iphone();
		phone.makeCall();
		phone.sendText();
		phone.takePictures();
		phone.playGames();

	}

}
