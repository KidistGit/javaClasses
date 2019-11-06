package com.class11;

public abstract class Recap {

	public static void main(String[] args) {
		int num1=12;
		int num2=14;
		int num3=16;
		int num4=13, num5=50, num6=33; 
		int a,b,c,d;
		a=12;
		b=33;
		//  array declaration
		int [] h=new int [3];
		int e[];
		int y[],u;
		y=new int[3];
		//u=new int [2]; will not compile
		//u=12;
		
		int [] array=new int[6];
		array[0] =33;
		
		int [] numbersList= {2,3,5,7};             
		for (int s=0; s<array.length; s++) {// intalization, Condition and loop body then increment or decrement
		System.out.println(array[s]);
		}
		for (int element:numbersList) {
			System.out.println(element);
		}
		
	}

}
