package com.class16;

public class IQ4 {
	/*
	 * How to find out the part of the string from a String What is Substring? Find
	 * number of words in string
	 */
	public static void main(String[] args) {

		String str = "Today is very cold outside";
		String subString = str.substring(0, 5);
		System.out.println(subString);
		/*
		 * Step1: Split based on the space----- array of string
		 *  Step2: Find the length of an array
		 */
	System.out.println(str);
	String[] words=str.split(" ");
	System.out.println(words.length);
	
	
	
	
	
	}

}
