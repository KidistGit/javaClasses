package com.class08;

public class Task01 {

	public static void main(String[] args) {
		// print numbers from 1 to 100 in 1 line with space
		for(int i=1;    i<+100;  i++  ) {
			System.out.print(i+ " ");
		}
		// print numbers from  100 to 1 
for (int i=100;  i>=1;   i--) {
	System.out.println(i);
}
System.out.println("**********");
	// 2 ways print even numbers between 20 and 50 
for (int i=20;  i>=1; i-=2)	{
	System.out.println(i);
	}

	System.out.println("**********");
// print odd numbers between 20 and 2 ways
	for(int a=20;    a<=50; a++) {
		if(a%2!=0) {
			System.out.println(a);
		}
	
	}
	
	
}
	}


