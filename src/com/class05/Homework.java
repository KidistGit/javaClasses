package com.class05;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		int  quiz ;
		int muidterm;
		int finalGrade;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the quiz");
		int average1=scan.nextInt();
		System.out.println("PLease enter the midterm");
		int average2=scan.nextInt();
		System.out.println("Please enter the finalGrade");
		int average=scan.nextInt();
		int num=100;
	if(average>=90) {
		System.out.println("A");
		
	}else if(average>=70 && average<90) {
		System.out.println("B");
		
	}else if(average<=50 && average<70){
		System.out.println("C");
		
	}else if (average<50) {
		System.out.println("F");
		
	}else{
		System.out.println("Invalid average");
		
	}
		boolean isRain=true;
		if(!isRain) {
			System.out.println("In Class");
			
		}else{
			System.out.println("Online");
		}

	}

}
