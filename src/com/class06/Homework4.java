package com.class06;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		//Write a program to find largest of three double values using if-else.
		//if and logical operators provided by a user (numbers must be distinct)

	double d1=30;
	double d2=20;
	double d3=40;
if(d1>=30 || d1<30) {
	System.out.println("The number is medium");
	
}else if(d2>=20 || d2<20){
	System.out.println("The number is small");
	
}else if (d3>40) {
	System.out.println("The number is large");
	}else{
	System.out.println("Invalid");
	}
	}
    }
	
//TASK 2 find the largest number using nested if
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Please enter 3 distinct numbers for Nested If Task");
//​
//		double no1 = scan.nextDouble();
//		double no2 = scan.nextDouble();
//		double no3 = scan.nextDouble();
//​
//		if (no1 > no2) {
//					if (no1 > no3) {//no1>no2 && no1>no3
//						System.out.println("Largest number is first - " + no1);
//					} else {//no1>no2 but no1<no3
//						System.out.println("Largest number is third - " + no3);
//					}
//		} else {//assuming no2>no1
//					if (no2 > no3) {//no2>num1 && no2>no3 --> no2 =largest
//						System.out.println("Largest number is second - " + no2);
//					} else {//no2>no1 but no2<no3
//						System.out.println("Largest number is third - " + no3);
//	  other example 
// if (no1 != no2 || no2 != no3) {
//		if (no1 > no2) {
//			if (no1 > no3) {// no1>no2 && no1>no3
//				System.out.println("Largest number is first - " + no1);
//			} else {// no1>no2 but no1<no3
//				System.out.println("Largest number is third - " + no3);
//			}
//		} else {// assuming no2>no1
//			if (no2 > no3) {// no2>num1 && no2>no3 --> no2 =largest
//				System.out.println("Largest number is second - " + no2);
//			} else {// no2>no1 but no2<no3
//				System.out.println("Largest number is third - " + no3);
//			}
//		}
//} else {
//		System.out.println("Numbers are equal");
//	
//		}
//	}
//
//	}
