package com.classes05;

import java.util.Scanner;

public class LogicalAndScanner {

	public static void main(String[] args) {
		/* ask user to enter age
		 * if age is from 1 to 3 _ you are a baby
		 * if age from 3-5 you are toddler 
		 * if age from 5-12 you are a kid
		 * if age from 12-19 teenager  
		 * if age >20 you are an adult
		 */
	int age;
	Scanner scan;
	
	 scan=new Scanner(System.in);
	 System.out.println("Please enter  your age");
	 age= scan.nextInt();
	if (age>=1 &&age<=3) {
		System.out.println("You are a babay");
		
	}else if(age>3 && age<=5) {
	System.out.println("You are a toddler");
	
		
	
		}else if(age>5 && age<=12){
			System.out.println("You are a teenager");
		}else if (age>19 ){
			System.out.println("You are an adult");
			
		}else {
			System.out.println("Invalid age entered");
			
		}
	
	System.out.println("You are a human");
	
	
	
	
	}

}
