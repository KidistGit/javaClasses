package com.InterviewQuestion;

public class AlphaCharactersString {

	public static void main(String[] args) {
		// 3 Find out how many alpha characters present in a string?

		String s = "BC+D*E-=";

		for (int i = 0; i < s.length(); i++) {
			char charAt2 = s.charAt(i);

			if (Character.isLetter(charAt2)) {
				System.out.println(charAt2 + "is a alpha");

			}
		}
	
	System.out.println("****************");
	/* 
	 * question number5
	 */
	String str="Java Killers";
	        
	        char[]num=str.toCharArray();
	        
	        for(int i=num.length-1;i>=0;i--) {
	            System.out.print(num[i]);
	        }
	    }
	
	}

