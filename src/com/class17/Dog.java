package com.class17;

public class Dog {

	// attributes/state
	String color, name;
	int year;

	// define behavior,actions
	void jump() {
		// method body
		System.out.println("This Dog can  jump " + name);

	}

	void bark() {
		System.out.println("This Dog can bark " + name);
	}

	void run() {
		System.out.println(" This Dog Can run " + name);
	}

	public static void main(String[] args) {

		Dog dog = new Dog();

		dog.name = "Husky";
		dog.color = " Blak";
		dog.year = 8;

		// behaviors.
		dog.bark();
		dog.jump();
		dog.run();

		Dog dog2 = new Dog();

		dog2.name = "BUlldog";
		dog2.color = " White";
		dog2.year = 5;
		// behaviors
		dog2.bark();
		dog2.jump();
		dog2.run();

		Dog dog3 = new Dog();
		dog3.name = "Labrador";
		dog3.color = "Red";
		dog3.year = 3;
		// behaviors
		dog3.bark();
		dog3.jump();
		dog3.run();

	}
}
