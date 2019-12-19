package com.class38;

public class ThrowKeyWord2 {

	public static void main(String[] args) {

	}

	// Cerate a method that will check if user is older than 18
	// if not then we wan to show an exception
	public static void checkAge(int age) {
		if (age >= 18) {
			System.out.println("You can get driver license");
		} else {
			throw new RuntimeException("You must be older than 18");
		}
	}

}
