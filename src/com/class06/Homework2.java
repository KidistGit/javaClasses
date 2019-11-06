package com.class06;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		
		
		char grade;
		String student;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter your grade:");
		grade= keyboard.next().charAt(0);
		System.out.println("Please enter the exceplanation");
		student = keyboard.next();
		
		switch (grade) {
		case 'A':
			student ="Excellent";
			break;
		case 'B':
			student="Goood";
			break;
		case 'C':
			student ="Average";
			break;
		case 4:
			student ="Bad";
			break;
		default:
		student ="Not Acceptable";
			}
		System.out.println("Your grade is " + grade +" and you  are doing " + student);
		
	}

}
