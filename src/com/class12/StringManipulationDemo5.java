package com.class12;

public class StringManipulationDemo5 {

	public static void main(String[] args) {
		/*
		 * This method check whether a string is empty or not. This method returns true
		 * if the given string is empty,else it returns false.
		 */

		String str = "";
		System.out.println("Is this String empty= " + str.isEmpty());
		String str2 = "Hello";
		System.out.println("Is this String empty= " + str2.isEmpty());
		System.out.println();
		if (!str.isEmpty()) {
			System.out.println("This is not empty");
		} else {
			System.out.println("Is this String empty");
		}
	String sentences="each day has a promise to brighten up the day,\n But first you must allow the sun to";
	System.out.println(sentences);
	System.out.println("*********");
	String str3="Hello  ";
	String str4="World  ";
	String str5="people ";
	System.out.println(str3+str4+str5);
	System.out.println(str3.concat(str4).concat(str5));
	System.out.println("*********");
	/*This method returns a copy of string
	 * with leading and trailing whitespace omitted.
	 */
	String  str6="How are you? ";
	System.out.println(str6.trim());
	/*This method returns the character located at string's specified index.
	 * The string indexes start from zero
	 */
	System.out.println("*********");
	String str7="We might be done early today";
	System.out.println(str7.charAt(3));
	System.out.println("*********");
	/*This method returns the index within this string of the 
	 * first occurrence of the specified character or -1
	 * if the character does not occur
	 */
	String str8="We might mnot be done early";
	System.out.println(str8.indexOf('m'));
	System.out.println(str8.indexOf('m',4));
	}

}
