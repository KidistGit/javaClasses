package com.class12;

public class StringManipulationDemo4 {

	public static void main(String[] args) {
		/*
		 * This method tests if this String ends with
		 * The specified prefix beginning
		 */
		String str2="It is  very hot in the class";
System.out.println("Is this string starts with="+str2.startsWith("It"));
System.out.println("Is this string starts with="+str2.startsWith("Is",3));
System.out.println("********");
/*
 * This method tests if this String ends with
 * The specified suffix
 */
System.out.println("Is this ends starts with="+str2.endsWith("class"));
	}

}
