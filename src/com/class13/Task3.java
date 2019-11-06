package com.class13;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * Create a string and print in reverse order(sunday _ yadnus).
		 */
		String day = "Sunday";
		System.out.println(day.charAt(5) + " " + day.charAt(4) + " " + day.charAt(3));
		System.out.println(day.length());
		for (int i = day.length() - 1; i >= 0; i--) {
			System.out.println(day.charAt(i));
			/*
			 * Create a String and if the String is not empty perform the following: if the
			 * String has an odd number of characters and has 3 or more characters, print
			 * the character in the middle of the String.
			 * 
			 * 
			 */
		String str1="Hellourwe";
		int length=str1.length();
		int middle=str1.length()/2;
		
		if(!str1.isEmpty()) {
			if((length%2!=0 && length>=3)){
				System.out.println(str1.charAt(middle));
			}
		}
		
		 int a=5%2;
	        System.out.println("=====");
	        System.out.println(a);
		}

	}

}
