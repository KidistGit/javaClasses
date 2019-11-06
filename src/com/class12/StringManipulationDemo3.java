package com.class12;

public class StringManipulationDemo3 {

	public static void main(String[] args) {

		/*
		 * .contains();
		 */

		String sentence = "It was raining";
		String sen = "raning";
		System.err.println(sen.contains(sentence));
		System.out.println(sentence.contains("was"));
		// create two strings and initialize them with some value.
		// implement the following methods on those strings.
		/*
		 * sen.length(); 
		 * sen.equals();
		 * sen.contains(s); 
		 *  sen.toUpperCase();
		 * sen.toLowerCase(); 
		 * sen.equalsIgnoreCase(anotherString);
		 */
		//sen.length();
		String name = "Jack";
		System.out.println(name);
		System.out.println("The length of name is= " + name.length());
		//sen.toLowerCase();
		String str1 = "This Is Beautful woRld";
		System.out.println("Before:: " + str1);
		str1 = str1.toLowerCase();
		System.out.println("After:: " + str1);
         //sen.toUpperCase();
		String str3 = "Kidst";
		System.out.println("Before :: " + str3);
		str3 = str3.toUpperCase();
		System.out.println("After:: " + str3);
		//sen.contains(s);
	String sentence1= "To day is Sunday";
	System.out.println(sen.contains("Is"));
	//sen.equals();
	String str4="HElLo WoRld";
	boolean isEqual=str4.equals(str4);
    System.out.println(isEqual);
    System.out.println(str1.equalsIgnoreCase(str4));
	
	}

}
