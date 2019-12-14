package com.class11;

public class twodimentionalarrays {

	public static void main(String[] args) {
		//Declare 2D Array
		int [] [] array=new int[3] [4];
		//1st row 
		array [0][0]=44;
		array[0][1]=80;
		array [0][2]=33;
		array[0][3]=20;
	
	//2nd row
		array [1][0]=10;
		array[1][1]=5;
		array [1][2]=7;
		array[1][3]=8;
	//3rd row
		array [2][0]=10;
		array[2][1]=9;
		array [2][2]=70;
		array[2][3]=80;
		System.out.println(array[1][3]);
		// TaskCountries; Create 2d array of string with 2 and 3 columns.
	String [] [] names=new String[2][3];
	
	names [1][0]="Aster";
	names[1][1]="Kidi";
	names [1][2]="Mesi";
	
	System.out.println(names[1][2]);
	System.out.println("************");
	int [] [] numbers= {
			{8,7,5,3,8},
			{1,5,6,4,9,},
			{3,6,8,0,7},
	};
	System.out.println(numbers [1][4]);
	// to identify the numbers of rows 
	System.out.println("The numbers of Rows are:="+numbers.length);
	// to identify the numbers of columns/elements in that row 
		System.out.println("The numbers of columns are:="+numbers[0].length);
		System.out.println("&&&&&&&&&&&&&");
		for(int i=0;i<numbers.length; i++) {
			for (int j=0; j<numbers[i].length; j++) {
				System.out.print(numbers[i][j]+ " ");
			}
			System.out.println();
		}
	}
	

}
