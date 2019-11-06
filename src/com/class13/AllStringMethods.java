package com.class13;

public class AllStringMethods {

	public static void main(String[] args) {

// one object created for two string code methods.
		// when we created one object we can not fix the object!
		String city = "Fairfax";
		String city1 = "Fairfax";
		System.out.println(city);
		System.out.println(city1);
		System.out.println(city.isEmpty());
		System.out.println(city.length());

		int[] a = { 12, 32, 55, 77 };
		System.out.println(a.length);
		System.out.println(city);

		String city2 = city.toUpperCase();
		System.out.println(city2);

	}

}
