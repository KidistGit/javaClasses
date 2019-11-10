package com.class17;

public class Phone {
// attributes/state
	String color, model, brand;
	int size, memory;

	// define behavior,actions
	void call() {
		// method body
		System.out.println("I can call on my " + brand);

	}

	void text() {
		System.out.println("I can text on my " + brand);
	}

	void takePictures() {
		System.out.println("I can take picture on my " + brand);
	}

	public static void main(String[] args) {

		Phone ph = new Phone();

		ph.brand = "iphone";
		ph.color = " Blak";
		ph.size = 9;
		ph.memory = 32;
		// behaviors.
		ph.call();
		ph.text();
		ph.takePictures();

	}
}
