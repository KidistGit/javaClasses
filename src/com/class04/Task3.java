package com.class04;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner loan=new Scanner(System.in);
		System.out.println("What is the amount of loan is needed");
		int num1=loan.nextInt();
		if (num1<200.000) {
		System.out.println("You would lend the money ");
			
		}else {
			System.out.println("You would reject the client");
			
			}
		System.out.println("********");
		
		Scanner Dmv=new Scanner(System.in);
		System.out.println("You will issue a driver licence to them");
		int num2=Dmv.nextInt();
		if (num2>18) {
			System.out.println("You will issue a driver licence");
			
		}else{
			System.out.println("You can get learners permit");
		}
		System.out.println("********");
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the temperature");
		int temp=scan.nextInt();
		System.out.println("Please enter your city");
		String cityName=scan.nextLine();
		
		int convertedTemp=(temp-32)*5/9;
		System.out.println("The temperarture in city"+cityName+"is"+convertedTemp);
		
		
		

		
		

	}

}

