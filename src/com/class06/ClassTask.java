package com.class06;

import java.util.Scanner;

public class ClassTask {

	public static void main(String[] args) {
		/* ask user to enter the month they were born
		 * based on the month define the season
		 * if user is born in jan,feb,dec winter
		 * if mar,apr, may spring
		 * if jun,jul,aug fall
		 * otherwise unknown
		 * at the end of the program
		 * at the end of the program
		 * "You were born in"
		 */
	String season;
	
	  Scanner scan=new Scanner(System.in);
	System.out.println("Please enter the month you were born");
	int month=scan.nextInt();

	if(month==1 || month==12) {
		season="Winter";
		
	}else if(month==3 || month==5) {
		season="Spring";
	}else if (month==6 || month==7) {
		season="Fall";
	}else{
		season="Unknown";
	}
	System.out.println("You were born in"+ season);
	System.out.println("Month");
	
	
	
	
	
	}
	

}
