package com.class08;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// print number from 1 to 50 except those that are divisible by 3 
for (int i=1; i<=50; i++) {
	if(i%3==0) {
	continue;	
	}
System.out.println(i);
}
System.out.println("*********");
// Task2
String card;
Scanner scan=new Scanner(System.in);
for (int a=1; a<=10; a++) {
	System.out.println("Are you apply to credit card?");
	card=scan.nextLine();
	if (card.equals("Yes")) {
		break;
	}
			
}
	}

}
