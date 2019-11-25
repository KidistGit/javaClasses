package com.class21;

public class Forest {
public String color;
public int speed;
public static int  numbeOfWoves,numberOfFoxes,numberOfBears;
	public static void main(String[] args) {
		
		Forest s1=new Forest();
		 s1.color= "White";
		   s1.speed=50;
		  Forest.numbeOfWoves=5;
		
		  Forest s2=new Forest();
		    s2.color ="Black";
		    s2.speed=10;
		    Forest.numberOfFoxes=10;
		    
		    Forest s3=new Forest();
		    s3.color="Brown";
		    s3.speed=7;
		    Forest.numberOfBears=3;
		    
		    
System.out.println("The total number of Wolves "+Forest.numbeOfWoves );
System.out.println("the total number of Wolves"+Forest.numberOfFoxes);
System.out.println("The total number of Wolves"+Forest.numberOfBears);
		
		
	}

}
