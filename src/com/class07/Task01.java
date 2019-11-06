package com.class07;

public class Task01 {

	public static void main(String[] args) {
		/*
		 * create a boolean variable workDay and assign true create int variable day and
		 * assign to 1 As long as it is workDay print "I need a day off " and increase
		 * day Once day is 6 print "i do not need a day off any more'
		 */
		boolean workDay = true; //initialization or assign the variable;
		int day = 1;
		while (workDay) {
			
			if (day == 6) {
				workDay = false;
				System.out.println("I do not need a day off any more");
				
			}else {
			
			System.out.println("I need a day off");
			}
			day++;

		}

	}

}
