package com.class17;

public class Computer {
	// define attributes/features
	String brand, name;
	boolean keyboard, mouse;
	int screen, memory;

	// define behavior,actions
	void playGames() {
		// method body
		System.out.println("I can play on my " + name);

	}

	void javaCoding() {
		System.out.println("I can do java coding on my " + name);
	}

	void watchMovie() {
		System.out.println("I can watch movie on my " + name);
	}
///////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void main(String[] args) {
		Computer comp1 = new Computer();
		comp1.brand = "Apple";
		comp1.name = "MacBook Pro";
		comp1.keyboard = true;
		comp1.mouse = true;
		comp1.screen = 15;
		comp1.memory = 250;

		System.out.println("I have " + comp1.brand+" "+comp1.name);
		comp1.javaCoding();
		comp1.watchMovie();
		
		System.out.println("Creating 2 object of a computer");
		Computer computer2=new Computer();
		computer2.brand = "Dell";
		computer2.name = "420";
		computer2.memory = 125;
		
		computer2.javaCoding();
		computer2.watchMovie();
		computer2.playGames();
		

			
		
		
		
		
	}
}
