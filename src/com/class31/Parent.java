package com.class31;

public class Parent {
	static void hello() {
		System.out.println("Hello form supper class");
	}
}

class Child extends Parent {
	static void hello() {
		System.out.println("Hello form child class");
	}
}