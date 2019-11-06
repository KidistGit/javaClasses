package com.class13;

public class ReplaceMethodString {

	public static void main(String[] args) {
		/* replace()
		 *This method returns a new string resulting
		 * from replacing all occurrences of sequences of string
		 * in this string with newCharSequences.
		 */
		String str = "Hello Dear Dan, How are you Dan,  How you been?";
		String str1="12-12-1990";//12/22/1990
		
		System.out.println(str.replace('n', 'z'));
		System.out.println(str1.replace('-', '/'));
		System.out.println(str1.replaceAll("-", "/"));
		
		System.out.println("******");
		System.out.println(str.replace("Dear", "Respected"));
		System.out.println(str.replaceFirst("Dan", "All"));

		
		
		
	}
}