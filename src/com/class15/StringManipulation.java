package com.class15;

public class StringManipulation {

	public static void main(String[] args) {

		// String class comes in java lang package
		// 2 Ways to create a string
		// First way using string literal
		String str = "Hello";
		// Second way using new keyword ---creating a string object
		String str1 = new String("hello");
		System.out.println(str);
		System.out.println(str1);
		// find the number of characters inside the string
		int length = str.length();
		System.out.println(length);
		// case conversation methods/functions
		str = str.toLowerCase().toUpperCase();// HELLO
		System.out.println(str);// hello
		// verify if there if the string is Empty
		String myString = "";// empty value
		boolean isEmpty = myString.isEmpty();
		System.out.println(isEmpty);

		String myString1 = null;// no value at all it is equal to
		// string myString1;
		// System.out.println(myString1.isEmpty());

		// how to verify existence of characters in the string
		String a = "Good evening students";
		boolean exist = a.contains("students");
		System.out.println(exist);

		System.out.println(a.startsWith("Good"));
		System.out.println(a.endsWith("students"));

	}

}
