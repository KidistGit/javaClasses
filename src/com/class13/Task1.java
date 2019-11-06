package com.class13;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner Scanner=new Scanner (System.in);
		System.out.println("Enter your class day:: ");
		String day=Scanner.nextLine();
		if (day.trim().toLowerCase().equals("Saturday")) {
			System.out.println("Saturday is your Java class");
			
		}else if(day.toLowerCase().equals("Sunday")){
			System.out.println("Sunday is your Git Class");
			
		}else if (day.trim().toUpperCase().equals("TUSEDAY")){
			System.out.println("Tuseday is your SDLC class");
			
		}else if(day.trim().toLowerCase().equals("Thursday")){
			System.out.println("Thursday is your Manual Testing class");
			
		}else{
			System.out.println("Envalid Entry!! Please enter a vaild class day");
		}
		Scanner.close();
		

	}

}
