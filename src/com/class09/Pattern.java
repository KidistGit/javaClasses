package com.class09;

public class Pattern {

	public static void main(String[] args) {
		for (int k=1; k<=5; k++) { // rows
			for (int l=1; l<=5; l++) {// column
				System.out.println("*");
			}
		}
		System.out.println("*********");
	// ****** rows outer loop
    // ******
	// ******
    // ******
		for (int i=1; i<=4; i++) {
			for (int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	System.out.println("&&&&&&&&&&&");
	// ******* column inner loop
    // *******
	// *******
    // *******
	// *******
	for (int i=1; i<=5; i++) {
		for (int j=1; j<=7; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println("&&&&&&&&&&&");
	/* 12345
	 * 12345
	 * 12345
	 * 12345
	 */
	for (int i=1; i<5; i++) {
		for (int j=1; j<6; j++) {
			System.out.print(j);
		}
		System.out.println();
	}
	//print 
	/* 11111
	 * 22222
	 * 33333
	 * 44444
	 * 55555
	 * 
	 */
	System.out.println("------------");
	for (int i=1; i<=5; i++) {
		for (int j=1; j<=5; j++) {
			System.out.print(i);
		}
		System.out.println();
	}
	
	/*123456789
	 * 123456789
	 * 123456789
	 * 123456789
	 * 123456789
	 */
	System.out.println("------------");
	for (int i=1; i<9; i++) {
		for (int j=1; j<5; j++) {
			System.out.print(i);
		}
		System.out.println();
	}
	}
}
