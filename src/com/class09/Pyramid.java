package com.class09;

public class Pyramid {

	public static void main(String[] args) {
		//* 
		// **
		// ***
		// ****
		//*****
		for (int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//1
		//12
		//123
		//1234
		//12345
		for (int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
			System.out.println("$$$$$$$$$$$");
			//1
			//22
			//333
			//4444
			//55555
			//666666
			//7777777
			//88888888
			//999999999
			for (int i1=1; i1<=9; i1++) {
				for(int j=1; j<=i1; j++) {
					System.out.print(i1);
				}
				System.out.println();
	
			}
	}
}
