package com.class24;

public class ThisWithConstructor {
	ThisWithConstructor() {
		System.out.println("I am non argument constructor");

	}

	ThisWithConstructor(String str) {
		this();// used to call current class constructor
		System.out.println("I am constructor with l string parameter");
	}

	ThisWithConstructor(String str, String str1) {
		this(str);// always Must be a first statement
		// this(); in this case it is second statement --- compiler error
		System.out.println("I am constructor with 2 parameters");
	}

	public static void main(String[] args) {
		ThisWithConstructor obj = new ThisWithConstructor("Hello");
		// can we execute 2 constructors when cretaing an object
		// yes -- it can be achieved using this()
		// this type of constructor calls is known as CONSTRUCTOR CHAINGING
		ThisWithConstructor obj1 = new ThisWithConstructor("Hello", "Bye");
	}
}
