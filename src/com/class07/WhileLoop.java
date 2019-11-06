package com.class07;

public class WhileLoop {

	public static void main(String[] args) {

		int time = 8;
		if (time < 12) {// condition is true
			System.out.println("Good morninig"); // code executes 1
		}
		while (time < 12) {// if condition is true
			System.out.println("Good mornining"); // code executes infinitely //infinite loop
			time++;
		}
	// I want to print good Good afternoon 5 times
		int i=1;
		while(i<5) {
			System.out.println("Good afternoon");
			i++;
			
		}
		System.out.println("Outside of while loop");
	
	}

}
