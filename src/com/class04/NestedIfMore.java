package com.class04;

public class NestedIfMore {

	public static void main(String[] args) {
		/*
		 * check age, if age is less than 16 you are too young to drive otherwise you
		 * are eligible to drive and we will check if you are older than 18 you can get
		 * driver license and if not you can get driver permit
		 */
		int age = 55;
		if (age < 16) {
			System.out.println("You are too young to drive");

		} else {
			System.out.println("You are eligible to drive");
			
			if (age>18) {
				System.out.println("You can drive alone");
				
			}else {
				System.out.println("You need your parents to drive");
				
			}
			
			}
		
		System.out.println("---------------");
		/* we need to check if student completed the quiz
		 * if yes good job, if not not good 
		 * if they completed we will check error
		 * if more than 90 you will got an A
		 * if more than 80 you will got an B
		 * anything below you should study more*/
		boolean quiz=false;
		int score =90;
		if(quiz) {
			System.out.println("Good job");
			
			if(score>=90) {
				System.out.println("You got an A");
			}else if (score>=80) {
				System.out.println("You got an B");
				}else {
					System.out.println("You should study more");
				}
			
		}else {
			System.out.println("Not good!!!");
			
		}
	}

}
