package com.class14;

public class StringMinipulationRecap {

	public static void main(String[] args) {
		String str = new String("Hello");
		String str3 = new String("Hello");// to make it true String str3=str; //true 
		System.out.println(str == str3);

		System.out.println("*********");

		String s1 = "Hello";
		String s2 = "Hello";
		System.out.println(s1 == s2);

		System.out.println(str);
		String str2 = str.replaceAll("Hello", "Bye");
		System.out.println(str2);

	}

}