package com.class10;

public class Task1 {

	public static void main(String[] args) {
		char[] grades = new char[6];
		grades[0] = 'A';
		grades[1] = 'B';
		grades[2] = 'C';
		grades[3] = 'D';
		grades[4] = 'E';
		grades[5] = 'F';
		System.out.println(grades[1]);
	

		String[] names = new String[4];
		names[0] = "Mesi";
		names[1] = "Danz";
		names[2] = "Jack";
		names[3] = "Kidist";
		System.out.println(names[3]);
		
		String[] words=new String[4];
		words[0]="Java";
		words[1]="Saturday";
		words[2]="Day";
		words[3]="Coding";
		//Saturday is Java coding day
		
		System.out.println(words[1] +" is " +words[0] +" " +words[3]+ " "  +words[2]);

	}

}
