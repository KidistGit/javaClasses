package com.class10;

public class ArrayDemo {

	public static void main(String[] args) {
		int [] nums=new int[4];

	nums[0]=12;
	nums[1]=13;
	nums[2]=14;
	nums[3]=15;
	//to find # of elements
	System.out.println(nums.length);
	
	                 //0      1       2        3
	String[] array={"Winter","Fall","Summer","Spring"};
	
	//I was born in summer
	System.out.println("I was born in "+array[2]);
	// Array.length will return an integer
	int arraySize=array.length;
	System.out.println(arraySize);
			
	}
	}


