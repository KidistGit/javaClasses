package com.class14;

public class Task1 {

	public static void main(String[] args) {
		/*Create a String that will hold a sentence. 
		 * Write a program to get a new String without any spaces.
	     */
		String str=" Hello ";
		System.out.println(str.trim());
		 //Task2
		//Create a String that should be combination of letters, numbers and special characters. 
		//Find out how many alpha characters are there in the String.
    String str1="Hell234233049o^&*^&*$%$";
     System.out.println(str1.replaceAll("[0-9]", ""));
      String []array2=str1.split(" ",3);
		System.out.println(array2.length);
		
		       //Task1
		//You have a String a="Is it Saturday? Is it raining? 
		//Do we have a Java Class today?" 
		//How would you find out how many sentences are in that String?
		
		String str2="It is Saturday?, Is it raining?,Do you have a Java class today?";
		
		System.out.println(str2.length());
      
	}

}
