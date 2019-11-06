package com.class09;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {

		int secretNumber, guessNumber;
		Scanner scan = new Scanner(System.in);
		secretNumber = 12;
		do {
			System.out.println("Please guess my number from 1 to 20");
			guessNumber = scan.nextInt();
			if (guessNumber < secretNumber) {
				System.out.println("Your number is too small");
			} else if (guessNumber > secretNumber) {
				System.out.println("The number is too large");
			} else {
				System.out.println("Congratulations!! You got it!");
			}
		} while (guessNumber != secretNumber);

	}
}
