package com.class16;

public class IQ5 {
	/*
	 * Write a java program to reverse String? Reverse a string word by word?
	 * Reverse a string word by word
	 */
	public static void main(String[] args) {
	//Reverse a string word by word
		String given="Welcome to the java class";
		/* to reverse string
		 * split();
		 * Step1:Split --- array of string
		 * Step2: use for loop and use decrement to print values
		 */
		String reversed="";
		String []str=given.split("\\s");
		for (int j = str.length- 1; j >= 0; j--) {
			reversed = reversed + str[j]+ " ";
			
		}
		
		System.out.println(reversed);
   // Write a java program to reverse string
   // toChararray();charAt();
		
		String given1="Today is Java class";
		char [] charArray=given1.toCharArray();
		for(int i=charArray.length-1; i>=0;i--) {
			System.out.println(charArray[i]);
			
		}
		System.out.println("Using charAt");
		String word3="I love Java";
		String reversed2=" ";
		for(int i= word3.length()-1; i>=0;i--) {
			System.out.print(word3.charAt(i));
			
			
			
		}
		

	}

}
