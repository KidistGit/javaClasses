package com.class15;

public class IQ1 {
	/*
	 * Write a program to swap 2numbers with out a temporary variable? Swap 2
	 * Strings without a temporary variable?
	 */
	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		a = a + b;// 30
		b = a - b;// 30=20
		a = a - b;// 30=20
		System.out.println("The value of =" + a);
		System.out.println("The value of =" + b);

		String str1 = "Hello";
		String str2 = "Welcome";// 7

		str1 = str1 + str2;// HelloWelcome---12
		str2 = str1.substring(0, str1.length() - str2.length());// Hello
		str1 = str1.substring(str2.length());
		System.out.println("The value of str1=" + str1);
		System.out.println("The value of str2=" + str2);
	}

}
