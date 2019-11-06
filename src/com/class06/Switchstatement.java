package com.class06;

public class Switchstatement {

	public static void main(String[] args) {
		/*
		 * 7 weekdays 
		 * if day ==1 Monday 
		 * if day==2 Tuesday
		 * 
		 */
		int day = 6;
		String weekDay;
		
		if (day == 1) {
			weekDay = "Monday";
		} else if (day == 2) {
			weekDay = "Tuesday";
		} else if (day == 3) {
			weekDay = "Wednesday";
		} else if (day == 4) {
			weekDay = "Thursday";
		} else if (day == 5) {
			weekDay = "Friday";
		} else if (day == 6) {
			weekDay = "Saturday";
		} else if (day == 7) {
			weekDay = "Sunday";
		} else {
			weekDay = "Invaid";
		}
		System.out.println(weekDay);
		
		day = 3;

		switch (day) {
		case 1: // day==1 
			weekDay = "Monday";
			break;
		case 2:
			weekDay = "Tuesday";
			break;

		case 3:
			weekDay = "Tuesday";
			break;
		case 4:
			weekDay = "Tuesday";
			break;

		case 5:
			weekDay = "Tuesday";
			break;
		case 6:
			weekDay = "Tuesday";
			break;
		case 7:
			weekDay = "Tuesday";
			break;
		default:
			weekDay = "Invalid";
}
		System.out.println("weekDay");

	}

}
