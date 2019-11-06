package com.class13;

public class RegularExpressions {

	public static void main(String[] args) {
		/*
		 * Print only text and numbers
		 */
		String str = "14234Hel45645lo465456";
		System.out.println(str.replaceAll("[0-9]", "")); // leave only text
		System.out.println(str.replaceAll("[a-zA-z]", ""));// leave only numbers14234456454654
		System.out.println("==========");
		
		// Remove everything except text and numbers
		String str2 = "Hi#$%How#$4356346";
		System.out.println(str.replaceAll("[^a-zA-z-z0-9]", ""));
		System.out.println("==========");
		
		

	}

}
