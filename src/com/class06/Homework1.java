package com.class06;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		String country, language;
		System.out.println("Please enter your country:");
		country = scan.nextLine();
		System.out.println("Please enter your language:");
		language=scan.nextLine();
		
		switch (country) {
		case "USA":
		 language ="English";
			break;
		case "Ethiopia":
		language ="Amharic";
		break; 
		default:
		language ="Invalid";
			
		}
		
		System.out.println("You are from " + country + " and your language " +language);
		
		
		
		
		
		
		
	}

}
