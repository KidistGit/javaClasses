package com.class16;

public class IQ6 {
	/* Write a Java Program to find whether a String is palindrome or not?
	 * if reversed string and Original string are same-- string is palindrome 
	 * 
	 */
	public static void main(String[] args) {
		String orginal="kayak";
		String reversed="";
		//5-1=4=1
		for (int i=orginal.length()-1;i>=0;i--) {
			reversed=reversed+orginal.charAt(i);//""+k=k+a=ka+k
		}
		System.out.println(reversed);
		if(orginal.equals(reversed)) {
			System.out.println("String is palindrome");
			}else{
				System.out.println("String is NOT palindrome");	
			}

	}

}
