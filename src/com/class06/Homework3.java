package com.class06;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		
		// HomeWork: Using scanner class create calculator. 
		//Allow user to enter 2 numbers and operator(+,-,*,/). 
		//Based on operator provide the result to user.
	
	
		int num1=30, num2=25;
		String result;
		char op;
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter first number");
		num1 =scan.nextInt();
		System.out.println("Please enter second number");
		num2 =scan.nextInt();
		
		switch(num1) {
		case '*':
			result="30+25";
			break;
		case 2: 
			result="30-25";
		case 3:
			result="30*25";
			break;
		case 4:
			result="30/25";
			default:
				result="Invalid";
				
		}
		
		System.out.println(" Your number is " +num1+" the result is" +result);
		
		
//		int num1, num2, total = 0;
//        char op;
//        System.out.println("Please enter first number");
//        num1 = scan.nextInt();
//        System.out.println("Please enter operator");
//        op = scan.next().charAt(0);
//        System.out.println("Please enter the second number");
//        num2 = scan.nextInt();
//        switch (op) {
//        case '*':
//            total = num1 * num2;
//            break;
//        case '/':
//            total = num1 / num2;
//            break;
//        case '+':
//            total = num1 + num2;
//            break;
//        case '-':
//            total = num1 - num2;
//            break;
//        default:
//            System.out.println("Wrong operator");
//        }
//        System.out.println(total);
		
	
	}

}
