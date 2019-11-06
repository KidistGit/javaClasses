package com.class08;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		/* let's ask user enter if it is raining or not true or false)
		 * As long as there is rain let's keep asking
		 * As soon as there is no rain___ you can go to the park
		 * 
		 */
	
	Scanner scan=new Scanner (System.in);
	boolean isRain;
	
	do {
	System.out.println("Is it rainining ");
	isRain=scan.nextBoolean();
	
	}while (isRain);
	System.out.println("Go to the park");
	}

}
